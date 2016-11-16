package cn.mtoke.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.mtoke.domain.Act;

@Repository
public interface ActDao {
	/**
	 * 查询所有列表
	 * @return
	 */
	List<Act> queryAll();
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	Act queryById(int id);
	/**
	 * 插入活动
	 * @param act
	 * @return
	 */
	int insertAct(Act act);
	
	/**
	 * 更新活动
	 * @param act
	 * @return
	 */
	int updataAct(Act act);
	
	/**
	 * 删除活动
	 * @param id
	 * @return
	 */
	int deleAct(int id);
}
