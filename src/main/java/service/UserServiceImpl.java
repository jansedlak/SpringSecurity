package service;

import org.springframework.stereotype.Service;

/**
 * Created by jan.sedlak on 3/18/2016.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("User was added.");
    }

    public int getUserId() {
        System.out.println("Id 1 returned.");
        return 1;
    }
}
