<#include '../base.ftl'>

<#macro title>UxCapture</#macro>

<#macro stylesheets>
<link href="css/site/style.css" rel="stylesheet" media="screen">
<link href="css/style.css" rel="stylesheet" media="screen">
<link href="css/glyphicon.css" rel="stylesheet" media="screen">
<link href="css/loading.css" rel="stylesheet" media="screen">
<link href="css/jquery-ui.min.css" rel="stylesheet" media="screen">
<link href="css/jquery-ui.structure.min.css" rel="stylesheet" media="screen">
<link href="css/jquery-ui.theme.min.css" rel="stylesheet" media="screen">
</#macro>

<#macro javascripts>
<script src="js/jquery.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/datepicker-ru.js"></script>

<script type="text/javascript">

    var contentContainer;
    var loadingIndicator;

    $(document).ready(function () {
        contentContainer = $('#content');
        loadingIndicator = $('#circleG');

        loadingIndicator.hide();
    });

    function loadContent(url, title, addToHistory) {
        if (url != undefined && contentContainer != undefined) {

            loadingIndicator.show();
            contentContainer.hide();

            $.ajax({
                url: url,
                type: "GET"
            }).done(function (data) {
                document.title = title;

                loadingIndicator.hide();

                $(document).scrollTop(0);

                contentContainer.fadeTo(200, 1);
                contentContainer.html(data);

                if (addToHistory) {
                    window.history.pushState({"html": data, "pageTitle": title}, title, url);
                }
            }).fail(function (data) {
                showDialog('Ошибка с сервера', 'Статус: ' + data.status);
            });
        }
    }

    function showDialog(title, message) {
        var dialogMessage = $("<div/>");
        var messageContainer = $('<p/>', {
            html: message
        });
        dialogMessage.append(messageContainer);

        dialogMessage.dialog({
            title: title,
            modal: true,
            buttons: {
                "Закрыть": function () {
                    $(this).dialog("close");
                }
            }
        });
    }

</script>
</#macro>

<#macro body>

<div class="image-top-logo"></div>
<div style="margin-top: 80px;"></div>

<div id="circleG" style="margin-top: 12%; margin-bottom: 12%">
    <div class="title center" style="color: #575757">Загрузка</div>
    <div id="circleG_1" class="circleG"></div>
    <div id="circleG_2" class="circleG"></div>
    <div id="circleG_3" class="circleG"></div>
</div>

<div id="content">

    <#if content=='main'>
        <#include 'main.ftl'>
    </#if>

</div>

<#--onclick="loadContent('/contacts', 'Контакты', true)" class="button-secondary"-->

<div class="footer">
<div class="center" style="width:80%; color: white"><div class="image-bottom-logo"></div>ИТИС, 2018</div>
</div>

<!-- /container -->

</#macro>

<@display_page/>