package text.com.wenlong.yaopin.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;





import com.wenlong.yaopin.dao.UserDaoOne;
import com.wenlong.yaopin.dao.impl.UserDaoImplOne;
import com.wenlong.yaopin.pojo.EnterpriseOne;


public class TextDaoOne {

	private UserDaoOne eDaoOne;
	@Before
	public void setUp(){
		eDaoOne=new UserDaoImplOne();
	}
	@After
	public void testDown(){
		
	}	
	@Test
	public void testsave(){
		EnterpriseOne one = new EnterpriseOne();
		one.setDrug_name("Éµ±Æ");
		eDaoOne.save(one);
		
	}
}
