package src.com.human.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.com.human.dao.Custom_accmulateDAO;
import src.com.human.dto.Custom_accmulateDTO;

/**
 * Servlet implementation class buyListCalendar
 */
@WebServlet("/buyList")
public class buyListCalendar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyListCalendar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Custom_accmulateDAO cDao=Custom_accmulateDAO.getInstance();
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
		
		String currentTime = getCurrentTimeStamp();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);

		cal.set(year, month, 1);
		int startDay = cal.getMinimum(java.util.Calendar.DATE);
		int endDay = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		int start = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int newLine = 0;
		int intToday = Integer.parseInt(sdfDate.format(cal.getTime()));
		
		List<Custom_accmulateDTO> buyList=cDao.selectCA_count();
		request.setAttribute("buyList", buyList);
		request.setAttribute("year",currentTime.substring(0,3));
		request.setAttribute("month", currentTime.substring(4, 5));
		request.setAttribute("day", currentTime.substring(6));
		request.setAttribute("startDay", startDay);
		request.setAttribute("endDay", endDay);
		request.setAttribute("start", start);
		request.setAttribute("newLine", newLine);
		request.setAttribute("intToday", intToday);
		System.out.println(currentTime.substring(0,3));
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("buyList.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String getCurrentTimeStamp() {
		Calendar todayCal = Calendar.getInstance();
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
	    Date now = new Date(System.currentTimeMillis());
	    String strDate = sdfDate.format(now);
	    return strDate;
	}

}
