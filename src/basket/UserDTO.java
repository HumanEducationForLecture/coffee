package basket;


import java.io.Serializable;

public class UserDTO implements Serializable{
	
	private String u_id;
	private String p_code;
	private int b_amount;
	
	//õü���� �����ʿ�
	public UserDTO() {
		super();
	}
	public String getu_id() {
		return u_id;
	}
	public void setu_id(String u_id) {
		this.u_id = u_id;
	}
	public String getp_code() {
		return p_code;
	}
	public void setp_code(String p_code) {
		this.p_code = p_code;
	}
	public int getb_amount() {
		return b_amount;
	}
	public void setb_amount(int b_amount) {
		this.b_amount = b_amount;
	}
	@Override
	public String toString() {
		
		return p_code;
		
	}
}
