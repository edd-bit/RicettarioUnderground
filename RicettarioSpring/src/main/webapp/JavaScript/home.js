//alert("sei in home");
document.addEventListener("DOMContentLoaded", function(){
	
	const divRicette = document.querySelector(".divRicette");
	const btnScopriRicette = document.getElementById("btnScopriRic");
	
	btnScopriRicette.addEventListener('click', function() {
		divRicette.classList.toggle('show');
	});
	
});