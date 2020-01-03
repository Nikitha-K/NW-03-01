

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
@WebServlet("/RequestMethods")
public class RequestMethods extends HttpServlet {
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
		
		out.println("Request URI: "+ request.getRequestURI()+ "<br>");
		out.println("Local address: "+request.getLocalAddr()+"<br>");
		out.println("Local name: "+request.getLocalName()+"<br>");
		out.println("Local port: "+request.getLocalPort()+"<br>");
		out.println("Server name: "+request.getServerName()+"<br>");
		out.println("Content type: "+request.getContentType()+"<br>");
		out.println("Content length: "+request.getContentLength()+"<br>");
		out.println("Servlet path: "+request.getServletPath()+"<br>");
		out.println("RemoteAddress: "+request.getRemoteAddr()+"<br>");
		out.println("RequestURL: "+request.getRequestURL()+"<br>");
		out.println("Auth Type: "+request.getAuthType()+"<br>");
		out.println("Character Encoding: "+request.getCharacterEncoding()+"<br>");
		out.println("ContextPath: "+request.getContextPath()+"<br>");
		out.println("Date header: "+request.getDateHeader(date)+"<br>");
		out.println("get header: "+request.getHeader(name)+"<br>");
		out.println("get method: "+request.getMethod()+"<br>");
		out.println("path info: "+request.getPathInfo()+"<br>");
		out.println("path translated: "+request.getPathTranslated()+"<br>");
		out.println("protocol: "+request.getProtocol()+"<br>");
		out.println("query string: "+request.getQueryString()+"<br>");
		out.println("Remote address: "+request.getRemoteAddr()+"<br>");
		out.println("Remote host: "+request.getRemoteHost()+"<br>");
		out.println("Remote port: "+request.getRemotePort()+"<br>");
		out.println("Remote user: "+request.getRemoteUser()+"<br>");
		out.println("Requested session id "+request.getRequestedSessionId()+"<br>");
		out.println("principal user: "+request.getUserPrincipal()+"<br>");
		
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
