<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page contentType="text/html; charset=UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
  
  
  <%
  
  request.setCharacterEncoding("UTF-8");
  String userId = request.getParameter("userId");
  String userPwd = request.getParameter("userPwd");
  
  StringBuilder sb = new StringBuilder("{");
  sb.append(String.format("\"userId\":\"%s\" ",userId));
  sb.append(",");
  sb.append(String.format("\"userPwd\":\"%s\" ",userPwd));
  sb.append("}");  //요기 대괄호 뺐다
  
  //클라이언트에게 응답하기
  out.print(sb.toString());
  
  System.out.println(sb);
  
  %>

