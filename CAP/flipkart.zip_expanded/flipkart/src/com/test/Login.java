package com.test;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		
		String pass = request.getParameter("pwd");
		
		
		if(user.equals("admin") && pass.equals("admin"))
		{
			//out.println("Login success.");
			
			//RequestDispatcher rd = request.getRequestDispatcher("home.html");
			//rd.forward(request, response);
			
			response.sendRedirect("https://www.flipkart.com/?gclid=CjwKCAjwhMmEBhBwEiwAXwFoESo6r2N2H045ZHDTNqSb4uaGE-dqke98RMT8T3a5YBm6K0blQeuiKRoCbQIQAvD_BwE&ef_id=CjwKCAjwhMmEBhBwEiwAXwFoESo6r2N2H045ZHDTNqSb4uaGE-dqke98RMT8T3a5YBm6K0blQeuiKRoCbQIQAvD_BwE:G:s&s_kwcid=AL!739!3!501550418287!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_city_nc_goog");
		}
		else 
		{
			out.println("<font color = 'red'>login failed please try again</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
