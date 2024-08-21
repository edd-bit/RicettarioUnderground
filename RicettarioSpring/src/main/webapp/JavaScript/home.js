//alert("sei in home");
document.addEventListener("DOMContentLoaded", function(){
	
	const divRicette = document.querySelector(".divRicette");
	const btnScopriRicette = document.getElementById("btnScopriRic");
	const divScopriRicette = document.getElementById("scopriRicette");
	
	btnScopriRicette.addEventListener('click', function() {
		
		divRicette.classList.toggle('show');
		divScopriRicette.style.display='none';
		
	});
	
});