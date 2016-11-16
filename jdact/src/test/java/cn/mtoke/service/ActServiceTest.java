package cn.mtoke.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mtoke.domain.Act;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
		"classpath:spring/spring-sevice.xml"})
@Service
public class ActServiceTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ActService actService;
	@Test
	public final void testGetById() {
		int id = 1;
		Act act = actService.getById(id);
		logger.info("act"+act);
	}

	@Test
	public final void testGetJdactList() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDeleActById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdataAct() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAddAct() {
		fail("Not yet implemented"); // TODO
	}

}
