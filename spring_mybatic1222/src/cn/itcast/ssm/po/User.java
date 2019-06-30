package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

// 序列化的接口 是为了反序列化使用，有利于将二级缓存中的数据保存在本地硬盘/远程服务器，内存等介质中
public class User implements Serializable{

	private static final long serialVersionUID = -6823574920871990196L;
	// id
	private int id;
	// 用户姓名
	private String username;
	// 性别
	private String sex;
	// 生日
	private Date birthday;
	// 地址
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
