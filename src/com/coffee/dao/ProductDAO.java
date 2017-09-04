package com.coffee.dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.coffee.dto.ProductVO;

import util.DBManager1;

public class ProductDAO {
	private ProductDAO(){
		
	}
	private static ProductDAO instance=new ProductDAO();
	
	public static ProductDAO getInstance(){
		return instance;
	}
	public List<ProductVO> selectAllProducts(){
		String sql="select * from product";
		List<ProductVO> list=new ArrayList<ProductVO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				ProductVO pVo=new ProductVO();
				pVo.setCode(rs.getInt("code"));
				pVo.setKind(rs.getString("kind"));
				pVo.setName(rs.getString("name"));
				pVo.setPrice(rs.getInt("price"));
				pVo.setImage(rs.getString("image"));
				pVo.setContent(rs.getString("content"));
				list.add(pVo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn,pstmt,rs);
		}
		return list;
		
	}

}
