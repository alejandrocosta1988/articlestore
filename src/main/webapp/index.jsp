<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>
  <h1>List of published articles</h1>
  
  <p>
    <a href="download?action=checkUser&productCode=cat01">Articles in Journals</a><br>
    <a href="download?action=checkUser&productCode=cat02">Chapters in Books</a><br>
    <a href="download?action=checkUser&productCode=cat03">Abstracts in Annals</a><br>
  </p>
  
  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
</body>
</html>