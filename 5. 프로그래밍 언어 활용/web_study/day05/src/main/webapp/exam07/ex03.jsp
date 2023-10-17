<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="101" />


<c:if test="${num1 == 100}" >
     num1은 100이다.
</c:if>
<c:if test="${num1 != 100}" >
     num1은 100이 아니다.
</c:if>
<c:if test="true" >
     <div>참</div>
</c:if>