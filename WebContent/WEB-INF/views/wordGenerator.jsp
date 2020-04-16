<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.time.LocalDateTime" import="java.time.format.DateTimeFormatter" import="tomassarmiento.web.models.RandomWordGenerator"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Random Word Generator</title>
	</head>
	<body>
			<% 
				
				RandomWordGenerator random = new RandomWordGenerator();
				session.setAttribute("word", random.randomWordGenerator());
				
				LocalDateTime myDateObj = LocalDateTime.now();
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			    String formattedDate = myDateObj.format(myFormatObj);
			%>
		<h2>You have generated a word <%= session.getAttribute("count") %> times</h2>
		<input type="text" name="randomWord" id="t1">
		<a href="WordGenerator"><button>Generate</button></a>
		<h2 id="lasttime"></h2>
		
		<script>
		if("<%=session.getAttribute("showingWord")%>"!="null"){
			var RandomWord = "<%= session.getAttribute("showingWord") %>"
			document.getElementById("t1").value = RandomWord;
			document.getElementById("lasttime").innerHTML = "Last time you generated a word was: <%= formattedDate %>"
		}
		</script>
	</body>
</html>