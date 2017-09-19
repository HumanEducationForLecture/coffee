package src.com.human.dto;

import java.sql.Timestamp;

public class Drink_menuDTO {
	private String D_menu;
	private String D_temperate;
	private String D_price;
	private Timestamp D_date;
	public String getD_menu() {
		return D_menu;
	}
	public void setD_menu(String d_menu) {
		D_menu = d_menu;
	}
	public String getD_temperate() {
		return D_temperate;
	}
	public void setD_temperate(String d_temperate) {
		D_temperate = d_temperate;
	}
	public String getD_price() {
		return D_price;
	}
	public void setD_price(String d_price) {
		D_price = d_price;
	}
	public Timestamp getD_date() {
		return D_date;
	}
	public void setD_date(Timestamp d_date) {
		D_date = d_date;
	}
}
