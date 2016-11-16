package cn.mtoke.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.mtoke.domain.Act;

@Repository
public interface ActDao {
	/**
	 * ��ѯ�����б�
	 * @return
	 */
	List<Act> queryAll();
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	Act queryById(int id);
	/**
	 * ����
	 * @param act
	 * @return
	 */
	int insertAct(Act act);
	
	/**
	 * ���»
	 * @param act
	 * @return
	 */
	int updataAct(Act act);
	
	/**
	 * ɾ���
	 * @param id
	 * @return
	 */
	int deleAct(int id);
}
