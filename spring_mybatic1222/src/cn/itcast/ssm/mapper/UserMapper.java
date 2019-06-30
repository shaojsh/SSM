package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;
/**
* @author 作者  邵 
* @version 创建时间：2019年6月11日 下午4:27:16
* <p>
* describe :  mapper接口，相当于dao接口 用户管理 接口方法名和xml中的的方法名一致，接口类的名字为xml的命名空间
* </p>
*/
public interface UserMapper{

	// 查
	public User findUserById(int id) throws Exception;

}
