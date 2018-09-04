<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.xc.study.framework.springmvc.inaction.bean.po.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Spittles</title>
</head>
<body>
	<h1>Welcome to Spittr</h1>
	<a href="<c:url value="/spittles" />">Spittles</a>
	<a href="<c:url value="/spitter/register" />">Register</a>
	<%
		/* 		List<Spittle> list = (List<Spittle>) request.getAttribute("spittleList");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getMessage());
			} */

			SpittlePO obj = (SpittlePO) request.getAttribute("spittle");
			System.out.println(obj.getMessage());
	%>

	<c:forEach items="${requestScope.spittleList}" var="spittle">
		<div>
			<c:out value="${spittle.message }"></c:out>
		</div>
	</c:forEach>

</body>
</html>