package cn.itcast.ssm.po;
/**
* @author 作者  邵 
* @version 创建时间：2019年6月15日 下午2:51:48
* <p>
* describe :  商品明细pojo
* </p>
*/
public class itemsdetail {

	private int id;
	private int order_id;
	private int items_id;
	private int intems_num;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getItems_id() {
		return items_id;
	}
	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}
	public int getIntems_num() {
		return intems_num;
	}
	public void setIntems_num(int intems_num) {
		this.intems_num = intems_num;
	}
	
}
