<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="./resources/css/materialize.min.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="./resources/css/style.css"  media="screen,projection"/>
<title>El mercado de nayic</title>
</head>
<body>

	<f:form name="form" method="post" action="${pageContext.request.contextPath}/validate" modelAttribute="product" >
		<div class="row">
			<div class="input-field col s6">
				<f:input name="name" type="text" path="name"/>
				<f:errors path="name" cssClass="error"/>
	      		<label class="active" for="name">Name</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<f:input name="brand" type="text" path="brand"/>
				<f:errors path="brand" cssClass="error"/>
	      		<label class="active" for="brand">Brand</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<f:input name="description" type="text" path="description"/>
				<f:errors path="description" cssClass="error"/>
	      		<label class="active" for="description">Description</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<f:input name="category" type="text" path="category"/>
				<f:errors path="category" cssClass="error"/>
	      		<label class="active" for="category">Category</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<f:input name="price" type="text" path="price"/>
				<f:errors path="price" cssClass="error"/>
	      		<label class="active" for="price">Price</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<f:input name="exp_date" type="text" path="date"/>
				<f:errors path="date" cssClass="error"/>
	      		<label class="active" for="exp_date">Expiration date</label>
			</div>
		</div>
		<input type="submit" value="Insert">
	</f:form>

	<script type="text/javascript" src="./resources/js/materialize.min.js"></script>
</body>
</html>