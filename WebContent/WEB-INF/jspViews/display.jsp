<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Posts</title>
</head>
<body>
<center>
<h1 style="display:inline-block;">Kloudone Project</h1><br/><br/>
<h3><a  href="index.jsp">Home</a></h3>
<h2 align="center">Login</h2>
<p>${PostBean.body}</p>
<p>${PostBean.title}</p>
<f:form action="comment.html" modelAttribute="commentbean">
    <table>
    <tr><td><label for="Body">Comment</label></td>
    <td><f:textarea path="body" id="Content" name="Content" rows="5" cols="35"/>
    </td></tr>
    <tr><td colspan="1"><button class="button" style="vertical-align:middle"><span>Submit </span></button></td></tr>
    <tr><td colspan="2"><font style="font-family:sans serif;" color="red">${message}</font></td></tr>
  </table>
</f:form>
 <a href="forum.html">Add Post</a>
</center>


</body>
</html>