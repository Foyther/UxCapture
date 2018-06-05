<#if apps??>
<div>Приложения:</div>

<div id="table-container">
    <table id="apps">
        <thead>
        <tr>
            <th onclick="sortTable($('#schedule').find('tbody'), 0, 'tabledit-span', 'number')">#</th>
            <th onclick="sortTable($('#schedule').find('tbody'), 1, 'tabledit-span', 'string')">Название</th>
        </tr>
        </thead>

        <tbody>
            <#list apps as application>
            <tr>
                <td>${application.getId() ! ""}</td>
                <td>${application.getName() ! ""}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</div>

<div style="margin: 30px"></div>

<script type="text/javascript">

    $('#apps').Tabledit({
        url: '/apps',
        inputClass: 'input_green',
        editButton: true,
        buttons: {
            edit: {
                class: 'button button-edit-table',
                html: '<span class="glyphicon glyphicon-pencil"></span>',
                action: 'edit',
                method: 'POST'
            },
            delete: {
                class: 'button button-edit-table',
                html: '<span class="glyphicon glyphicon-trash"></span>',
                action: 'delete',
                method: 'DELETE'
            },
            save: {
                class: 'button button-save',
                html: 'Сохранить'
            },
            restore: {
                class: 'button btn-sm btn-warning',
                html: 'Восстановить',
                action: 'restore'
            },
            confirm: {
                class: 'button button-delete',
                html: 'Подтвердить'
            }
        },
        columns: {
            identifier: [0, 'id'],
            editable: [[1, 'name']]
        }
    });

</script>
<#else>

<div class="text center">Нет приложений</div>

</#if>