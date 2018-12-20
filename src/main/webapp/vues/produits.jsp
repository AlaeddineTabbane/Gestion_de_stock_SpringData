<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produits</title>
<link href="<c:url value="/resources/static/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
			  <a href="/Gestion_des_stocks/magasins" class="list-group-item list-group-item-action">Liste des magasins</a>
			  <a href="/Gestion_des_stocks/ajoutmagasin" class="list-group-item list-group-item-action">Ajouter un magasin</a>
			  <a href="/Gestion_des_stocks/ajoutproduit" class="list-group-item list-group-item-action">Ajouter un produit</a>
			</div>
		</div>
		<div class="col-md-9">
			<h2 class="text-center">Liste des magasin</h2>
			<table class="table ">
				<thead class="thead-dark">
					<tr >
						<th>id</th>
						<th>description</th>
						<th>Date Ajout</th>
						<th>Quantite</th>
						<th>Prix Achat</th>
						<th>Prix Vente</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pro" items="${listP }">
						<tr>
							<td>${pro.id} </td>
							<td>${pro.description }</td> 
							<td>${pro.dateAjoute}</td>
							<td>${pro.quantite} </td>
							<td>${pro.prixAchat }</td> 
							<td>${pro.prixVente}</td>
						</tr>
					</c:forEach>
			
				</tbody>
			</table>
		</div>
	</div>
		
</div>

</body>
</html>