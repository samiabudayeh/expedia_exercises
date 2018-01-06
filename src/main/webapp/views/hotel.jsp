<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Best Expedia Hotel Offers</title>
<link rel="stylesheet" href="views/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet" href="views/css/bootstrap-theme.min.css" />

<!-- Latest compiled and minified JavaScript -->
<script src="views/js/jquery-2.1.3.min.js"></script>

<script src="views/js/bootstrap.min.js"></script>
</head>
<body>
	<form:form action="/hotel.html"> 

		<h3>Best Expedia Hotel Offers</h3>
		<div align="center" class="table-responsive">
		<table class="table">
		<thead>
          <tr>
		  	<th>Hotel Name</th>
		  	<th>Hotel Destination</th>
		    <th>travel Start Date</th>
		    <th>travel End Date</th>
		  	<th>Price</th>
          </tr>
        </thead>

		<c:if test="${not empty hotelList}">
			<tbody>
			<c:forEach var="hotel" items="${hotelList}" >
			  <tr>
			  	<td><img width="50px" height="50" src="${hotel.hotelInfo.hotelImageUrl}" /> ${hotel.hotelInfo.hotelName}</td>
			  	<td>${hotel.destination.longName}</td>
			    <td>${hotel.offerDateRange.travelStartDateValue}</td>
			    <td>${hotel.offerDateRange.travelEndDateValue}</td>
			  	<td>${hotel.hotelPricingInfo.totalPriceValue} ${hotel.hotelPricingInfo.currency}</td>
			  </tr> 
			</c:forEach>
			</tbody>
		</c:if>
		</table>
		</div>
	</form:form>
</body>
</html>
