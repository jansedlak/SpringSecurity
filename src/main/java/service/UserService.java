package service;


import model.User;

/**
 * Created by jan.sedlak on 3/18/2016.
 */
public interface UserService {

    User findById(int id);

    User findBySso(String sso);
}
