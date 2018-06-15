<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
<div>
<%
//UserBean userBean=(UserBean)request.getAttribute("userBean");
String em=(String)request.getAttribute("errorMessage");
%>
<font color='red'>Welcome:-<%=em%></font>
<font color='red'>Welcome:-<%=em%></font>
</div>
</body>
</html>