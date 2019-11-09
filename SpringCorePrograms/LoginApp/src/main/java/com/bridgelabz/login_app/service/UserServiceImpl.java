package com.bridgelabz.login_app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.login_app.dao.UserDao;
import com.bridgelabz.login_app.model.Login;
import com.bridgelabz.login_app.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}