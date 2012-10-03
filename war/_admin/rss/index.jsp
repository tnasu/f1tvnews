<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>_admin rss Index</title>
</head>
<body>
<p>Hello _admin rss Index !!!</p>
<div>
<c:if test="${htmlDocument != null and htmlDocument.htmlContentList != null}">
<c:forEach var="htmlContent" items="${htmlDocument.htmlContentList}" varStatus="status">
<div>
<form action="remove">
<div><c:out value="${status.index}"/></div>
<div><c:out value="${htmlContent.title}"/></div>
<div><c:out value="${htmlContent.description}"/></div>
<div><c:out value="${htmlContent.showtime}"/></div>
<input type="hidden" name="htmlContentIdx" value="${status.index}" />
<input type="submit" value="remove" />
</form>
</div>
</c:forEach>
</c:if>
</div>
</body>
</html>
