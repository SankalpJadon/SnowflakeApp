<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<script src="<c:url value="/resources/jquery-1.8.2.min.js" />"></script>
<script src="<c:url value="/resources/jquery.autocomplete.min.js" />"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link href="<c:url value="/resources/main.css" />" rel="stylesheet">
</head>
<body>
	<div class="jumbotron text-center">
	  <h1>Sorry! No flight founds!</h1>
	  <form action="/" method="GET"><button type="submit" name="getFlights" class="btn btn-primary btn-sm">Back to Home Page</button></form>	  
	</div>
</body>
</html>