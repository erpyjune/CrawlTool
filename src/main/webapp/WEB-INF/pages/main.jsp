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
<form  method="post" action="/insert">
  <table border="1">
    <tr>
      <td>상품명</td>
      <td>URL</td>
      <td>가격</td>
      <td></td>
    </tr>

    <tr>
      <td><input type="text" name="product_name" id="product_name"></td>
      <td><input type="text" name="url" id="url"></td>
      <td><input type="text" name="sale_price" id="sale_price"></td>
      <td colspan="2" align="center">
        <input type="submit" value="추가">
      </td>

    </tr>
    <c:forEach items="${searchList}" var="list">
      <tr>
        <td>${list._product_name}</td>
        <td>${list._url}</td>
        <td>${list._sale_price}</td>
        <td><input type="button" value="수정" onclick=""> <input
                type="button" value="삭제"></td>
      </tr>
    </c:forEach>
  </table>

</form>
</body>
</html>