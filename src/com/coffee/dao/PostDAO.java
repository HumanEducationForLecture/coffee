package com.coffee.dao;

import java.sql.*;
import java.util.*;
import java.util.List;

import com.coffee.dto.PostVO;

import util.DBManager1;

public class PostDAO {
	private PostDAO(){
		
	}
	private static PostDAO instance=new PostDAO();
	
	public static PostDAO getInstance(){
		return instance;
	}
	public List<PostVO> selectAllPosts(){
		String sql="select * from Post order by num desc";
		
		List<PostVO> list=new ArrayList<PostVO>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				PostVO pVo=new PostVO();
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				pVo.setEmail(rs.getString("email"));
				pVo.setPass(rs.getString("pass"));
				pVo.setTitle(rs.getString("title"));
				pVo.setContent(rs.getString("content"));
				pVo.setReadcount(rs.getInt("readcount"));
				
				list.add(pVo);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn, stmt, rs);
		}
		return list;
	}
	public void insertPost(PostVO pVo){
		String sql="insert into post(name,email,pass,title,content) values(?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getName());
			pstmt.setString(2, pVo.getEmail());
			pstmt.setString(3, pVo.getPass());
			pstmt.setString(4, pVo.getTitle());
			pstmt.setString(5, pVo.getContent());
			
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn, pstmt);
		}
	}
	public void updateReadCount(String num){
		String sql="update post set readcount=readcount+1 where num=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, num);
			
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn, pstmt);
		}
	}
	public PostVO selectOnePostByNum(String num){
		String sql="select * from Post where num=?";

		PostVO pVo=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs=pstmt.executeQuery(sql);
			if(rs.next()){
				pVo=new PostVO();
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				pVo.setEmail(rs.getString("email"));
				pVo.setPass(rs.getString("pass"));
				pVo.setTitle(rs.getString("title"));
				pVo.setContent(rs.getString("content"));
				pVo.setReadcount(rs.getInt("readcount"));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn, pstmt, rs);
		}
		return pVo;
	}
	public void updatePost(PostVO pVo){
		String sql="update post set name=?,email=?,pass=?,title=?,content=? where num=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getName());
			pstmt.setString(2, pVo.getEmail());
			pstmt.setString(3, pVo.getPass());
			pstmt.setString(4, pVo.getTitle());
			pstmt.setString(5, pVo.getContent());
			pstmt.setInt(6, pVo.getNum());
			
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn, pstmt);
		}
	}
	public PostVO checkPassWord(String pass,String num){
		String sql="select * from Post where pass=? and num=?";

		PostVO pVo=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, pass);
			pstmt.setString(2, num);
			
			rs=pstmt.executeQuery(sql);
			if(rs.next()){
				pVo=new PostVO();
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				pVo.setEmail(rs.getString("email"));
				pVo.setPass(rs.getString("pass"));
				pVo.setTitle(rs.getString("title"));
				pVo.setContent(rs.getString("content"));
				pVo.setReadcount(rs.getInt("readcount"));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return pVo;
	}
	public void deletePost(String num){
		String sql="delete post where num=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, num);
			
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
