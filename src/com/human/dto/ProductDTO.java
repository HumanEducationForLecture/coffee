package com.human.dto;

import java.sql.Timestamp;

public class ProductDTO {
	private String P_code;
	private String P_id;
	private int P_custSalePrice;
	private int P_shopSalePrice;
	private int P_splckNum;
	private String SP_id;
	private int P_inPrice;
	private Timestamp P_indate;
	private Timestamp P_date;
	private String P_img;
	public String getP_code() {
		return P_code;
	}
	public void setP_code(String p_code) {
		P_code = p_code;
	}
	public String getP_id() {
		return P_id;
	}
	public void setP_id(String p_id) {
		P_id = p_id;
	}
	public int getP_custSalePrice() {
		return P_custSalePrice;
	}
	public void setP_custSalePrice(int p_custSalePrice) {
		P_custSalePrice = p_custSalePrice;
	}
	public int getP_shopSalePrice() {
		return P_shopSalePrice;
	}
	public void setP_shopSalePrice(int p_shopSalePrice) {
		P_shopSalePrice = p_shopSalePrice;
	}
	public int getP_splckNum() {
		return P_splckNum;
	}
	public void setP_splckNum(int p_splckNum) {
		P_splckNum = p_splckNum;
	}
	public String getSP_id() {
		return SP_id;
	}
	public void setSP_id(String sP_id) {
		SP_id = sP_id;
	}
	public int getP_inPrice() {
		return P_inPrice;
	}
	public void setP_inPrice(int p_inPrice) {
		P_inPrice = p_inPrice;
	}
	public Timestamp getP_indate() {
		return P_indate;
	}
	public void setP_indate(Timestamp p_indate) {
		P_indate = p_indate;
	}
	public Timestamp getP_date() {
		return P_date;
	}
	public void setP_date(Timestamp p_date) {
		P_date = p_date;
	}
	public String getP_img() {
		return P_img;
	}
	public void setP_img(String p_img) {
		P_img = p_img;
	}
	

}
