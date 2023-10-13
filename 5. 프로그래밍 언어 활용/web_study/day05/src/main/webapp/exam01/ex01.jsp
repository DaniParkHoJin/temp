<%@ page contentType="text/html; charset=UTF-8" %>

<%
    // _jspService(...) 메서드 지역 안에 번역
    int num1 = 100;
    int num2 = 200;
    //out.write = ("합계 : " + (num1 + num2 + num3 + num4));
    //out.write("합계 : " + add(num1, num2));
    int result = add(num1, num2);

    // _jspService 메서드 안 이기에 또 다른 메서드를 넣을 수 없다

%>

<%= result %>

<%!
    // 클래스 명 바로 아래 쪽에 번역 - 멤버 변수로...
    int num3 = 300;
    int num4 = 400;

    int add(int num1, int num2){
    return num1 + num2;
    }
%>

