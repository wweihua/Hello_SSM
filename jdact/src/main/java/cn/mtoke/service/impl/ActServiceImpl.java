package cn.mtoke.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.mtoke.dao.ActDao;
import cn.mtoke.domain.Act;
import cn.mtoke.exceptions.ActException;
import cn.mtoke.service.ActService;
import cn.mtoke.utils.GetShortUrl;
@Service
public class ActServiceImpl implements ActService {

	@Autowired
	private ActDao actDao;
	
	public Act getById(int id) {
		return actDao.queryById(id);
	}

	public List<Act> getJdactList() {
		return actDao.queryAll();
	}

	@Transactional
	public void deleActById(int id) {
		int state = actDao.deleAct(id);
		if(state <=0){
			throw new ActException("É¾³ýÊ§°Ü£¡");
		}
		
	}

	public void updataAct(Act act) {
		int state =1;
		state =actDao.updataAct(act);
		if(state<=0){
			throw new ActException("¸üÐÂÊ§°Ü£¡");
		}
	}

	public void addAct(Act act) {
		int state =1;
		state =actDao.insertAct(act);
		if(state<=0){
			throw new ActException("Ôö¼ÓÊ§°Ü");
		}
	}

}
