package com.wenlong.yaopin.dao;

import java.util.List;

import com.wenlong.yaopin.pojo.Enterprise;


/*
 * 经营企业DAO接口
 */
public interface UserDao {
	
	/*
	 * @param ent 封装要添加到数据库中的经营企业对象
	 * @return
	 */
	void save(Enterprise ent);
	void update(Enterprise ent);
	void delete(Integer id);
	List<Enterprise> queryALL();
	
}
