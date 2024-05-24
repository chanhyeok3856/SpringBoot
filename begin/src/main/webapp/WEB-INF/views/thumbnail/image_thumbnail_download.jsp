<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>섬네일</title>
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
</head>
<body>
<div class="container p-3 my-3 border">
섬네일 페이지입니다.
</div>
<div class="container p-3 my-3 border">
-원본 이미지-<br>
<img src="./resources/img/${fileName}">
</div>
<div class="container p-3 my-3 border">
-섬네일 이미지-<br>
<img src="./resources/img/sm_${fileName}">
</div>
</body>
</html>