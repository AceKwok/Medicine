package com.wenlong.yaopin.dao.impl;

import java.util.List;

import com.wenlong.commonsdb.db.SQLTemplate;
import com.wenlong.commonsdb.db.SQLTemplateImpl;
import com.wenlong.yaopin.dao.UserDaoOne;
import com.wenlong.yaopin.pojo.EnterpriseOne;

public class UserDaoImplOne implements UserDaoOne {
	
	
	private SQLTemplate sqlT;
	
	public UserDaoImplOne(){
		super();
		sqlT = new SQLTemplateImpl();
	}
	
	public UserDaoImplOne(SQLTemplate sqlT){
		this.sqlT=sqlT;
	}

	public void save(EnterpriseOne one) {
		sqlT.update("INSERT INTO t_drug_files (`Drug name`) VALUES (?)",new Object[]{one.getDrug_name()});

	}
	/*	import_two,  id, Drug_name, Keyword, product_name,Drug_Type,norms,Drug_Firm,Drug_number,Drug_Scope,"
		+ "Drug_Condition,Drug_class,Drug_yes,Drug_no,Drug_Place,import_one,"
		+ "import_number,import_date,list_one,list_number,list_date,REPORT_one,"
		+ "REPORT_number,REPORT_date,Prove_one,Prove_number,Prove_date,"
		+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?
*/	
	public void update(EnterpriseOne one) {
	

	}


	public void delete(Integer id) {
		
		
	}

	public List<EnterpriseOne> queryALL() {
		return null;
	}

}
