package com.wenlong.yaopin.dao;

import java.util.List;

import com.wenlong.yaopin.pojo.Enterprise;


/*
 * ��Ӫ��ҵDAO�ӿ�
 */
public interface UserDao {
	
	/*
	 * @param ent ��װҪ��ӵ����ݿ��еľ�Ӫ��ҵ����
	 * @return
	 */
	void save(Enterprise ent);
	void update(Enterprise ent);
	void delete(Integer id);
	List<Enterprise> queryALL();
	
}
