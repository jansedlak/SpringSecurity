package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import service.UserService;

/**
 * springSecurity
 * Created by his majesty jansedlakMBp on 17/03/16.
 */

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
@ComponentScan(basePackageClasses={UserService.class})
public class SecurityConfig {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("jan").password("abc123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");
    }
}
