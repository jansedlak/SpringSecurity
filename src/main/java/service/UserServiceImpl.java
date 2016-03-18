package service;

import model.User;
import org.springframework.stereotype.Service;

/**
 * Created by jan.sedlak on 3/18/2016.
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    public User findById(int id) {
        return null;
    }

    public User findBySso(String sso) {
        return null;
    }
}

