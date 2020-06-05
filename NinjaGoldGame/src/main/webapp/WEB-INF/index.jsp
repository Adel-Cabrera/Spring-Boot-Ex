<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">		
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Ninja Gold Game</title>
	</head>
	<body>
		<div class="container my-5">			
			<div class="col">
		   		Your Gold: <input class="input" type="text" name="myGold" placeholder="" value="<c:out value="${gold}"/>">
			</div>
			<div class="row my-5 card-deck">
				<div class="card col">
		   			<h2>Farm</h2>
		   			<p>(earns 10-20 gold)</p>
		   			<form class="pb-2" action="/gold/gold" method="POST">
		   				<button class="btn btn-info" type="submit" name="place" value="farm">Find Gold</button>
		   			</form>
				</div>
				<div class="card col">
		   			<h2>Cave</h2>
		   			<p>(earns 5-10 gold)</p>
		   			<form class="pb-2" action="/gold/gold" method="POST">
		   				<button class="btn btn-info" type="submit" name="place" value="cave">Find Gold</button>
		   			</form>
				</div>
				<div class="card col">
		   			<h2>House</h2>
		   			<p>(earns 2-5 gold)</p>
		   			<form class="pb-2" action="/gold/gold" method="POST">
		   				<button class="btn btn-info" type="submit" name="place" value="house">Find Gold</button>
		   			</form>
				</div>
				<div class="card col">
		   			<h2>Casino!</h2>
		   			<p>(earns 0-50 gold)</p>
		   			<form class="pb-2" action="/gold/gold" method="POST">
		   				<button class="btn btn-info" type="submit" name="place" value="casino">Find Gold</button>
		   			</form>
		 		</div>
			</div>
			<div class="d-flex justify-content-center">
				<div class="scroll">
			   		<% ArrayList<String> activities =  (ArrayList<String>) session.getAttribute("activities");%>
					<% Collections.reverse(activities); %>			   		
		   		
			   		<% for(int i = 0; i < activities.size(); i++) { %>
        				<p><%= activities.get(i) %></p>      			
        			<% } %>
        			
<%-- 			   		<% for(String activity : activities) {%> --%>
<%-- 			   			<p><%= activity %></p> --%>
<%-- 			   		<% }%> --%>
	  			</div>
			</div>
		</div>
		
		
		<script type="text/javascript" src="js/app.js"></script>
	</body>
</html>