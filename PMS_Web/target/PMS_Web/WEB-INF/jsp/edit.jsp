<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="Value" items="${edit}">   
<form:form  action="http://localhost:8080/PMS_Web/update.do"   method="POST" modelAttribute="singlerow" > 

   <table>
     <tr>
        <td>
          <form:hidden path="projectid" value="${Value.projectid} "/>
          <form:label  path="ProjectName">ProjectName</form:label></td>
        <td><form:input path="ProjectName" value="${Value.projectName}" /></td>
     </tr>
     
      <tr>
        <td>
          <form:label  path="Client">Client</form:label></td>
          <td><form:input path="Client"  value="${Value.client}"/></td>
     </tr>
     
      <tr>
        <td>
          <form:label  path="StartDate">StartDate</form:label></td>
          <td><form:input path="StartDate" value="${Value.startDate}" cssClass="datepicker start"/></td>
     </tr>
     
     
      <tr>
        <td>
          <form:label  path="EndDate">EndDate</form:label></td>
          <td><form:input path="EndDate" value="${Value.endDate}"  cssClass="datepicker end"/></td>
          <tr>
            <td colspan="2"><input type="submit" value="Submit" class="btn lg-btn"  /></td>
          </tr>
   </table>



</form:form>
</c:forEach>
</body>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>   
 
			 <script>
  $(function() {
      $( ".datepicker" ).datepicker({ dateFormat: 'dd/mm/yy' });


  });
  </script> 
</html>