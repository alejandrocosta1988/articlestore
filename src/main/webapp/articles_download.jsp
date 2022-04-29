<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>
  
  <h1>Downloads</h1>
  
  <h2>Articles in Journals</h2>
  
  <table>
  
    <thead>
      <tr>
        <th>Article title</th>
        <th>File format</th>
      </tr>
    </thead>
    
    <tbody>
    
      <tr>
        <td>The title for the first article</td>
        <td>
          <a href="#">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the second article</td>
        <td>
          <a href="#">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the third article</td>
        <td>
          <a href="#">PDF</a>
        </td>
      </tr>
      
    </tbody>
  
  </table>

  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
</body>
</html>