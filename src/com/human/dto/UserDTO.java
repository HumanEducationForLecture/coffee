package com.human.dto;

import java.sql.Timestamp;

public class UserDTO {
	private String U_id;
	private String U_shopName;
	private String U_password;
	private String U_address;
	private String U_tell;
	private int U_class;
	private Timestamp U_date;
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
	public String getU_password() {
		return U_password;
	}
	public void setU_password(String u_password) {
		U_password = u_password;
	}
	public String getU_address() {
		return U_address;
	}
	public void setU_address(String u_address) {
		U_address = u_address;
	}
	public String getU_tell() {
		return U_tell;
	}
	public void setU_tell(String u_tell) {
		U_tell = u_tell;
	}
	public int getU_class() {
		return U_class;
	}
	public void setU_class(int u_class) {
		U_class = u_class;
	}
	public Timestamp getU_date() {
		return U_date;
	}
	public void setU_date(Timestamp u_date) {
		U_date = u_date;
	}

}
