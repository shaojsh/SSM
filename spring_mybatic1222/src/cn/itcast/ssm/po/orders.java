package cn.itcast.ssm.po;

import java.util.Date;
import java.util.List;

/**
* @author ����  �� 
* @version ����ʱ�䣺2019��6��15�� ����2:45:13
* <p>
* describe :  �û�����pojo
* </p>
*/
public class orders {
	
	private int id;
	private int user_id;
	private String number;
	private Date datetime;
	private String note;
	private User user;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
}
