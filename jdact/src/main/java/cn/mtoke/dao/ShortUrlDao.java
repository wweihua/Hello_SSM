package cn.mtoke.dao;

import cn.mtoke.domain.ShortUrl;


public interface ShortUrlDao {
	/**
	 * ����̵�ַ��
	 * @param url
	 */
	public int insertUrl(ShortUrl shortUrl);
	/**
	 * ͨ��id��ѯ��ַ
	 * @param id
	 * @return
	 */
	public String queryById(int id);
}
