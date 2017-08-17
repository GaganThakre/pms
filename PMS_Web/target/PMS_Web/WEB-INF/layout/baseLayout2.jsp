<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
 
      
    <tr>
      <td valign="top" bgcolor="#FFC266"><tiles:insertAttribute name="body" />
      </td>
    </tr>
    <tr>
      <td colspan="2" align="left"><tiles:insertAttribute name="footer" />
      </td>
    </tr>
  </table>
</body>
</html>