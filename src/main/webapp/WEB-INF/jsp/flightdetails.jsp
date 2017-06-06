<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Show Flights</h1>
	<table>
		<tbody>
			<tr>
				<th>Carrier Name</th>
				<th>Flight Number</th>
				<th>Estimated Departure</th>
				<th>Estimated Arrival</th>
				<th>Flight Identification</th>
				<th>Flight Status</th>
			</tr>
		<c:forEach items="${originDestinationFlights}" var="flight">
			<tr>
				<td><c:out value="${flight.flightIdentification.carrierName}" /><td>
				<td><c:out value="${flight.flightIdentification.iataFlightNumber}" /><td>
				<td><c:out value="${flight.departure.departureFixTime.estimated.timestamp}" /><td>
				<td><c:out value="${flight.arrival.arrivalFixTime.estimated.timestamp}" /><td>
				<td><c:out value="${flight.flightIdentification.majorCarrierIdentifier}" /><td>
				<td><c:out value="${flight.flightStatus.flightCycle}" /><td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
