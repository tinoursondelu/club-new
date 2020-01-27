<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="models.Team"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add team</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/all.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">


</head>
<body>

    <h2>Team</h2>

    <div class="col-12 row">
        <div class="">
        <p>${newClub.id}</p>
<c:if test="${newClub.id = null}">
<p>plop</p>
</c:if>
            <p>${newClub.id}</p>

            <ul>
            
            
<%-- 
                <c:forEach items="teams" var="team">
                <li>${team.id}</li>

            </c:forEach> --%>
        </ul>
    </div>
    <div class="">
        <form class="" action="addTeam" method="post">
		<h2>Ajouter une team</h2>

		<p class="form-group">
			<label for="name">Club's name</label> <input type="text"
				class="form-control" name="name" id="name" value="">
		</p>

		<p class="form-group text-center">
			<input type="submit" id=""
				class="btn btn-success align-item-center user-valid club-valid-btn" value="Valider">
			<input type="reset" class="btn btn-secondary" name="reset"
				value="Reset">
		</p>
	</form>
    </div>
</div>

<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/main.js"></script>

</body>
</html>
