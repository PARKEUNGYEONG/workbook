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

    <ul>
        <c:forEach var="dto" items="${list}">
            <li>${dto}</li>
        </c:forEach>
    </ul>

    <ul><!--반복문 , 1부터 10까지의 숫자를 출력-->
        <c:forEach var="num" begin="1" end="10">
            <li>${num}</li>
        </c:forEach>
    </ul>

    <!--List<TodoDTO>의 size()를 이용해서 홀수/짝수 여부를 표시할때 -->
    <c:if test="${list.size()%2==0}">
        짝수
    </c:if>
    <c:if test="${list.size()%2!=0}">
        홀수
    </c:if>

    <!--위의 형식에서 else에 대한 처리를 하고 싶을때 choose를 이용해서 쓰는 방법-->
    <c:choose>
        <c:when test="${list.size()%2==0}">
        짝수
        </c:when>
        <c:otherwise>
            홀수
        </c:otherwise>
    </c:choose>

    <c:set var="target" value="5"></c:set>

    <!--c:set을 이용해서 변수를 생성하고 사용.아래코드는 target이라는 변수를 선언하고 반복문 내부에서 c:if를 이용하는 방식으로 작성-->
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num ==target}">
                num is target
            </c:if>
        </c:forEach>
    </ul>

</body>
</html>
