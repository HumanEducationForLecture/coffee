package com.human.dto;

import java.sql.Timestamp;

public class Drink_orderDTO {
	private String DO_orderNum;
	private String U_id;
	private String U_shopName;
	private String D_menu;
	private int DO_price;
	private int DO_complete;
	private Timestamp DO_date;
	public String getDO_orderNum() {
		return DO_orderNum;
	}
	public void setDO_orderNum(String dO_orderNum) {
		DO_orderNum = dO_orderNum;
	}
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
	public String getD_menu() {
		return D_menu;
	}
	public void setD_menu(String d_menu) {
		D_menu = d_menu;
	}
	public int getDO_price() {
		return DO_price;
	}
	public void setDO_price(int dO_price) {
		DO_price = dO_price;
	}
	public int getDO_complete() {
		return DO_complete;
	}
	public void setDO_complete(int dO_complete) {
		DO_complete = dO_complete;
	}
	public Timestamp getDO_date() {
		return DO_date;
	}
	public void setDO_date(Timestamp dO_date) {
		DO_date = dO_date;
	}

}
