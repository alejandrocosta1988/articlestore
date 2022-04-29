<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>
  
  <h1>Downloads</h1>
  
  <h2>Chapters in books</h2>
  
  <table>
  
    <thead>
      <tr>
        <th>Chapter title</th>
        <th>File format</th>
      </tr>
    </thead>
    
    <tbody>
    
      <tr>
        <td>The title for the first chapter</td>
        <td>
          <a href="/articlestore/${productCode}/example_file1.txt" target="_blank">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the second chapter</td>
        <td>
          <a href="/articlestore/${productCode}/example_file2.txt" target="_blank">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the third chapter</td>
        <td>
          <a href="/articlestore/${productCode}/example_file3.txt" target="_blank">PDF</a>
        </td>
      </tr>
      
    </tbody>
  
  </table>

  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
</body>
</html>