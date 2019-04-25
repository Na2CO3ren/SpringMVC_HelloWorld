<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h4>Welcome Robin!</h4>

<%--注意这里的requestScope.time实际上相当于request.getAttribute("time")--%>
<%--会在requestScope中搜索"time"属性--%>
    time: ${requestScope.time }

    <br> <br>
    request name: ${requestScope.robin }

    <br> <br>
    session name: ${sessionScope.robin }

    <br> <br>
    user: ${requestScope.user }

    <br> <br>
    jinglan user: ${requestScope.jinglan }

    <br> <br>
    <fmt:message key="i18n.username"/>

    <br> <br>
    <fmt:message key="i18n.password"/>

</body>
</html>
