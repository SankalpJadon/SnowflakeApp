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
	  <h1>Snowflake app</h1>
	  <p>Search all flights</p> 
	</div>

	<div class="container">
		<div class="row">
			<h2>Flight Search</h2>
			<form action="/getFlightDetails" method="GET">        	
				<div class="col-sm-5">
		      		<h3>From:</h3>	
					<input type="text" id="originAirport" name="originAirport" class="form-control input-sm" maxlength="64" placeholder="from airport" />
				</div>
				<div class="col-sm-5">	
					<h3>To:</h3>
				 	<input type="text" id="destinationAirport" name="destinationAirport" class="form-control input-sm" maxlength="64" placeholder="to airport"> 
				</div> 	
				<div class="col-sm-2">
					<button type="submit" name="getFlights" class="btn btn-primary btn-sm" style="margin-top:55px;">Search</button>			
				</div>
			</form>
		</div>
	</div>

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