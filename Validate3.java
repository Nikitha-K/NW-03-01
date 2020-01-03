

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate3")
public class Validate3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pwd = request.getParameter("pass");
		HttpSession session = request.getSession();
		RequestDispatcher rd = null;
		if((user.isEmpty())||(pwd.isEmpty()))
				 
		{
			out.println("<font color =red> Fields cannot be empty </font>");
			rd = request.getRequestDispatcher("Form3.html");
			}
		
		else if((user.equals("admin")) && (pwd.equals("admin")))
		{
			// = session.getAttribute("admin","admin"))
			//

			session.setAttribute("loginstatus", "yes");
			rd = request.getRequestDispatcher("Admin3");
			//response.sendRedirect("http://www.yahoo.com");
			rd.forward(request, response); 
		//	out.println("Authentication successful");
		//	session.invalidate();
			
		}
		
		
		else if(!user.equals("admin")) {
			rd = request.getRequestDispatcher("User3");
			
		rd.include(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
