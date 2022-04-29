<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>

  <h1>Register to download</h1>
  <p>To register for our downloads, enter your name and e-mail address below. Then, click on Register button. You only need to do this once.</p>
  
  <form>
    
    <label for="email">E-mail: </label>
    <input type="email" name="email"><br>
    
    <label for="first-name">First name: </label>
    <input type="text" name="first-name"><br>
    
    <label>Last name: </label>
    <input type="text" name="last-name"><br>
    
    <input type="submit" value="Register">
    
  </form>
  
  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
  
</body>
</html>