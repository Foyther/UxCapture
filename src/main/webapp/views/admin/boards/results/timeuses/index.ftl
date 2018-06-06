<#if 0 < timeUses?size>
<div>Время прибывания:</div>

<div id="table-container">
    <table id="timeuses">
        <thead>
        <tr>
            <th onclick="sortTable($('#timeuses').find('tbody'), 1, 'tabledit-span', 'number')">Время</th>
            <th onclick="sortTable($('#timeuses').find('tbody'), 2, 'tabledit-span', 'string')">Экран</th>
            <th onclick="sortTable($('#timeuses').find('tbody'), 2, 'tabledit-span', 'string')">Приложение</th>
        </tr>
        </thead>

        <tbody>
            <#list timeUses as timeUse>
            <tr>
                <td>${timeUse.getTimeSeconds() ! ""}</td>
                <td>${timeUse.getDisplay().getName() ! ""}</td>
                <td>${timeUse.getDisplay().getApplication().getName() ! ""}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</div>

<div style="margin: 30px"></div>

<#else>

<div class="text center">Нет данных</div>

</#if>