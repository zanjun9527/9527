<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script  src="js/jquery-1.8.3.min.js">
 </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="aaa" action="/addTalentsBind" >

输入年龄：<input id="age" name="age" value=""/><br>

输入性别：<input id="sex" name="sex" value=""/><br>

输入高度：<input id="high" name="high" value=""/><br>



<input id="book1" name="user[0]" value="1"/>
<input id="book2" name="user[0]" value="1"/>
<input id="book3" name="user[0]" value="1"/>

<input id="book3" name="user[1]" value="2"/>
<input id="book3" name="user[1]" value="2"/>
<input id="book3" name="user[1]" value="2"/>


<button type="submit" >提交</button>

</form>





nihao ma 
<!-- <input type="button" value="疯狂点击" id="ni"/> -->

<button id="ni"  type="button" onclick="addtalents()">保存</button>
</body>

<script type="text/javascript">


function addtalents(){
			   $.ajax({
		             type: "post",
		             url: "/addTalents",
		             data: {"a":"nihao"},
		             dataType: "json",
		             success: function(data){
		            	 if(data.code==200){
		            		 alert('获取数据成功'+data.result)
		            		 
		            	 }else{
		            		 alert('获取数据失败')
		            	 }     
		                      }
		         });
		}


</script>
</html>