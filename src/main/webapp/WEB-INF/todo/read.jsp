<%--
  Created by IntelliJ IDEA.
  User: seongjun
  Date: 2023/06/14
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--read.jsp같은 경우 TodoReadController에서 보내준 TodoDTO객체를 dto라는 이름으로 받아 EL을 통해서 출력한다.-->
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>${dto.tno}</div>
    <div>${dto.title}</div>
    <div>${dto.dueDate}</div>
    <div>${dto.finished}</div>
</body>
</html>
