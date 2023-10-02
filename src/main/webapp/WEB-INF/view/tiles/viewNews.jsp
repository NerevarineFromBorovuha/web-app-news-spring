<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>

<div class="body-title">
    <a href="">all_news</a>>>
    <a href="">latest_news</a>
</div>

<div class="add-table-margin">
    <table class="news_text_format">
        <tr>
            <td class="space_around_title_text">Заголовок</td>
            <td class="space_around_view_text">
                <div class="word-breaker" lang="ru">
                    <c:out value="${oneNews.title}" />
                </div></td>
        </tr>

        <tr>
            <td class="space_around_title_text">Дата создания</td>
            <td class="space_around_view_text"><div class="word-breaker" lang="ru">
                <c:out value="${oneNews.creationDate}" />
            </div></td>
        </tr>

        <tr>
            <td class="space_around_title_text">Дата последнего изменения</td>
            <td class="space_around_view_text"><div class="word-breaker" lang="ru">
                <c:out value="${oneNews.lastEditDate}" />
            </div></td>
        </tr>

        <tr>
            <td class="space_around_title_text">Автор новости</td>
            <td class="space_around_view_text"><div class="word-breaker" lang="ru">
                <c:out value="Заглушка автор" />
            </div></td>
        </tr>

        <tr>
            <td class="space_around_title_text">Текст новости</td>
            <td class="space_around_view_text"><div class="word-breaker" lang="ru">
                <c:out value="${oneNews.text }" />
            </div></td>
        </tr>

    </table> <br>

<form:form action="saveComment" method="POST" modelAttribute="oneNews" acceptCharset="UTF-8">


</form:form>




    <c:forEach var="comment" items="${oneNews.comments }">

        <c:out value="${comment.text}"/> <br>
        <a href="<c:url value="/news/deleteOneComment"/>?idComment=${comment.id}&idNews=${oneNews.id}">удалить</a> <br>




    </c:forEach>


</div>

