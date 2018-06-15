<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
<div>
<%
UserBean userBean=(UserBean)request.getAttribute("userBean");
%>
<font color='green'>Welcome:-<%=userBean.getUserName()%></font>
<font color='green'>Welcome:-<%=userBean.getPassword()%></font>
</div>
</body>
</html>