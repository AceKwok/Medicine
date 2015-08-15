package com.wenlong.yaopin.dao.impl;

import java.util.List;

import com.wenlong.commonsdb.db.SQLTemplate;
import com.wenlong.commonsdb.db.SQLTemplateImpl;
import com.wenlong.yaopin.dao.UserTwoDao;
import com.wenlong.yaopin.pojo.EnterpriseTwo;

public class UserDaoImplTwo implements UserTwoDao {

	
	
	private SQLTemplate sqlT;
	
	public UserDaoImplTwo(){
		super();
		sqlT = new SQLTemplateImpl();
	}
	
	public UserDaoImplTwo(SQLTemplate sqlT){
		this.sqlT=sqlT;
		
	}
	public void save(EnterpriseTwo two) {
		sqlT.update("INSERT INTO t_market (nameone) VALUES (?)",new Object[]{two.getNameone()});

	}
	
	/*importonet,id,market Message,market name,market ID,market ID name,"
			+ "marke ID,market sex market Family,be born,market address,Authorize,Authorize name,"
			+ "Authorize breed,Authorize address,Authorize date,"
			+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?
*/
	public void update(EnterpriseTwo two) {
		

	}

	public void delete(Integer id) {
		

	}

	public List<EnterpriseTwo> queryALL() {

		return null;
	}

}
