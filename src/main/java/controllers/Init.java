package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Model;
/**
 * Servlet implementation class Init
 */


@WebServlet("/Auth")
public class Init extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		String name=request.getParameter("fname");
		
		String password=request.getParameter("lname");
		
		Model model=new Model();
		model.setName(name);
		model.setPassword(password);
		
		HttpSession session=request.getSession();
		
		if(model.getName().equals("mani")&&model.getPassword().equals("mani"))
		{
			response.sendRedirect("Home.jsp");
			
			session.setAttribute("name",name );
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
		
	}

}
