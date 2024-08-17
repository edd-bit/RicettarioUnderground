<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form di Accesso utente</title>
</head>
<body>

<h3>Form di Accesso utente</h3>


<form:form modelAttribute="utenteForm" method="POST" action="/ricettariospring/utente/formAccessoUtente">

    <p>
        <form:label path="email_utente">Email Utente:</form:label>
        <form:input path="email_utente" />
    </p>
    <p>
        <form:label path="passw_utente">Password:</form:label>
        <form:input path="passw_utente" type="password" />
    </p>
    <input type="submit" value="Accedi" />
    
    <!-- Al cliccare di Accedi mi dovrà reindirizzare 
    sulla home ma di UTENTE -->
</form:form>

</body>
</html>