package cn.itcast.ssm.po;
/**
* @author ����  �� 
* @version ����ʱ�䣺2019��6��15�� ����2:56:00
* <p>
* describe :  order��������չ��
* </p>
*/
public class ordersCustom extends orders{

	// ����û�������
	
	private String username;
	private String sex;
	private String ddress;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDdress() {
		return ddress;
	}
	public void setDdress(String ddress) {
		this.ddress = ddress;
	}
}
