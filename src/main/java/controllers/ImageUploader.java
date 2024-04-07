package controllers;

import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ImageUploader
 */
@WebServlet("/upload")
@MultipartConfig(
  fileSizeThreshold=1024*1024*1,
  maxFileSize=1024*1024*10,
  maxRequestSize=1024*1024*100
)
public class ImageUploader extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      Part file=request.getPart("file");
	      String filename=file.getSubmittedFileName();
	      String path="/home/mk/eclipse-workspace/MvcAuthentication/src/main/webapp/WEB-INF/images/"+filename;
	      
	      file.write(path);
	      
	      HttpSession session=request.getSession();
	      
	      session.setAttribute("link", path);
	      
	      response.sendRedirect("Home.jsp");
	}

}
