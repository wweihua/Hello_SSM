package cn.mtoke.dao;

import cn.mtoke.domain.ShortUrl;


public interface ShortUrlDao {
	/**
	 * 插入短地址库
	 * @param url
	 */
	public int insertUrl(ShortUrl shortUrl);
	/**
	 * 通过id查询地址
	 * @param id
	 * @return
	 */
	public String queryById(int id);
}
