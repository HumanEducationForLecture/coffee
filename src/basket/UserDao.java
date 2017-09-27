package basket;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.human.util.DBConnection;
public class UserDao {
	
	private DBConnection dbconnection = DBConnection.getInstance(); 
	
	public void insert(UserDTO dto) {
		Connection conn=null;
		PreparedStatement psmt=null;
		try {
			conn=dbconnection.dbconn();
			String sql="insert into basket values(?,?,?,now())";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1,dto.getu_id());
			psmt.setString(2,dto.getp_code());
			psmt.setInt(3,dto.getb_amount());
			int test=psmt.executeUpdate();
			System.out.println("���� ����"+test);
			if(psmt!=null) {
				psmt.close();
				
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
		}
	}
	public void delete(UserDTO dto) {
		Connection conn=null;
		PreparedStatement psmt=null;
		try {
			conn=dbconnection.dbconn();
			psmt=conn.prepareStatement("delete from test where id=?");
			psmt.setString(1,dto.getu_id());
			int test=psmt.executeUpdate();
			psmt.close();
			System.out.println("���� ����"+test);
			if(psmt!=null) {
				psmt.close();
				
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
		}
	}
	public void update(UserDTO dto) {
		Connection conn=null;
		PreparedStatement psmt;
		try {
			conn=dbconnection.dbconn();
			psmt=conn.prepareStatement("update test set id=? where id=?");
			//���� �ʿ���
			psmt.setString(1,dto.getu_id());
			psmt.setString(2,dto.getu_id());
			int test=psmt.executeUpdate();
			System.out.println("���� ����"+test);
			if(psmt!=null) {
				psmt.close();
				if(conn!=null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
		}
	}
	public void datacom(){
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs;
		int cnt=0;
		
		try {
			conn=dbconnection.dbconn();
			psmt=conn.prepareStatement("select * from basket");
			rs=psmt.executeQuery();
			while(rs.next()) {
				String u_id=rs.getString(1);
				String p_code=rs.getString(2);
				int b_amount=rs.getInt(3);
				cnt+=b_amount;
				String sysdata=rs.getString(4);
				System.out.println("u_id:"+u_id+"  p_code:"+p_code+"  b_amount:"+b_amount+"   sysdata:"+sysdata + "  �Ѱ���:"+cnt);
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}catch(SQLException e) {
			System.out.println("�����Ͱ� �������� ����");
		}
	}
	public static void main(String[] args) {
//		USERDAO dao=new USERDAO();
//		dao.datacom();
	}
}
