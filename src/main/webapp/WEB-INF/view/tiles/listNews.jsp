<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" pageEncoding="UTF-8" %>


<div class="body-title">
    <a href="">all_news</a>>>
    <a href="">latest_news</a>
</div>

<c:forEach var="news" items="${listAllNews}">
    <%--    Расстояние между новостями--%>
    <div class="single-news-wrapper">
            <%--   Блок одной новости--%>
        <div class="single-news-header-wrapper">
            <div class="news-title">
                <c:out value="${news.creationDate}"/> <br>
                <c:out value="${news.title}"/> <br>
                <a href="<c:url value="/news/view"/>?id=${news.id}">посмотреть</a> &nbsp;&nbsp;
                <a href="<c:url value="/news/editForm"/>?id=${news.id}">изменить</a> &nbsp;&nbsp;
                <a href="<c:url value="/news/deleteOne"/>?id=${news.id}">удалить</a> &nbsp;&nbsp;
                <input type="checkbox" name="id" value="${news.id}"/>
            </div>
        </div>
    </div>
</c:forEach>

