<form id="criterion-form">
    <label>Название
        <input name="name" class="input_green"/>
    </label>
    <label>Минимальное значение
        <input name="minvalue" type="number" class="input_green"/>
    </label>
    <label>Максимальное значение
        <input name="maxvalue" type="number" class="input_green"/>
    </label>
    <label></label>
    <label>
    Приложения:
    <select class="input_green" name="apps" style="font-size: 22px; height: 100px" multiple>
    <#list apps as app>
        <option value="${app.getId()}">${app.getName()}</option>
    </#list>
    </select>
    </label>

    <button type="submit" class="button button-save">Сохранить</button>
</form>


<script type="text/javascript">

    var form = $('#criterion-form');

    form.submit(function () {
        var request = $.ajax({
            url: '/criterions',
            contentType: 'application/json; charset=utf8',
            type: 'POST',
            data: JSON.stringify(form.serializeObject())
        });

        request.done(function (data) {
            if (data.code == 0) {
                back();
            }
        });

        request.fail(function (data) {
            showDialog('Ошибка с сервера', 'Статус: ' + data.status);
        });

        return false;
    });

</script>