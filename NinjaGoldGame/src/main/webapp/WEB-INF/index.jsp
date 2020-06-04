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
		<section>
			<div class="">			
				<div class="">
			  		<div class="">
			    			Your Gold: <input class="input" type="text" name="myGold" placeholder="<c:out value="${gold}"/>">
			  		</div>
				</div>
				<div class="">
		  			<div class="column">
		    			<h1>Farm</h1>
		    			<p>Earn 10-20 gold</p>
		    			<form action="/findgold" method="POST">
		    				<input class="button is-warning" type="submit" value="Find Gold!">
		    				<input type="hidden" name="place" value="farm">
		    			</form>
		  			</div>
		  			<div class="column">
		    			<h1>Cave</h1>
		    			<p>Earn 5-10 gold</p>
		    			<form action="/findgold" method="POST"><input class="button is-warning" type="submit" value="Find Gold!"><input type="hidden" name="place" value="cave"></form>
		  			</div>
		  			<div class="column">
		    			<h1>House</h1>
		    			<p>Earn 2-5 gold</p>
		    			<form action="/findgold" method="POST"><input class="button is-warning" type="submit" value="Find Gold!"><input type="hidden" name="place" value="house"></form>
		  			</div>
		  			<div class="column">
		    			<h1>Casino!</h1>
		    			<p>Earn 0-50 gold</p>
		    			<form action="/findgold" method="POST">
		    				<input class="button is-danger" type="submit" value="Find Gold!">
		    				<input type="hidden" name="place" value="casino">
		    			</form>
		  			</div>
				</div>
				<div class="field">
			  		<div class="control activities">
			    		<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");%>
			    		<% Collections.reverse(activities); %>
			    		<% for(String activity : activities) {%>
			    			<p><%= activity %></p>
			    		<% }%>
	  				</div>
				</div>
				
			</div>
		</section>
		
		
		
		<script type="text/javascript" src="js/app.js"></script>
	</body>
</html>