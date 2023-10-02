<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <%--    <link rel="stylesheet" type="text/css" href="resources/css/GeneralStyle.css">--%>
    <link href="<c:url value="/resources/css/GeneralStyle.css"/>" rel="stylesheet">
</head>
<body>
<%--Шаблон страницы--%>
<div class="page">
    <%--Верхняя часть--%>
    <div class="header">
        <c:import url="/WEB-INF/view/tiles/header.jsp"/>
    </div>

    <%--Центральная часть--%>
    <div class="base-layout-wrapper">
        <%--Меню слева--%>
        <div class="menu">
            <div align=center>
                <c:import url="/WEB-INF/view/tiles/menu.jsp"/>
            </div>
        </div>
        <%--Основной контент--%>
        <div class="content">


            <c:import url="/WEB-INF/view/tiles/listNews.jsp"/>
        </div>
    </div>

    <%--Нижняя часть сайта--%>
    <div class="footer">
        <c:import url="/WEB-INF/view/tiles/footer.jsp"/>
    </div>

</div>
</body>
</html>
