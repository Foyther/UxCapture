<#include '../base.ftl'>

<#macro title>Вход в админку</#macro>

<#macro stylesheets>
<link href="/css/style.css" rel="stylesheet" media="screen">
<link href="/css/singin.css" rel="stylesheet" media="screen">
</#macro>

<#macro javascripts>
<script src="/js/jquery.min.js"></script>
</#macro>

<#macro body>
<div class="container">
    <form class="form-center-content" action="/admin/login/process" method="post">
        <div class="form-signin-heading">Вход</div>
        <div class="title center">Панель для администратора UxCapture</div>
        <div class="text center">Расширенный функционал для просмотра результатов и установок собственных параметров
        </div>

        <#if error??>
        <div class="error_text">
            Не верный логин или пароль
        </div>
        </#if>

        <label for="inputName" class="sr-only">Имя</label>
        <input name="login" value="" type="text" id="inputName" class="form-control" placeholder="Имя" required="" autofocus="">
        <label for="inputPassword" class="sr-only">Пароль</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Пароль" required="">
        <button name="submit" class="login-button" type="submit">Войти</button>
        <a class="register-button" href="/">Сайт</a>
        <div class="text right" style="color: black">ИТИС 2018</div>

    </form>

</div>
</#macro>

<@display_page/>