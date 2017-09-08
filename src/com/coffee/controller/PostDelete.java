package com.coffee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coffee.dao.PostDAO;
import com.coffee.dto.PostDTO;

/**
 * Servlet implementation class PostDelete
 */
@WebServlet("/postDelete.do")
public class PostDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String num=request.getParameter("num");
		PostDAO pDao = PostDAO.getInstance();
		List<PostDTO> pDto=pDao.selectPost(num);
		
		request.setAttribute("post", pDto);

		RequestDispatcher dispatcher = request.getRequestDispatcher("post/postDelete.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num=request.getParameter("num");
		PostDAO pDao = PostDAO.getInstance();
		pDao.deletePost(num);
		
		response.sendRedirect("postList.do");
	}

}
