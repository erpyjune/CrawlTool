<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,com.test.mybatis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
  <title>main</title>
</head>
<body>
<form  method="post" action="/seed_insert">
  <table border="1">
    <tr>
      <td>id</td>
      <td>cp</td>
      <td>url</td>
      <td>keyword</td>
      <td></td>
    </tr>

    <tr>
      <td><input type="text" name="id" id="id"></td>
      <td><input type="text" name="cp" id="cp"></td>
      <td><input type="text" name="url" id="url"></td>
      <td><input type="text" name="keyword" id="keyword"></td>
      <td colspan="2" align="center">
        <input type="submit" value="추가">
      </td>

    </tr>
    <c:forEach items="${seedList}" var="list">
      <tr>
        <td>${list._id}</td>
        <td>${list._cp}</td>
        <td>${list._url}</td>
        <td>${list._keyword}</td>
        <td><input type="button" value="수정" onclick=""> <input
                type="button" value="삭제"></td>
      </tr>
    </c:forEach>
  </table>

</form>
</body>
</html>