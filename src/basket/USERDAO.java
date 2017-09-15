package basket;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class USERDAO {
	
	
	public Connection dbconn() {
		//클래스포네임 드라이버 로딩
				//디비연결부분
				Connection conn=null;
				//sqlplus
//				final String url="jdbc:oracle:thin:@localhost:1521:orcl";
				//mysql
				final String url="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false"; 
				final String id="root";
				final String pw="1111";
				try {
					//드라이버 로딩
					Class.forName("com.mysql.jdbc.Driver");
//					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("드라이버 로딩 성공");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("드라이버 로딩 실패");
				}	
				try {
					//디비 연결
					conn=DriverManager.getConnection(url,id,pw);
					System.out.println("db연결 성공");
						
				}catch(SQLException e) {
					System.out.println("DB연결 실패");
				}
				return conn;
	}
	public void insert(USERDTO dto) {
		Connection conn=null;
		PreparedStatement psmt=null;
		try {
			conn=dbconn();
			String sql="insert into basket values(?,?,?,now())";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1,dto.getu_id());
			psmt.setString(2,dto.getp_code());
			psmt.setInt(3,dto.getb_amount());
			int test=psmt.executeUpdate();
			System.out.println("삽입 성공"+test);
			if(psmt==null) {
				psmt.close();
				if(conn==null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("삽입 실패");
		}
	}
	public void delete(USERDTO dto) {
		Connection conn=null;
		PreparedStatement psmt=null;
		try {
			conn=dbconn();
			psmt=conn.prepareStatement("delete from test where id=?");
			psmt.setString(1,dto.getu_id());
			int test=psmt.executeUpdate();
			psmt.close();
			System.out.println("삭제 성공"+test);
			if(psmt==null) {
				psmt.close();
				if(conn==null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("삭제 실패");
		}
	}
	public void update(USERDTO dto) {
		Connection conn=null;
		PreparedStatement psmt;
		try {
			conn=dbconn();
			psmt=conn.prepareStatement("update test set id=? where id=?");
			//수정 필요함
			psmt.setString(1,dto.getu_id());
			psmt.setString(2,dto.getu_id());
			int test=psmt.executeUpdate();
			System.out.println("변경 성공"+test);
			if(psmt==null) {
				psmt.close();
				if(conn==null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("변경 실패");
		}
	}
	public void datacom(){
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs;
		int cnt=0;
		
		try {
			conn=dbconn();
			psmt=conn.prepareStatement("select * from basket");
			rs=psmt.executeQuery();
			while(rs.next()) {
				String u_id=rs.getString(1);
				String p_code=rs.getString(2);
				int b_amount=rs.getInt(3);
				cnt+=b_amount;
				String sysdata=rs.getString(4);
				System.out.println("u_id:"+u_id+"  p_code:"+p_code+"  b_amount:"+b_amount+"   sysdata:"+sysdata + "  총가격:"+cnt);
			}
			if(psmt==null) {
				psmt.close();
			}
			if(conn==null) {
				conn.close();
			}
		}catch(SQLException e) {
			System.out.println("데이터값 가져오기 실패");
		}
	}
	public static void main(String[] args) {
//		USERDAO dao=new USERDAO();
//		dao.datacom();
	}
}
