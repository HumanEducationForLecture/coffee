package com.coffee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coffee.dao.PostDAO;
import com.coffee.dto.PostDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class PostInsert
 */
@WebServlet("/postWrite.do")
public class PostWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostWrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		RequestDispatcher dispatcher = request.getRequestDispatcher("post/postWrite.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		
		MultipartRequest multi=new MultipartRequest(request, null, 0, new DefaultFileRenamePolicy());

		int pass=Integer.parseInt(multi.getParameter("pass"));
		String name=multi.getParameter("name");
		String email=multi.getParameter("email");
		String title=multi.getParameter("title");
		String content=multi.getParameter("content");
		PostDTO pDto=new PostDTO();
		pDto.setPass(pass);
		pDto.setName(name);
		pDto.setEmail(email);
		pDto.setTitle(title);
		pDto.setContent(content);
		
		PostDAO pDao=PostDAO.getInstance();
		pDao.insertPost(pDto);
		
		response.sendRedirect("postList.do");
	}

}
