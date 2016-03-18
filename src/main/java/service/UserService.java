package service;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by jan.sedlak on 3/18/2016.
 */
public interface UserService {

    @PreAuthorize("hasRole('USER')")
    void addUser();
    @PreAuthorize("hasRole('USER')")
    int getUserId();
}
