package cn.mtoke.service;

import java.util.List;

import cn.mtoke.domain.Act;

public interface ActService {

	/**
	 * ����
	 * @param act
	 */
	public void addAct(Act act);
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public Act getById(int id);
	/**
	 * ��ȡ��б�
	 * @return
	 */
	public List<Act> getJdactList();
	/**
	 * ͨ��idɾ���
	 * @param id
	 */
	public void deleActById(int id);
	/**
	 * ���»
	 */
	public void updataAct(Act act);
}
