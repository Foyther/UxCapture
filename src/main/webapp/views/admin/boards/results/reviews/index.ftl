<#if 0 < reviews?size>
<div>Отзывы:</div>

<div id="table-container">
    <table id="reviews">
        <thead>
        <tr>
            <th onclick="sortTable($('#reviews').find('tbody'), 1, 'tabledit-span', 'number')">Текст</th>
            <th onclick="sortTable($('#reviews').find('tbody'), 2, 'tabledit-span', 'string')">Экран</th>
        </tr>
        </thead>

        <tbody>
            <#list reviews as review>
            <tr>
                <td>${review.getText() ! ""}</td>
                <td>${review.getDisplay().getName() ! ""}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</div>

<div style="margin: 30px"></div>

<#else>

<div class="text center">Нет данных</div>

</#if>