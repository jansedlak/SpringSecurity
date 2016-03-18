package service;

import configuration.SecurityConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jan.sedlak on 3/18/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SecurityConfig.class})
public class TestRun {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Test
    @WithMockUser(username = "jan", password = "abc123")
    public void addUser() {
        userService.addUser();
    }
}
