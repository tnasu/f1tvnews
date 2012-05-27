<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>google calendar Index</title>
</head>
<body>
<p>Hello google calendar Index !!!</p>
<div>
<form action="save" method="post">
<c:forEach var="calendarEntry" items="${calendarList.itemMap}" varStatus="status">
<div>
<input type="checkbox" name="calendarIds" value="${calendarEntry.key}" <c:if test="${calendarEntry.value.selected}"> checked</c:if>><c:out value="${calendarEntry.value.summary}"/></input>
</div>
</c:forEach>
<div>
<input type="submit" value="save setting" />
</div>
</form>
<div>
</body>
</html>
