package demo03_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/third")
@WebServlet(value="/third", loadOnStartup=2, initParams={@WebInitParam(name="greet", value="Good Night!")})
public class ThirdServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("ThirdServlet.init() called.");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Third</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Third Servlet</h3>");
		String message = this.getInitParameter("greet");
		out.println(message);
		out.println("</body>");
		out.println("</html>");
	}
}
