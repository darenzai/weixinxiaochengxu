import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		String name=request.getParameter("name");
		String password=request.getParameter("passwd");
		
		if(name=="darenzai") {
			request.getRequestDispatcher("success.html").forward(request, response);

		}else {
			response.sendRedirect("fail.html");
		}
		
	
	}

}
