package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

/**
 * <p>
 * dao接口，用户接口
 * </p>
 * 
 * @author 邵
 *
 */
public interface userDao {
	
	public User findUserById(int id) throws Exception;
}
