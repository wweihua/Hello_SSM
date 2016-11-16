package cn.mtoke.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mtoke.domain.Act;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ActDaoTest {

	@Autowired
	private ActDao actDao;
	
	//@Test
	public final void testQueryAll() {
		List<Act> actlist=actDao.queryAll();
		System.out.println(actlist.toString());
		
	}

	@Test
	public final void testQueryById() {
		int id =30;
		Act act =actDao.queryById(id);
		System.out.println(act.toString());
	}

	/*@Test
	public final void testInsertAct() {
		Act act=new Act();
		act.setName("123");
		act.setUrl("http://www.baidu.com");
		act.setTime("8:00");
		actDao.insertAct(act);
	}*/

	/*@Test
	public final void testUpdataAct() {
		
	}

	@Test
	public final void testDeleAct() {
		
	}*/

}
