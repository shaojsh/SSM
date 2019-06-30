package cn.itcast.ssm.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.po.User;

/**
* @author 作者  邵 
* @version 创建时间：2019年6月23日 下午2:19:22
* <p>
* describe :  
* </p>
*/
public class userDaoImplTest {

	private ApplicationContext applicationContext;
	// 得到spring的容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		userDao userDao = (userDao)applicationContext.getBean("userDao");
		 User user = userDao.findUserById(1);	 
	
		 System.out.println(user);
	}

}
