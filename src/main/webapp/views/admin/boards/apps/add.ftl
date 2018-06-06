<div id="table-container">
    <table>
        <thead>
        <tr>
            <th>#</th>
            <th>Название</th>
            <th></th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>#</td>
            <td><input id="text" class="input_green"/></td>
            <td>
                <button class="button button-save" onclick="sendAjax()">Сохранить</button>
            </td>
        </tr>

        </tbody>
    </table>
</div>

<script type="text/javascript">
    function sendAjax() {

        var text = $('#text').val();
        if (!text) return;

        var request = $.ajax({
            url: '/apps',
            type: 'POST',
            data: {
                'name': text
            }
        });

        request.done(function (data) {
            if (data.code == 0) {
                back();
            } else {
                showDialog('Ошибка с сервера', 'Не удалось создать критерий');
            }
        });

        request.fail(function (data) {
            showDialog('Ошибка с сервера', 'Статус: ' + data.status);
        });
    }
</script>