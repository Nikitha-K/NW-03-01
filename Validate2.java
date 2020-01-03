

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate2")
public class Validate2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pwd = request.getParameter("pass");
		
		RequestDispatcher rd = null;
		
		
		
		if((user.isEmpty())||(pwd.isEmpty()))
				
							
				 
		{
			out.println("<font color =red> Fields cannot be empty </font>");
			rd = request.getRequestDispatcher("Form2.html");
			}
		
		else if((user.equals("admin")) && (pwd.equals("admin")))
			rd = request.getRequestDispatcher("Admin2");
			
		else if((user.equals("admin")) && (!pwd.equals("admin")))
		{
		
			out.println("<font color =red> Wrong password </font>");
			rd = request.getRequestDispatcher("Form2.html");
			
		}
		
		else
			rd = request.getRequestDispatcher("User2");
			
		rd.include(request, response);
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
