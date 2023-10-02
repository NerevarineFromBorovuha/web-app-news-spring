<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="wrapper">
    <div class="newstitle">Грустные новости <br>
        <font size=3>Других новостей у нас для вас нет</font>
    </div>

    <div class="local-link">
            <a href=""><font color=#800000>Русский</font> </a> &nbsp;&nbsp;
            <a href=""><font color=#800000>Английский</font> </a> <br /> <br />
    </div>

    <div class="header-form">
        <form action="" method="post">
            <input type="hidden" name="command" value="do_sign_in" />
            Логин &nbsp;
            <input type="text" name="login" value="" /><br />
            Пароль
            <input type="password" name="password" value="" /><br />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="submit"  formaction="">Регистрация</button>
            <input type="submit" value="Войти"  /><br />

        </form>

    </div>

</div>