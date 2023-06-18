<!DOC TYPE html>
<html>
<head>
    <title>Песни</title>
</head>
<body>
    <h1>Заказ</h1>
    <hr>
    <h4>Состав заказа</h4>
        <#list shawarmas as shawarma>
            <div>
                <p><b>Шаурма</b> | <a href="/order/shawarma/${shawarma.id}">Состав</a></p>
            </div>
            <#else>
                <h3>Вы пока ничего не добавили</h3>
        </#list>
        <hr>
        <h3>Добавить шаурму</h3>
            <form action="/order/add-shawarma" method="post">
                Лаваш : <input type="number" name="lavash"/> <br><br>
                Салат : <input type="number" name="salad"/> <br><br>
                Курица : <input type="number" name="chicken"/> <br><br>
                Свинина : <input type="number" name="pork"/> <br><br>
                Говядина : <input type="number" name="beef"/> <br><br>
                Перец : <input type="number" name="pepper"/> <br><br>
                Помидоры : <input type="number" name="tomato"/> <br><br>
                <input type="submit" value="Добавить шаурму в заказ">
            </form>
          <form action="/order/save" method="post">
                <input type="submit" value="Сохранить заказ">
          </form>
</body>
</html>