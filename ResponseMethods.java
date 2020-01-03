

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestMethods
 */
@WebServlet("/ResponseMethods")
public class ResponseMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("empname");
		String email = request.getParameter("email");
		int sal = Integer.parseInt(request.getParameter("sal"));
		String date = request.getParameter("date");
		String job = request.getParameter("job");
		String box[] = request.getParameterValues("box");
		
		

		out.println("Employee name is "+name+"<br>");
		out.println("Employee email-id is "+email+"<br>");
		out.println("Employee joining date is "+date+"<br>");
		//out.println("Employee job type is "+developer+"<br>");
		//out.println("Employee job type is "+tester+"<br>");
		out.println("Employee job type is "+job+"<br>");
		out.println("Employee Salary is "+sal);
		
		for(String s:box)
			out.println(s+" ");
		
		//out.println("response URI: "+ response.getresponseURI()+ "<br>");
		out.println("buffer size: "+ response.getBufferSize()+ "<br>");
		out.println("character encoding: "+ response.getCharacterEncoding()+ "<br>");
		out.println("content type: "+ response.getContentType()+ "<br>");
		out.println("get header: "+ response.getHeader(email)+ "<br>");
		out.println("get status: "+ response.getStatus()+ "<br>");
		out.println("get local: "+ response.getLocale()+ "<br>");
		out.println("get output stream: "+ response.getOutputStream()+ "<br>");
		out.println("get writer: "+ response.getWriter()+ "<br>");
		out.println("get headers: "+ response.getHeaders(name)+ "<br>");
		
		
		
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
