package com.carrx.web.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static String encoding;

	@Override
	public void init() throws ServletException {
		encoding = this.getInitParameter("encoding");
		p("FirstServlet init...");
		super.init();
	}

	@Override
	public void destroy() {
		p("FirstServlet destroy...");
		super.destroy();
	}

	@Override
	protected long getLastModified(HttpServletRequest req) {
		return super.getLastModified(req);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(encoding);// 设置请求编码
		resp.setCharacterEncoding(encoding);// 设置响应编码
		resp.setContentType("text/html");// 设置文档响应类型

		p("req.getRequestURI():" + req.getRequestURI());
		p("req.getRequestURL():" + req.getRequestURL());

		p("req.getContextPath()" + req.getContextPath());
		// p("" + );

		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.print("<head><title>A Servlet</title></head>");
		pw.println("<body>");
		pw.println("hahah");
		pw.println("</body>");
		pw.println("</html>");
	}

	private void p(String str) {
		System.out.println(str);
	}
}
