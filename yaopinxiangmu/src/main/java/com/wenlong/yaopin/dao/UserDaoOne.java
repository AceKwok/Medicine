package com.wenlong.yaopin.dao;

import java.util.List;

import com.wenlong.yaopin.pojo.EnterpriseOne;





public interface UserDaoOne {
	void save(EnterpriseOne one);
	void update(EnterpriseOne one);
	void delete(Integer id);
	List<EnterpriseOne>queryALL();
}
