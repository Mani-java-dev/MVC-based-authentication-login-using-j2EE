<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1> <% out.print(session.getAttribute("name")+" welcome");  %> </h1>
  <a href="/MvcAuthentication/logout"><input type="button" value="logout"></input></a>
   
   <div>
 
     <img src=""/>
   </div>
   <form action="/MvcAuthentication/upload" method="post" enctype="multipart/form-data">
        select file:<input type="file" name="file"/>
        <input type="submit" value="upload"/>
   </form>

</body>
</html>