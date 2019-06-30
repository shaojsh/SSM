package cn.itcast.ssm.po;

import java.util.Date;

/**
* @author 作者  邵 
* @version 创建时间：2019年6月15日 下午2:48:12
* <p>
* describe :  商品pojo
* </p>
*/
public class items {
	
	private int id;
	private String name;
	private float price;
	private String detail;
	private String pic;
	private Date ceeatedate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCeeatedate() {
		return ceeatedate;
	}
	public void setCeeatedate(Date ceeatedate) {
		this.ceeatedate = ceeatedate;
	}
	
}
