package text.com.wenlong.yaopin.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wenlong.yaopin.dao.impl.UserDaoImplTwo;
import com.wenlong.yaopin.pojo.EnterpriseTwo;





public class TextDaoTwo {

	private UserDaoImplTwo eDaoTwo;
	@Before
	public void setUp(){
		eDaoTwo=new UserDaoImplTwo();
	}
	@After
	public void testDown(){
		
	}	
	@Test
	public void testsave(){
		EnterpriseTwo two = new EnterpriseTwo();
		two.setNameone("ÄãÊÇ²»ÊÇÉµ");
		eDaoTwo.save(two);
		
	}
}
