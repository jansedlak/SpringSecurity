package dao;

import model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

