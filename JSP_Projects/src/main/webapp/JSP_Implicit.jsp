<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<title>implicit-objects-demo.jsp</title>

<%
	String responseCheck = request.getParameter("office");

	if (responseCheck != null) {
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
	}

	String errorCheck = request.getParameter("error");
	//simulate throw error
	if (errorCheck != null) {
		int x = 0;
		if (x == 0)
			throw new RuntimeException("Exception has been raised");
	}
%>

<%
	int serverPort = request.getServerPort();
	out.println("The Server is running on port " + String.valueOf(serverPort) + "<br>");
	out.println("Servlet Name is " + config.getServletName() + "<br>");
	out.println("Server Info:" + application.getServerInfo() + "<br>");

	String pageName = page.toString();
	out.println("The name of the page is " + pageName + "<br>");

	pageContext.setAttribute("userid", "John Doe");
	out.println("userId attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");
%>
