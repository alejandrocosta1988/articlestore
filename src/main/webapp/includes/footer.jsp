<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.time.LocalDate" %>

<%
  int currentYear = LocalDate.now().getYear();
%>

<p>Article Store is a project to practice web development with JavaServer Pages (JSP) and Servlets.</p>
<p>&copy; <%= currentYear %> Alejandro Costa &amp; Ichthys Systems</p>