package cn.mtoke.dao;

import cn.mtoke.domain.User;

public interface UserDao {
	/**
	 * ��ԃ�Ñ�
	 * @param username
	 * @return
	 */
	public User findUserByName(String username);
	/**
	 * �����Ñ�
	 * @param user
	 */
	public void insertUser(User user);
}
