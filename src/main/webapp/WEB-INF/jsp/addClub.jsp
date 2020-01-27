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



<body class="bg-dark">

    <header class="navbar navbar-dark bg-success rounded">
        <a class="navbar-brand" href="theme3.html"><h1 class="application-name display-3">FouFouClub</h1></a>
        <span>
            <a class="btn btn-dark btn-lg m-1" href="Acceuil.html"><i class="fas fa-sign-out-alt mr-1"></i>Logout</a>
			<a class="btn btn-dark btn-lg m-1" href="user.html"><i class="fas fa-user mr-1"></i>User</a>
			<a class="btn btn-dark btn-lg m-1" href="signature.html"><i class="fas fa-user mr-1"></i>User</a>
        </span>
    </header>

	<h2 class="display-3 text-center mt-2 mb-5">Club</h2>

<div class="col-12 row align-item-center">
	<table class="table table-light table-striped col-5 offset-1 text-dark">
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

	<form class="col-4 offset-1" action="addClub" method="post">
		<h2>Ajouter un Club</h2>
		
			<p class="form-group">
			<label for="name">Club's name</label> <input type="text"
				class="form-control" name="name" id="name" value="" requiered>
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

		<p class="form-group text-center">
			<input type="submit" id=""
				class="btn btn-success align-item-center user-valid club-valid-btn" value="Valider">
			<input type="reset" class="btn btn-secondary" name="reset"
				value="Reset">
		</p>
	</form>
</div>

    <footer class="navbar navbar-dark bg-success mt-auto mb-0 rounded">
        <ul class="navbar-nav navbar-expand-sm">
            <li>
                <a class="navbar-text text-dark ml-2 mr-2" href="https://www.linkedin.com/in/olivier-guiot-48586a156">
                    <i class="fab fa-linkedin"></i>
                </a>
            </li>
            <li>
                <a class="navbar-text text-dark ml-2 mr-2" href="https://www.linkedin.com/in/olivier-guiot-48586a156">
                    <i class="fab fa-facebook-square"></i>
                </a>
            </li>
        </ul>
        <p><a class="navbar-text" href="https://www.w3schools.com/default.asp">Formation developpeur JAVA</a></p>
        <p class="navbar-text">Exemple d'interface administration propulsé avec BOOTSTRAP 4.4</p>
    </footer>

	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>
