<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar" %>
<%
	String code = request.getParameter("code"); 
	String viewPage = null;  // 이동하기 위한 페이지를 저장
	if(code.equals("1")){
		viewPage = "1.jsp";
	}else if(code.equals("2")){ 
		viewPage = "2.jsp";
	}else if(code.equals("3")){ 
		viewPage = "3.jsp";
	}

%>  
<% 	
    request.setCharacterEncoding("utf-8");
	Calendar cal = Calendar.getInstance();
	request.setAttribute("cal", cal);  // Object타입으로 저장
	request.setAttribute("age", 10);  
	request.setAttribute("addr", "서울"); 
	session.setAttribute("sesval", "sessionValue");
	
%>
from 페이지 입니다.
<jsp:forward page="<%= viewPage %>" > 
	<jsp:param value="안녕하세요." name="p2"/> 
	<jsp:param value="상지." name="p3"/>  
</jsp:forward>
	
</body>
</html>