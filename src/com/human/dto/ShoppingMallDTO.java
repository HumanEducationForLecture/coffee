package src.com.human.dto;

import java.sql.Timestamp;

public class ShoppingMallDTO {
	private String SM_orderNum;
	private String U_id;
	private String P_code;
	private int P_salePrice;
	private int SM_orderAmount;
	private int SM_complete;
	private Timestamp SM_date;
	public String getSM_orderNum() {
		return SM_orderNum;
	}
	public void setSM_orderNum(String sM_orderNum) {
		SM_orderNum = sM_orderNum;
	}
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getP_code() {
		return P_code;
	}
	public void setP_code(String p_code) {
		P_code = p_code;
	}
	public int getP_salePrice() {
		return P_salePrice;
	}
	public void setP_salePrice(int p_salePrice) {
		P_salePrice = p_salePrice;
	}
	public int getSM_orderAmount() {
		return SM_orderAmount;
	}
	public void setSM_orderAmount(int sM_orderAmount) {
		SM_orderAmount = sM_orderAmount;
	}
	public int getSM_complete() {
		return SM_complete;
	}
	public void setSM_complete(int sM_complete) {
		SM_complete = sM_complete;
	}
	public Timestamp getSM_date() {
		return SM_date;
	}
	public void setSM_date(Timestamp sM_date) {
		SM_date = sM_date;
	}
	

}
