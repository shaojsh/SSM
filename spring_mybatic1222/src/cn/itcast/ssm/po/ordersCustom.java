package cn.itcast.ssm.po;
/**
* @author 作者  邵 
* @version 创建时间：2019年6月15日 下午2:56:00
* <p>
* describe :  order订单的扩展类
* </p>
*/
public class ordersCustom extends orders{

	// 添加用户的属性
	
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
