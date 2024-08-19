<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione utente</title>
</head>
<body>
<br>
<h3>Form di registrazione</h3>

<form:form modelAttribute="formRegistrazioneU" method="POST" action="/ricettariospring/utente/inserimentoNuovoUtente"> 
																						<!--  richiama il metodo inserimentoUtente -->
	<p>
        <form:label path="email_utente">Email Utente:</form:label>
        <form:input path="email_utente" />
    </p>
    <p>
        <form:label path="passw_utente">Password:</form:label>
        <form:input path="passw_utente" type="password" />
    </p>
    <input type="submit" value="Registrati" />
    
    
</form:form>
<br>
<br>
<a href="http://localhost:8080/ricettariospring/home"><button class = "btn btn-outline-info">Vai alla Homepage</button></a>
</body>
</html>