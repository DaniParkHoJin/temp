<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="models.members.Member" %>
<%
    Member member = new Member();
    member.setUserId("user01");
    member.setUserPw("123456");
    session.setAttribute("member", member);
%>