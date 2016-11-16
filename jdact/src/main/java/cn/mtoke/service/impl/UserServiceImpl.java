package cn.mtoke.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mtoke.dao.UserDao;
import cn.mtoke.domain.User;
import cn.mtoke.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 用户验证
	 */
	public User checkLogin(String username, String password) {
		User user = userDao.findUserByName(username);
		if(user != null && user.getPassword().equals(password)){
		return user;
		}
		return null;
	}

}
