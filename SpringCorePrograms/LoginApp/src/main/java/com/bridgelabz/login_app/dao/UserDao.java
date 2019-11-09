package com.bridgelabz.login_app.dao;

import com.bridgelabz.login_app.model.Login;
import com.bridgelabz.login_app.model.User;

public interface UserDao {

	void register(User user);

	User validateUser(Login login);
}