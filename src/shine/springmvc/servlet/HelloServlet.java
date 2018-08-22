package shine.springmvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import shine.springmvc.Person;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		//super();		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("Got request ");
		resp.setContentType("text/html");
		resp.setHeader("Content-Type", "text/html;charset-UTF-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		ServletContext servletContext = getServletContext();
		ApplicationContext ctx = (ApplicationContext)servletContext.getAttribute("SpringCtx");
		Person p = (Person)ctx.getBean("helloBean");
		out.print("<html><head><title>my first servlet</title></head><body>runinig Hello servlet");
		out.println("Got instance of Person");
		out.println(p.getName());
		out.println("</body></html>");
	}
}
