package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.human.dto.Custom_accmulateDTO;
import com.human.util.DBManager;

public class Custom_accmulateDAO {
	public Custom_accmulateDAO(){
		
	}
	private static Custom_accmulateDAO instance=new Custom_accmulateDAO();

	public static Custom_accmulateDAO getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	public List<Custom_accmulateDTO> selectCA_count(){
		String sql="select U_shopName,CA_date from Custom_accmulateEX where CA_shopCount>0";
		List<Custom_accmulateDTO> list=new ArrayList<Custom_accmulateDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			Custom_accmulateDTO cDto=new Custom_accmulateDTO();
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				cDto.setU_shopName(rs.getString("U_shopName"));
				cDto.setCA_date(rs.getTimestamp("CA_date"));
				list.add(cDto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.close(conn,pstmt,rs);
		}
		return list;
	}
	public String getCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
	    Date now = new Date(System.currentTimeMillis());
	    String strDate = sdfDate.format(now);
	    return strDate;
	}

}
