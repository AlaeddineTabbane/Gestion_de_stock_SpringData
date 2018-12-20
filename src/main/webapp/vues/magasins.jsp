<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magasins</title>
<link href="<c:url value="/resources/static/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
			  <a href="/Gestion_des_stocks/magasins" class="list-group-item list-group-item-action active">Liste des magasins</a>
			  <a href="/Gestion_des_stocks/ajoutmagasin" class="list-group-item list-group-item-action">Ajouter un magasin</a>
			  <a href="/Gestion_des_stocks/ajoutproduit" class="list-group-item list-group-item-action">Ajouter un produit</a>
			</div>
		</div>
		<div class="col-md-9">
		<h2 class="text-center">Liste des magasin</h2>
		<table class="table ">
			<thead class="thead-dark">
				<tr >
					<th scope="col">id</th><th scope="col">Nom</th><th scope="col">Lieu</th><th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${listM }" var="mag">
				<tr>
					<td>${mag.id }</td>
					<td>${mag.nom }</td>
					<td>${mag.lieu}</td>
					<td><a href="/Gestion_des_stocks/produits/magasin/${mag.id}">Liste des produit</a>
				</tr>
				</c:forEach> 
			</tbody>
		</table>
		</div>
	</div>
		
	</div>
</body>
</html>