<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@page contentType="text/html; charset=UTF-8" %>

<div class="add-table-margin">
    <form:form action="saveNews" method="POST" modelAttribute="oneNews" acceptCharset="UTF-8">
        <form:hidden path="id"/>
        <table class="news_text_format">
            <tr>
                <td class="space_around_title_text">Заголовок</td>
                <td class="space_around_view_text">
                    <div class="word-breaker">
                        <form:textarea path="title" rows="2" maxlength="150" cols="57" style="resize: none;tab-size: 0"></form:textarea>
                        <form:errors path="title" cssClass="error" />
                    </div>
            </tr>



            <tr>
                <td class="space_around_title_text">Дата и время</td>
                <td class="space_around_view_text">
                    <div class="word-breaker">
                        <form:input type="datetime-local" path="creationDate"></form:input>
                    </div>
                </td>
            </tr>

            <tr>
                <td class="space_around_title_text">Контент</td>
                <td class="space_around_view_text">
                    <div class="word-breaker">
                        <form:textarea path="text" rows="15" cols="57" style="resize:none;tab-size: 0"></form:textarea>
                        <form:errors path="text" cssClass="error" />
                    </div>
                </td>
            </tr>

            <tr>
                <td class="space_around_title_text">Автор новости</td>
                <td class="space_around_view_text">
                    <div class="word-breaker" lang="ru">
                        <c:out value="Заглушка автор"/>
                    </div>
                </td>
            </tr>
        </table>

        <div class="save-button">
            <input type="submit" value="Сохранить"/>
        </div>
    </form:form>

    <div class="cancel-button">
        <form action="<c:url value="/news/list"/>" method="get">
            <input type="submit" value="Отмена">
        </form>
    </div>
    <br>
</div>

