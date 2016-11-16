package cn.mtoke.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mtoke.domain.ShortUrl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ShortUrlDaotest {
	
	@Autowired
	ShortUrlDao urlDao;
	
	@Test
	public final void testInsertUrl() {
		ShortUrl url=new ShortUrl();
		url.setUrl("http://union.click.jd.com/jdc?e=0&p=AyIHVCtaJQMiQwpDBUoyS0IQWlALHFBXCE9ETlcNVQtHRUkcQlUQBRhjZFZQDGwOXXdNUSwdRExHTlpbWA9XXFZEB08%2BXUNGCw5OC1RDfEUMSxhBFVFTF0UfVlBGYAVGH0EOcmcCWANBXUdFQl8eSWxQWRFYCUEOQlgAWAVNV0JGFAwfUF58WwFOA1FeHlcUWhlMUlFTQl8eSWxAVwlaC01UTQsQdVkXBhIFXR1dEBVWQgl1HkFBTgs1ewxWWkZYAFlrcnFSfSB%2BO1BiEmEuUiVheW9HDltSQw4eN1AYXxIFFgddHmsVAxMGVBpdFQcXN2V9JiVJfAZlHl8RAhoCVhpTJQIXAVwbXxUKEAdXHVIlBSIHURNcFAQWBlwZW3tDIjdlKw%3D%3D&t=W1dCFBBFC0BCWgEEAEAdQFkJBQcLUkBCS1gtc0ZFXiJOE2BdRH5TBAJQXk8JF");
		urlDao.insertUrl(url);
		System.out.println(url.toString());
		
	}

//	@Test
	public final void testQueryById() {
		System.out.println(urlDao.queryById(2));
	}

}
