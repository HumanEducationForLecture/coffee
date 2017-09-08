package com.coffee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.coffee.dto.PostDTO;
import com.coffee.util.DBManager1;

public class PostDAO {
private PostDAO(){
		
	}
	private static PostDAO instance=new PostDAO();
	
	public static PostDAO getInstance(){
		return instance;
	}
	public List<PostDTO> selectAllPosts(){
		String sql="select * from post";
		List<PostDTO> list=new ArrayList<PostDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				PostDTO pVo=new PostDTO();
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				pVo.setEmail(rs.getString("email"));
				pVo.setTitle(rs.getString("title"));
				pVo.setContent(rs.getString("content"));
				pVo.setReadcount(rs.getInt("readcount"));
				list.add(pVo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn,pstmt,rs);
		}
		return list;
		
	}
	public List<PostDTO> selectPost(String num){
		String sql="select * from post where num=?";
		List<PostDTO> list=new ArrayList<PostDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,num);
			rs=pstmt.executeQuery();
			while(rs.next()){
				PostDTO pVo=new PostDTO();
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				pVo.setEmail(rs.getString("email"));
				pVo.setTitle(rs.getString("title"));
				pVo.setContent(rs.getString("content"));
				pVo.setReadcount(rs.getInt("readcount"));
				list.add(pVo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn,pstmt,rs);
		}
		return list;
	}
	public void insertPost(PostDTO pDto){
		String sql="insert into post(pass,name,email,title,content) values(?,?,?,?,?)";
		List<PostDTO> list=new ArrayList<PostDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, pDto.getPass());
			pstmt.setString(2, pDto.getName());
			pstmt.setString(3, pDto.getEmail());
			pstmt.setString(4, pDto.getTitle());
			pstmt.setString(5, pDto.getContent());
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn,pstmt);
		}
	}
	public void deletePost(String num){
		String sql="delete from post where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager1.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager1.close(conn,pstmt);
		}
	}
}
