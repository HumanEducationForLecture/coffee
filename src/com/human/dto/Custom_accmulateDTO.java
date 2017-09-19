package src.com.human.dto;

import java.sql.Timestamp;

public class Custom_accmulateDTO {
	private String U_id;
	private String U_shopName;
	private int CA_shopCount;
	private String CA_menu;
	private String CA_orderNum;
	private int CA_division;
	private int CA_price;
	private int CA_mileage;
	private Timestamp CA_date;
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getU_shopName() {
		return U_shopName;
	}
	public void setU_shopName(String u_shopName) {
		U_shopName = u_shopName;
	}
	public int getCA_shopCount() {
		return CA_shopCount;
	}
	public void setCA_shopCount(int cA_shopCount) {
		CA_shopCount = cA_shopCount;
	}
	public String getCA_menu() {
		return CA_menu;
	}
	public void setCA_menu(String cA_menu) {
		CA_menu = cA_menu;
	}
	public String getCA_orderNum() {
		return CA_orderNum;
	}
	public void setCA_orderNum(String cA_orderNum) {
		CA_orderNum = cA_orderNum;
	}
	public int getCA_division() {
		return CA_division;
	}
	public void setCA_division(int cA_division) {
		CA_division = cA_division;
	}
	public int getCA_price() {
		return CA_price;
	}
	public void setCA_price(int cA_price) {
		CA_price = cA_price;
	}
	public int getCA_mileage() {
		return CA_mileage;
	}
	public void setCA_mileage(int cA_mileage) {
		CA_mileage = cA_mileage;
	}
	public Timestamp getCA_date() {
		return CA_date;
	}
	public void setCA_date(Timestamp cA_date) {
		CA_date = cA_date;
	}
	
}
