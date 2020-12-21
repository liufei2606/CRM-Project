<!doctype html>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="js/jquery-1.12.4.js"></script>
</head>
<body>
<script>
    $(function () {
        $("#but").click(function () {
            $.ajax({
                url: "one",
                type: "get",
                datatype: "json",
                success: function (data) {
                    let json = JSON.parse(data);
                    alert(json) 
                }
            })
        });
    });
</script>
<button id="but">点击</button>
<div id="div1" style="width: 200px;height: 200px;background-color: pink">345</div>
<br><br>
<div id="div2" style="width: 200px;height: 200px;background-color: pink">123</div>
</body>
</html>