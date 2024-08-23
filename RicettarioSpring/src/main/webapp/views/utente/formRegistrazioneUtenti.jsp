<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione utente</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/registrazioneUtenteStyle.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<div id=divheader>
	<div id=divH1> <a href="http://localhost:8080/ricettariospring/home"><img alt="logo" src="${pageContext.request.contextPath}/img/RICETTARIO_LOGO1.png"></a></div> 
	
	<div class=notVisible></div>
	
	<div id=divH2><a href="/ricettariospring/utente/formAccessoUtente"> Accedi</a></div>
</div>

<div class=container id=div1>
<h3>Form di Registrazione</h3>

<form:form modelAttribute="formRegistrazioneU" method="POST" action="/ricettariospring/utente/inserimentoNuovoUtente"> 
																						<!--  richiama il metodo inserimentoUtente -->
	<p>
        <form:label path="email_utente">Email Utente:</form:label>
        <br>
        <form:input path="email_utente" placeholder="esempio@email.com"/>
    </p>
    <p>
        <form:label path="passw_utente">Password:</form:label>
         <br>
        <form:input path="passw_utente" type="password" placeholder="password" />
    </p>
    <p id=nota>Compila questi campi per registrarti</p>
    <input type="submit" value="Registrati" />
    
    
</form:form>


<br>
<p id=linea>___________________________</p>
	<div class=regNewU>
	
		<a id=bSx href="http://localhost:8080/ricettariospring/home"><button class=bReg >Home</button></a>
		<br>
		<p>Torna alla home e accedi al tuo profilo</p>
	</div>
	<br>
</div>
<br>

<footer id="footer">
    	<p>
    		&copy; 2024 Ricettario. Tutti i diritti riservati. | 
    		<br>
    		<a href="/privacy-policy" >Privacy Policy</a> | 
    		<a href="/terms" >Termini e Condizioni</a> | 
    		<a href="/contatti" >Contatti |</a>
    		<a href="/contatti" >Sviluppatori</a>
    	</p>
	</footer>
</body>
</html>