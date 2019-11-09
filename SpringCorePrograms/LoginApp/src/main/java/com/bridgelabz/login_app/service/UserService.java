package com.bridgelabz.login_app.service;

import com.bridgelabz.login_app.model.*;

public interface UserService {

	void register(User user);

	User validateUser(Login login);
}