

<h3>Hello JSP World</h3>

<% out.println("Happy JSP learning"); 
	session.setAttribute("count", 5);
	
	out.println("SERVER INFO IS : " + application.getServerInfo() ) ;
	
	
	request.getParameter("id");

%>