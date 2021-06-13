<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar" %>
<% 
	String view = request.getParameter("page"); 
	if(view == null){
		view = "home.jsp"; 
	}else{
		view = view + ".jsp";
	}
	int i = 10; 
	Calendar cal = Calendar.getInstance(); 
	request.setAttribute("cal", cal);   
	request.setAttribute("i", i);	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1 width="500">
	<tr><td colspan="2"><%@ include file="topMenu.jsp" %></td></tr>
	<tr><td width="150" height="500">
			<%@ include file="leftMenu.jsp" %>
		</td>
		<td width="350">			
			<br /><jsp:include page="<%= view %>" >
						<jsp:param value="10" name="p2" />
					</jsp:include>
		</td></tr>
	<tr><td colspan="2">
			<%@ include file="footer.jsp" %>
	</td></tr>								
</table>
</body>
</html>