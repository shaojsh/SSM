package cn.itcast.ssm.po;
/**
* @author 作者  邵 
* @version 创建时间：2019年6月13日 上午8:19:16
* <p>
* describe :  用户包装类型
* </p>
*/
public class userQueryVo {

	// 在这里要包装需要的查询条件
	
	// 用户查询条件
	private userCustom userCustom;
	
	// 可以包含其他的查询条件订单商品
	public userCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(userCustom userCustom) {
		this.userCustom = userCustom;
	}
}
