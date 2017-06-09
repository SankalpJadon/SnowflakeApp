<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="<c:url value="/resources/jquery-1.8.2.min.js" />"></script>
<script
	src="<c:url value="/resources/jquery.autocomplete.min.js" />"></script>
<link href="<c:url value="/resources/main.css" />" rel="stylesheet">
</head>
<body>
	<form action="/getFlightDetails" method="GET">
		<div>Enter the origin airport:
			<input type="text" id="originAirport" value="origin" name="originAirport" style="width:300px;">
			Enter the destination airport:
			<input type="text" id="destinationAirport" value="destination" name="destinationAirport" style="width:300px;"> 
			<span><input type="submit" name="getFlights"></span>
		</div>
	</form>
	<script>

  
  $(document).ready(function() {

		$('#originAirport').autocomplete({
			serviceUrl: '${pageContext.request.contextPath}/getAirports',
			paramName: "city",
			delimiter: ",",
		   transformResult: function(response) {

			return {
			  //must convert json to javascript object before process
			  suggestions: $.map($.parseJSON(response), function(item) {

			      return { value: item.airport, data: item.city };
			   })

			 };

	            }

		 });
		
		$('#destinationAirport').autocomplete({
			serviceUrl: '${pageContext.request.contextPath}/getAirports',
			paramName: "city",
			delimiter: ",",
		   transformResult: function(response) {

			return {
			  //must convert json to javascript object before process
			  suggestions: $.map($.parseJSON(response), function(item) {

			      return { value: item.airport, data: item.city };
			   })

			 };

	            }

		 });


	  });
  </script>
</body>
</html>