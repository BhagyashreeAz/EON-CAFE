<%@page import="com.model.Vendor"%>
<%@page import="com.dao.VendorDaoImpl"%>
<%@page import="com.dao.VendorDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		VendorDao vendorDao = new VendorDaoImpl();
		List<Vendor> vendorList = vendorDao.getAllVendors();

		
	%>

	<table border=1>
		<tr>
			<td>VendorId</td>
			<td>VendorName</td>
			<td>VendorPassword</td>
			<td>VendorEmail</td>

		</tr>

		<%
			for (Vendor e : vendorList) {
		%>
		<tr>
			<td><%=e.getVid()%></td>

			<td><%=e.getVname() %></td>
			<td><%=e.getVpassword() %></td>
			<td><%=e.getVemail() %></td>

		</tr>

		<%
			}
		%>

	</table>


	<form action="ViewAdminOperation.jsp" method="post">
		<input type="submit" value="GO TO OPERATIONS PAGE" />
	</form>


















</body>
</html>