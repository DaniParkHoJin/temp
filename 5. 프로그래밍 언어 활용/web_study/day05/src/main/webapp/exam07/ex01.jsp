<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var= "num1" value="100" scope="page"/>
<c:set var= "num2" value="200" />
${num1 + num2}<br>
pageScope : ${pageScope.num1}<br>
requestScope : ${requestScope.num1}<br>
sessionScope : ${sessionScope.num1}<br>
applicationScope : ${applicationScope.num1}<br>