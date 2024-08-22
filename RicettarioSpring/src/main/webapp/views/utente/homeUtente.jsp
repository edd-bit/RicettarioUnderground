<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home utente</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/homeUtenteStyle.css">

</head>
<body>
	
	<!-- <a href="http://localhost:8080/ricettariospring/home"><button class = "btn btn-outline-info">Vai alla Homepage</button></a> -->
	<div id=divheader>
	<div id=divH1> <a href="http://localhost:8080/ricettariospring/home"><img alt="logo" src="${pageContext.request.contextPath}/img/RICETTARIO_LOGO1.png"></a></div> 
	
	<div class=notVisible></div>
	
	<!--  <div id=divH2><a href="/ricettariospring/utente/formAccessoUtente"> Accedi</a></div>-->
	<div id=divH2>
	 <!-- Icona del profilo -->
	 <p> <i class="bi bi-person"></i>Profilo </p>
	 </div>
</div>

<!-- ---------------------------------- -->
<div class=generale>
	<h3>Questa è la home Utente  di RicettarioSpring</h3>
		<br>
		<br>
	</div>
	
	<footer id="footer">
    	<p>
    		&copy; 2024 Ricettario. Tutti i diritti riservati. | 
    		<br>
    		<a href="/privacy-policy" >Privacy Policy</a> | 
    		<a href="/terms" >Termini e Condizioni</a> | 
    		<a href="/contatti" >Contatti |</a>
    		<a href="/sviluppatori" >Sviluppatori</a>
    	</p>
	</footer>
	
</body>
</html>