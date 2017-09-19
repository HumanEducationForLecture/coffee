package src.com.human.dto;

import java.sql.Timestamp;

public class BasketDTO {
	private String U_id;
	private String P_code;
	private int B_amount;
	private Timestamp B_date;
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
	public int getB_amount() {
		return B_amount;
	}
	public void setB_amount(int b_amount) {
		B_amount = b_amount;
	}
	public Timestamp getB_date() {
		return B_date;
	}
	public void setB_date(Timestamp b_date) {
		B_date = b_date;
	}
	

}
