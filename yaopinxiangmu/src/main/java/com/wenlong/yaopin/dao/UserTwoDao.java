package com.wenlong.yaopin.dao;

import java.util.List;

import com.wenlong.yaopin.pojo.EnterpriseTwo;

public interface UserTwoDao {
	void save(EnterpriseTwo two);
	void update(EnterpriseTwo two);
	void delete(Integer id);
	List<EnterpriseTwo>queryALL();
}

