package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

/**
 * <p>
 * dao�ӿڣ��û��ӿ�
 * </p>
 * 
 * @author ��
 *
 */
public interface userDao {
	
	public User findUserById(int id) throws Exception;
}
