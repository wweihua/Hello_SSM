package cn.mtoke.service;

import cn.mtoke.domain.User;

public interface UserService {
	public User checkLogin(String username, String password);
}
