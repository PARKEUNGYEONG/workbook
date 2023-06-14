<%--
  Created by IntelliJ IDEA.
  User: seongjun
  Date: 2023/06/09
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!--jsp에 jstl을 이용하기 위해 태그 관련 설정-->

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>

${list}
${list[0].tno} --- ${list[0].title} <!--10개의 TodoDTO중에서 첫번째 TodoDTO의 tno와 title을 출력하고자 할떄 getTno(),getTitle대신 작성하는 형식-->

    <ul>
        <c:forEach var="dto" items="${List}">
            <li>${dto}</li>
        </c:forEach>
    </ul>
</body>
</html>
