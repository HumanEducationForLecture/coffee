package basket;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		USERDTO dto=new USERDTO();
		USERDAO dao=new USERDAO();
		response.setCharacterEncoding("UTF-8");	
		dto.setu_id(request.getParameter("id"));
		dto.setp_code(request.getParameter("code"));
		dto.setb_amount(Integer.parseInt(request.getParameter("cnt")));
		
		dao.insert(dto);
		response.sendRedirect("combasket.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int b=Integer.parseInt(request.getParameter("check"));
		b*=25000;
		System.out.println(b);
		
	}

}
