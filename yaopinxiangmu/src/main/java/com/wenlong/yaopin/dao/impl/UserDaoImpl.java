package com.wenlong.yaopin.dao.impl;



import java.util.List;

import com.wenlong.commonsdb.db.SQLTemplate;
import com.wenlong.commonsdb.db.SQLTemplateImpl;
import com.wenlong.yaopin.dao.UserDao;
import com.wenlong.yaopin.pojo.Enterprise;

public class UserDaoImpl implements UserDao {
	
	
	private SQLTemplate sqlT;
	
	public UserDaoImpl(){
		super();
		sqlT = new SQLTemplateImpl();
	}
	
	public UserDaoImpl(SQLTemplate sqlT){
		super();
		this.sqlT=sqlT;
	}
	

	public void save(Enterprise ent) {
		 sqlT.update("INSERT INTO t_increase(name) VALUES (?)",new Object[]{ent.getORG_name()});
	}
		
	/*,Basic_Info,query_keyword,File_Number,Drug_licenceCard_number,drug_name,"
			+ "Address,Legal_Person,Responsible_persons,responsible_person,Warehouse_Address,Valid_Datedate,business_practice,"
			+ "scope,Issuer,Issuing_date,charter,a_registation_number,charter_name,accommodation,Party_name,registered_capital,paid_in_capital,"
			+ "Company_Type,Business_scope,Register_Date,date_readydate,date_enddate,Organ,operating_date,gps,gps_number,gps_name,gps_address,gps_scope,gps_date,"
			+ "gps_Organ,gps_Opening_Date,Message,Message_name,Message_bank,Message_accounts,Taxation,Taxation_number,Taxation_name,"
			+ "Taxation_person,Taxation_address,Taxation_Type,Taxation_Scope,Taxation_Organ,Taxation_duty,Taxation_papers,Taxation_date,"
			+ "ORG_number,ORG_name,ORG_type"
			+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
			+ "?,?,?,?,?,?,?,?
*/
	public void update(Enterprise ent) {
		
	}

	public void delete(Integer id) {
	
	}

	public List<Enterprise> queryALL() {
		return null;
	}

}
