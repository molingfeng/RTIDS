package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloWorld extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=GBK");//support Chinese
		System.out.println("doGet......");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>中文已经可以显示了！System works!!</h1>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}

	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<head><title>Servlet</title></head>");
//		out.println("<body>");
//		out.println("<h1>Hello Worid!!</h1>");
//		out.println("</body></html>");
//		out.flush();
//		out.close();
//	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost......");
		doGet(req, resp);
	}


	private static final long serialVersionUID = 1L;

}
