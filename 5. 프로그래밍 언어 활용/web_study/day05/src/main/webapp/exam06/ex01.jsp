<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.members.Member" %>
<%
    pageContext.setAttribute("num1", 100);
    Member member = new Member();
    member.setUserId("user01");
    member.setUserPw("123456");
    request.setAttribute("Member",member);
%>

${num1}<br>
userId : ${member.getUserid()}<br>
userPw : ${member.getUserPw()}<br>
<br>
userId : ${member.Userid()}<br>
userPw : ${member.UserPw()}<br>