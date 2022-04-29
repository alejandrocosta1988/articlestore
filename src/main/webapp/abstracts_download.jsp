<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>
  
  <h1>Downloads</h1>
  
  <h2>Abstracts in annals</h2>
  
  <table>
  
    <thead>
      <tr>
        <th>Abstract title</th>
        <th>File format</th>
      </tr>
    </thead>
    
    <tbody>
    
      <tr>
        <td>The title for the first abstract</td>
        <td>
          <a href="/articlestore/${productCode}/example_file1.txt" target="_blank">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the second abstract</td>
        <td>
          <a href="/articlestore/${productCode}/example_file2.txt" target="_blank">PDF</a>
        </td>
      </tr>
      
      <tr>
        <td>The title for the third abstract</td>
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