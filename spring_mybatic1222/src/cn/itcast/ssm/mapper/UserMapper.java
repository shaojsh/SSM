package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;
/**
* @author ����  �� 
* @version ����ʱ�䣺2019��6��11�� ����4:27:16
* <p>
* describe :  mapper�ӿڣ��൱��dao�ӿ� �û����� �ӿڷ�������xml�еĵķ�����һ�£��ӿ��������Ϊxml�������ռ�
* </p>
*/
public interface UserMapper{

	// ��
	public User findUserById(int id) throws Exception;

}
