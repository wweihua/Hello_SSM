package cn.mtoke.dao;

import cn.mtoke.domain.User;

public interface UserDao {
	/**
	 * 查詢用戶
	 * @param username
	 * @return
	 */
	public User findUserByName(String username);
	/**
	 * 插入用戶
	 * @param user
	 */
	public void insertUser(User user);
}
