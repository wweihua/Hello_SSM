package cn.mtoke.service;

import java.util.List;

import cn.mtoke.domain.Act;

public interface ActService {

	/**
	 * 插入
	 * @param act
	 */
	public void addAct(Act act);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Act getById(int id);
	/**
	 * 获取活动列表
	 * @return
	 */
	public List<Act> getJdactList();
	/**
	 * 通过id删除活动
	 * @param id
	 */
	public void deleActById(int id);
	/**
	 * 更新活动
	 */
	public void updataAct(Act act);
}
