package cn.mtoke.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mtoke.dao.ShortUrlDao;
import cn.mtoke.domain.ShortUrl;
import cn.mtoke.service.ShortUrlService;
import cn.mtoke.utils.ChangString;
@Service
public class ShortUrlServiceImpl implements ShortUrlService {

	@Autowired
	ShortUrlDao urlDao;
	public String insertUrl(String url) {
		System.out.println(url);
		ShortUrl shortUrl=new ShortUrl();
		shortUrl.setUrl(url);
//		System.out.println(shortUrl.toString());
		urlDao.insertUrl(shortUrl);
		String code=ChangString._10_to_62(Integer.parseInt(shortUrl.getId()), 3);
		return "http://www.mtoke.cn/link/"+code;
	}
	public String queryById(String string_id) {
		string_id= ChangString.convertBase62ToDecimal(string_id);
//		System.out.println(string_id);
		return urlDao.queryById(Integer.parseInt(string_id));
		
	}

}
