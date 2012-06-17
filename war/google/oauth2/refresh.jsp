<%@page pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>google oauth2 Refresh</title>
</head>
<body>
<p>Hello google oauth2 Refresh !!!</p>
<div>error:<c:out value="${google.error}" /></div>
<div>access_token:<c:out value="${google.accessToken}" /></div>
<div>token_type:<c:out value="${google.tokenType}" /></div>
<div>expires_in:<c:out value="${google.expiresIn}" /></div>
<div>refresh_token:<c:out value="${google.refreshToken}" /></div>
<a href="?refresh=${google.refreshToken}">refresh</a>
</body>
</html>
