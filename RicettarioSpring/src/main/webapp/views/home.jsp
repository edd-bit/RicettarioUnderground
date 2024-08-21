<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/header.css">
<script src="${pageContext.request.contextPath}/JavaScript/home.js"> </script>

<meta charset="UTF-8">
<title>Home RicettarioSpring</title>

</head>
<body>

<div id=divheader>
	<div>RicettarioSpring</div>
	<div class=notVisible></div>
	
	<div><a href="/ricettariospring/utente/formAccessoUtente"><button class = "btn btn-primary"> Accedi come Utente</button></a></div>
</div>

<!-- ---------------------------------- -->
<div class=generale>
	<h3>Questa è la home di RicettarioSpring</h3>
		<br>
		<br>
	
	<!--<a href="/ricettariospring/utente/formAccessoUtente"><button class = "btn btn-primary"> Accedi come Utente</button></a>-->
	<!-- ragionamento di Sonia e Marco  -->
	<!-- <input type="submit" value="homeUtente"/> -->
		
	<button class = "btn btn-primary">Accedi come Dipendente</button>
		<br>
		<br>
	<div class=regNewU>
		<h5>Sei un nuovo utente?</h5>
		<br>
		<a  id=bSx href="/ricettariospring/utente/formRegistrazioneUtenti"><button  class = "btn btn-primary">Registrati</button></a>
	</div>
	
	
</div>
	<div id=scopriRicette>
		<button id=btnScopriRic>
			<h3>
				Scopri 
					<br>
				le nostre ricette
			</h3>
		</button>
	</div>
	
	<div class=divRicette>
		<button class=btnRic>
			Antipasti
		</button>
			<a href="${pageContext.request.contextPath}/primi/PrimiPiatti">
   				 <button class="btnRic">
       				 Primi
    			</button>
			</a>
		<button class=btnRic>
			Secondi
		</button>
		<button class=btnRic>
			Contori
		</button>
		<button class=btnRic>
			Dolci
		</button>
	</div>
	
</body>
</html>



