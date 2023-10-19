<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie cookie1 = new Cookie("key1","value1");
    cookie1.setPath(request.getContextPath()); //
    //cookie1.setMaxAge(60*60*24*7);
    //cookie1.setMaxAge(0);
    cookie1.setHttpOnly(true);
    response.addCookie(cookie1);
%>