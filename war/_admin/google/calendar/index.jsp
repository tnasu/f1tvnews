<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>_admin google calendar Index</title>
</head>
<body>
<p>Hello _admin google calendar Index !!!</p>
<div>
<form action="save" method="post">
<div>
client_id:<input type="text" name="clientId" value="${adminGoogleCalendar.clientId}" size="100"/>
</div>
<div>
client_secret:<input type="text" name="clientSecret" value="${adminGoogleCalendar.clientSecret}" size="100" />
</div>
<div>
callback:<input type="text" name="callback" value="${adminGoogleCalendar.callback}" size="100" />
</div>
<div>
<input type="submit" value="save setting" />
</div>
</form>
<div>
<form action="delete" method="post">
<div>
<input type="submit" value="delete setting" />
</div>
</form>
</div>
<div>
<a target="_blank" href="https://code.google.com/apis/console/#project:68237896591:access">apis console</a>
</div>
</body>
</html>
