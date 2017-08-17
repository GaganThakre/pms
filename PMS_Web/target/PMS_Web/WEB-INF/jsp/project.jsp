<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style>
.label{
 color:red;
}
.project_table  {
    border: 1px solid black;
}
  .tdt,th,tr {
    border: 1px solid black;
}
.tdt{
   text-align:center;
}
</style>

 
</head>
<body>
     <form:form method="POST" action="Registerd.do" modelAttribute="project" autocomplete="off">
     
        <table width="100%" border="0">
          <tr>
            <td><div class="form-control">
               
                <label>
                  <p>
                     ProjectName<small class="required"></small>
                  </p> <form:input path="ProjectName" class="inputControl inptlogin"
                     maxlength="50" id="ProjectName" /> </label>
                     <span> <form:errors path="ProjectName" class="label error-label"></form:errors></span>
              </div></td>
          </tr>
          
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     Client<small class="required"></small>
                  </p> <form:input path="Client" class="inputControl inptlogin" 
                     maxlength="50" id="Client" /> </label>
                     <span><form:errors path="Client" class="label error-label"></form:errors></span>
              </div></td>
          </tr>
          
            <td><div class="form-control">
                
                <label>
                  <p>
                     StartDate<small type="date" class="required"></small>
                  </p> <form:input path="StartDate" cssClass="datepicker start"  
                     maxlength="50" id="datepicker" /> 
                     <span><form:errors path="StartDate" class="label error-label"></form:errors></span>
              </div></td>
          </tr>
          <tr>
            <td><div class="form-control">
               
                <label>
                  <p>
                     EndDate<small class="required"></small>
                  </p> <form:input type="date" path="EndDate" cssClass="datepicker end" 
                     maxlength="50" id="datepick" /> </label>
                      <span><form:errors path="EndDate" class="label error-label"></form:errors></span>
              </div></td>
          </tr>   
          <tr>
           
          <tr>
            <td colspan="2"><input type="submit" value="Submit" class="btn lg-btn"  /></td>
          </tr>
        </table>
      </form:form>
      
      <c:if test="${empty projects}">
      <tr>
        <td colspan="8">No Projects  Display</td>
      </tr>
    </c:if> 
      
      
       <c:if test="${not empty projects}">
       <table  class="project_table">
       <th>Id</th>
        <th>ProjectName</th>
          <th>Client</th>
        <th>StartDate</th>
        <th>EndDate</th>
        <th>Edit</th>
        <th>Delete</th>
        <c:set var="count" value="0" scope="page" />
      <c:forEach var="listValue" items="${projects}">
      <c:set var="count" value="${count+1}" scope="page" />
				<tr>
				   <td align="center">${listValue.projectid}</td>
				   <td class="tdt">${listValue.projectName}</td>
				   <td class="tdt">${listValue.client}</td>
				   <td class="tdt">${listValue.startDate}</td>
				   <td class="tdt">${listValue.endDate}</td>
				   <td class="tdt"> <a href="<c:url value="edit/${listValue.projectid}.do"></c:url>"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				   </a></td>
				   <td class="tdt"><a href="<c:url value="delete/${listValue.projectid}.do"></c:url>"><i style="font-size:24px" class="fa">&#xf014;</i></a></td>
				
				</tr> 
				
			</c:forEach>
			
			
			</table>
			
			  </c:if> 
			
			
			
			 
   <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>   
 
			 <script>
  $(function() {
      $( ".datepicker" ).datepicker({ dateFormat: 'dd/mm/yy' });


  });
  </script> 
			
			
			
			
</body>
</html>