<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Show Flights</h1>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>TimeStamp</th>
				<th>Arrival</th>
				<th>Departure</th>
				<th>Flight Identification</th>
				<th>Flight Status</th>
				<th>Gufi</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>${flight.timestamp}</th>
				<th>${flight.arrival.arrivalFixTime.estimated.timestamp}</th>
				<th>${flight.departure.departureFixTime.estimated.timestamp}</th>
				<th>${flight.flightIdentification.aircraftIdentification}</th>
				<th>${flight.flightStatus.flightCycle}</th>
				<th>${flight.gufi.codeSpace}</th>
      		</tr>
		</tbody>
	</table>
</body>
</html>
