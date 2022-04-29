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
    <a href="download?action=checkUser&productCode=articles">Articles in Journals</a><br>
    <a href="download?action=checkUser&productCode=bookchapters">Chapters in Books</a><br>
    <a href="download?action=checkUser&productCode=abstracts">Abstracts in Annals</a><br>
  </p>
  
  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
</body>
</html>