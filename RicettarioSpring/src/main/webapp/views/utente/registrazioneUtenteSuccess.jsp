<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registrazione Successo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/registrazioneSuccessoStyle.css">
</head>
<body>

    <!-- Header -->
    <div id="divheader">
        <div id="divH1">
            <a href="http://localhost:8080/ricettariospring/home">
                <img src="${pageContext.request.contextPath}/img/RICETTARIO_LOGO1.png" alt="Logo">
            </a>
        </div>
        <div id="divH2">
            <a href="http://localhost:8080/ricettariospring/utente/formAccessoUtente">Accedi</a>
        </div>
    </div>

    <!-- Contenuto principale -->
    <div class="content">
        <h2>Registrazione avvenuta con successo</h2>
        <a href="http://localhost:8080/ricettariospring/home">
            <button class="btn btn-outline-info">Vai alla Homepage</button>
        </a>
        <a href="http://localhost:8080/ricettariospring/utente/formAccessoUtente">
            <button class="btn btn-outline-info">Fai il Login!</button>
        </a>
    </div>

      <!-- Footer -->
    <footer id="footer">
        <p>
            &copy; 2024 Ricettario. Tutti i diritti riservati. | 
            <br>
            <a href="/privacy-policy">Privacy Policy</a> | 
            <a href="/terms">Termini e Condizioni</a> | 
            <a href="/contatti">Contatti</a> | 
            <a href="/sviluppatori">Sviluppatori</a>
        </p>
    </footer>
</body>
</html>