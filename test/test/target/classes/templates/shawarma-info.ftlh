<!DOC TYPE html>
<html>
<head>
    <title>Шаурма</title>
</head>
<body>
    <h1>Шаурма</h1>
    <hr>
    <h4>Состав шаурмы</h4>
    <p><b>Лаваш</b> | ${shawarma.lavash}</p>
    <p><b>Салат</b> | ${shawarma.salad}</p>
    <p><b>Курица</b> | ${shawarma.chicken}</p>
    <p><b>Свинина</b> | ${shawarma.pork}</p>
    <p><b>Говядина</b> | ${shawarma.beef}</p>
    <p><b>Перец</b> | ${shawarma.pepper}</p>
    <p><b>Помидор</b> | ${shawarma.tomato}</p>
    <hr>
    <h3>Удалить шаурму</h3>
        <form action="/order/shawarma/delete/${shawarma.id}" method="post">
            <input type="submit" value="Удалить шаурму из заказа">
        </form>
</body>
</html>