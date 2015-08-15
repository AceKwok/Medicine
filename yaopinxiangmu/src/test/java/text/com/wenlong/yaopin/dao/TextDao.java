package text.com.wenlong.yaopin.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wenlong.yaopin.dao.UserDao;
import com.wenlong.yaopin.dao.impl.UserDaoImpl;
import com.wenlong.yaopin.pojo.Enterprise;


public class TextDao {
	
	
	private UserDao eDao;
	@Before
	public void setUp(){
		eDao=new UserDaoImpl();
	}
	@After
	public void testDown(){
		
	}	
	@Test
	public void testsave(){
		Enterprise ent = new Enterprise();
		ent.setORG_name("¹þ¶û±õ");
		eDao.save(ent);
		
	}
}
