<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="models.Category"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add club</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/all.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">


</head>
<body>

	<h2 class="display-3 text-center mb-4">Club</h2>

<div class="col-12 row align-item-center">
	<table class="table-dark table-striped col-6 offset-1">
		<thead>
			<tr>
				<th>Club's name</th>
				<th>City</th>
				<th>Category</th>
				<th>Details</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clubs}" var="club">
				<tr>
					<td>${club.name}</td>
					<td>${club.ville}</td>
					<td>${club.category}</td>
					<td>
						<button type="button"
						data-val="${club.id}" 
						class="btn btn-success club-detail-btn" 
						title="See">
						Details
						</button>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form class="col-4" action="addClub" method="post">
		<h2>Ajouter un Club</h2>

		<p class="form-group">
			<label for="name">Club's name</label> <input type="text"
				class="form-control" name="name" id="name" value="">
		</p>

		<p class="form-group">
			<label for="ville">city</label> <input type="text"
				class="form-control" name="ville" id="ville" value="">
		</p>

		<p class="form-group">
			<label for="category">Category</label>
			<select class="select form-control" name="category" id="category">
				<c:forEach items="${Category.values()}" var="y">
					<option value="${y}">${y}</option>
				</c:forEach>
			</select>
		</p>

		<p class="form-group">
			<label for="team">teams</label> <input type="text"
				class="form-control" name="team" id="team" value="">
		</p>

		<p class="form-group text-center">
			<input type="submit" id=""
				class="btn btn-success align-item-center user-valid club-valid-btn" value="Valider">
			<input type="reset" class="btn btn-secondary" name="reset"
				value="Reset">
		</p>
	</form>
</div>

	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>
