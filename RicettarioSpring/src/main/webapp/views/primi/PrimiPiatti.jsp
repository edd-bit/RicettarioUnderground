<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primi piatti page</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/primiStyle.css">


</head>
<body>
  <!-- Header -->
    <div id="divheader">
        <div id="divH1"> 
            <a href="http://localhost:8080/ricettariospring/home">
                <img alt="logo" src="${pageContext.request.contextPath}/img/RICETTARIO_LOGO1.png">
            </a>
        </div>
        <div class="notVisible"></div>
        <div id="divH2">
            <a href="/ricettariospring/utente/formAccessoUtente">Accedi</a>
        </div>
    </div>

    <!-- Titolo della pagina -->


<div class="container">
        <h1 class="text-center my-4">10 Primi Piatti Famosi in Italia</h1>
        
        <!-- Lista dei primi piatti famosi -->
        <div class="row" >
        <!-- class="list-group-item list-group-item-action" -->
           <div class="col-md-4 mb-4">
           <a href="#" >
                <h4 class="mb-1">Carbonara</h4>
                <p class="mb-1">Un classico della cucina romana, preparato con uova, pecorino, guanciale e pepe nero.</p>
            </a>
            </div>
           <div class="col-md-4 mb-4"> 
            <a href="#" >
                <h4 class="mb-1">Zucchine ripiene di Marco (senza glutine)</h4>
                <p class="mb-1">Un classico della cucina boh, preparato da Marco con tanto amore.</p>
            </a>
            </div> 
            
            <div class="col-md-4 mb-4"> 
            <a href="#" >
                <h4 class="mb-1">Zucchine ripiene veg</h4>
                <p class="mb-1">Un grande classico rivisitato.</p>
            </a>
             </div>
             
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Amatriciana</h4>
                <p class="mb-1">Pasta con salsa di pomodoro, guanciale e pecorino romano.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Lasagne alla Bolognese</h4>
                <p class="mb-1">Strati di pasta all’uovo con ragù di carne, besciamella e parmigiano.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Risotto alla Milanese</h4>
                <p class="mb-1">Un risotto cremoso con zafferano, tipico di Milano.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Pasta al Pesto</h4>
                <p class="mb-1">Pasta con pesto genovese a base di basilico, pinoli e parmigiano.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Spaghetti alle Vongole</h4>
                <p class="mb-1">Spaghetti con vongole fresche, aglio, olio e prezzemolo.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Trofie al Pesto</h4>
                <p class="mb-1">Pasta tipica della Liguria condita con pesto genovese.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#">
                <h4 class="mb-1">Orecchiette alle Cime di Rapa</h4>
                <p class="mb-1">Pasta tipica pugliese con cime di rapa, aglio e acciughe.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Spaghetti Cacio e Pepe</h4>
                <p class="mb-1">Un piatto romano semplice a base di pecorino romano e pepe nero.</p>
            </a>
            </div>
            
            <div class="col-md-4 mb-4">
            <a href="#" >
                <h4 class="mb-1">Pasta alla Norma</h4>
                <p class="mb-1">Pasta siciliana con melanzane fritte, salsa di pomodoro e ricotta salata.</p>
            </a>
            </div>
        </div>
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