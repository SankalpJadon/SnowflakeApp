<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<script src="<c:url value="/resources/jquery-1.8.2.min.js" />"></script>
<script src="<c:url value="/resources/jquery.autocomplete.min.js" />"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link href="<c:url value="/resources/main.css" />" rel="stylesheet">
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>

<body>
	<div class="jumbotron text-center">
	  <h1>Flight Search Results</h1>
	  <form action="/" method="GET"><button type="submit" name="getFlights" class="btn btn-primary btn-sm">Home Page</button></form>	  
	</div>
	<div class="container">
		<div class="row">
			<table id="myTable">
				 <tr>
					<th><a href="javascript:sortTable(0)" style="color:black;">Carrier Name</a></th>
					<th></th>
					<th>Flight Number</th>
					<th></th>
					<th>Flight Identification</th>
					<th></th>					
					<th>Estimated Departure</th>
					<th></th>
					<th>Estimated Arrival</th>
					<th></th>
					<th>Flight Status</th>
					<th></th>
				 </tr>
					<c:forEach items="${originDestinationFlights}" var="flight">
						<tr>
							<td><c:out value="${flight.flightIdentification.carrierName}" /><td>
							<td><c:out value="${flight.flightIdentification.iataFlightNumber}" /><td>
							<td><c:out value="${flight.flightIdentification.majorCarrierIdentifier}" /><td>							
							<td><c:out value="${flight.departure.departureFixTime.estimated.timestamp}" /><td>
							<td><c:out value="${flight.arrival.arrivalFixTime.estimated.timestamp}" /><td>
							<td><c:out value="${flight.flightStatus.flightCycle}" /><td>
						</tr>
					</c:forEach>
			</table>
		</div>
	</div>
	<script>
		function sortTable(j) {
		  var table, rows, switching, i, x, y, shouldSwitch;
		  table = document.getElementById("myTable");
		  switching = true;
		  while (switching) {
		    switching = false;
		    rows = table.getElementsByTagName("TR");
		    for (i = 1; i < (rows.length - 1); i++) {
		      shouldSwitch = false;
		      x = rows[i].getElementsByTagName("TD")[0];
		      y = rows[i + 1].getElementsByTagName("TD")[0];
		      if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
		        shouldSwitch= true;
		        break;
		      }
		    }
		    if (shouldSwitch) {
		      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
		      switching = true;
		    }
		  }
		}
</script>

	
</body>
</html>
