//alert("sei in home");
document.addEventListener("DOMContentLoaded", function(){
	
	const divRicette = document.querySelector(".divRicette");
	const btnScopriRicette = document.getElementById("btnScopriRic");
	const divScopriRicette = document.getElementById("scopriRicette");
	
	btnScopriRicette.addEventListener('click', function(e) {
		
		divRicette.classList.toggle('show');
		divScopriRicette.style.display='none';
		console.log("Questi sono i dettagli tecnici dell'evento scatenato: ", e)
		
		
	});
	
});