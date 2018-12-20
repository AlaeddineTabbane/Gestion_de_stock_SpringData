<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout produit</title>
<link href="<c:url value="/resources/static/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
			  <a href="/Gestion_des_stocks/magasins" class="list-group-item list-group-item-action">Liste des magasins</a>
			  <a href="/Gestion_des_stocks/ajoutmagasin" class="list-group-item list-group-item-action active">Ajouter un magasin</a>
			  <a href="/Gestion_des_stocks/ajoutproduit" class="list-group-item list-group-item-action">Ajouter un produit</a>
			</div>
		</div>
		<div class="col-md-9">
			<h2 class="text-center">Ajout magasin</h2>
			<form:form method="POST" action="/Gestion_des_stocks/saveMagasin" modelAttribute="mag">
			  <div class="form-group row">
			    <form:label class="col-sm-2 col-form-label" path="nom">Nom</form:label>
			    <div class="col-sm-10">
			      <form:input class="form-control" path="nom"/>
			    </div>
			  </div>
			  <div class="form-group row">
			    <form:label class="col-sm-2 col-form-label" path="lieu">Lieu</form:label>
			    <div class="col-sm-10">
			      <form:input class="form-control" path="lieu"/>
			    </div>
			  </div>
			   <button type="submit" class="btn btn-primary mb-2">Ajouter</button>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>