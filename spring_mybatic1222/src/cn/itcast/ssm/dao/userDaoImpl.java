package cn.itcast.ssm.dao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.ssm.po.User;

/**
 * <p>
   *  用户接口实现类
 * </p>
 * @author 邵
 *
 */
public class userDaoImpl extends SqlSessionDaoSupport implements userDao{


	@Override
	public User findUserById(int id) throws Exception {
		
		SqlSession sqlSession = this.getSqlSession();
		
		User user = sqlSession.selectOne("test.findUserById",1);
		
		return user;
	}


}
