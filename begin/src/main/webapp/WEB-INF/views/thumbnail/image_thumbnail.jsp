<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드</title>
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$("input[name='file']").change(function(){
		var str = $(this).val();
		var fileName = str.split('\\').pop().toLowerCase();
		checkFileName(fileName);
	});
});
function checkFileName(str){
	var extension = str.split('.').pop().toLowerCase();
	if($.inArray(extension, [ 'jpg', 'png', 'jpeg', 'gif']) == -1) {
		alert(extension+'파일은 업로드 하실 수 없습니다.');
		$("#file").val("");
		return;
	}
	var pattern = /[\s\{\}\/?,;:|*~`!^\+<>@\#$%&\\\=\'\"]/;
	if(pattern.test(str)){
		alert('파일명에 공백문자와 특수문자는 들어갈 수 없습니다');
		$("#file").val("");
		return;
	}
}
</script>
</head>
<body>
<div class="container p-3 my-3 border">
<div class="row">
<div class="col-md-5">
<div class="card-body">
<form method="post" enctype="multipart/form-data" id="signupForm">
<fieldset>
<div class="form-group row">
<div class="ml-sm-4">
<input type="file" name="file" id="file" class="form-control-file">
</div>
</div>
<div class="form-group ml-sm-2">
<button type="submit" class="btn btn-primary btn-sm" onchange="return fileValidation( );">
전송
</button>
<button type="reset" class="btn btn-primary btn-sm"> 취소 </button>
</div>
</fieldset>
</form>
</div>
</div>
</div>
</div>
</body>
</html>