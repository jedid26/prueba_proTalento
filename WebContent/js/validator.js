function validarName(){
	
	//Valor input ingresado
	let input = document.getElementById("inputName").value;
	
	//Tag input para manejar clase
	let inputClass = document.getElementById("inputName");
	//Tag div feedback
	let feedBack = document.getElementById("inputNameFeedback");
	
	if(input === null || input.trim() === ""){
		inputClass.classList.remove("is-valid");
		feedBack.classList.remove("valid-feedback");
		inputClass.classList.add("is-invalid");
		feedBack.classList.add("invalid-feedback");
		feedBack.innerHTML = "Nombre Invalido";
		return false;
	}
	inputClass.classList.remove("is-invalid");
	feedBack.classList.remove("invalid-feedback");
	inputClass.classList.add("is-valid");
	feedBack.classList.add("valid-feedback");
	feedBack.innerHTML = "Nombre Valido";
	return true;	
}

function validarEmail(){
	
	//regexr.com/2rhq7
	//Email Validation as per RFC2822 standards.
	const regex = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/gi;
	
	//const re = new RegExp(regex)
	
	let input = document.getElementById("inputEmail").value;
	
	//Tag input para manejar clase
	let inputClass = document.getElementById("inputEmail");
	//Tag div feedback
	let feedBack = document.getElementById("inputEmailFeedback");
	
	let esCorrecto = regex.test(input);
		
	if (esCorrecto === false){
		inputClass.classList.remove("is-valid")
		feedBack.classList.remove("valid-feedback");
		inputClass.classList.add("is-invalid");
		feedBack.classList.add("invalid-feedback");
		feedBack.innerHTML = "Correo Invalido";
		return false;
	}
	inputClass.classList.remove("is-invalid");
	feedBack.classList.remove("invalid-feedback");
	inputClass.classList.add("is-valid");
	feedBack.classList.add("valid-feedback");
	feedBack.innerHTML = "Correo Valido";
	return true;
}

function validarCheck(){
	let check = document.getElementById("validarCondiciones");
	
	let feedBack = document.getElementById("inputCondicionesFeedback");
	
	//check.
	
	if (check){
		feedBack.classList.remove("valid-feedback");
		feedBack.classList.add("invalid-feedback");
		feedBack.innerHTML = "Debe aceptar los terminos y condiciones";
		return false;
	}
	feedBack.classList.remove("invalid-feedback");
	feedBack.classList.add("valid-feedback");
	feedBack.innerHTML = "Terminos y condiciones aceptados";
	return true;
}

function validarEdad() {
	//Tag input para manejar clase
	let input = document.getElementById("selectInput");
	
	//Tag div feedback
	let feedBack = document.getElementById("inputCondicionesFeedback");
	
	if (input.selectedIndex === 0){
		inputClass.classList.remove("is-valid")
		feedBack.classList.remove("valid-feedback");
		inputClass.classList.add("is-invalid");
		feedBack.classList.add("invalid-feedback");
		feedBack.innerHTML = "Indicar si es mayor o menor de edad";
		return false;
	}
	input.classList.remove("is-invalid");
	feedBack.classList.remove("invalid-feedback");
	input.classList.add("is-valid");
	feedBack.classList.add("valid-feedback");
	feedBack.innerHTML = "Indicado";
	return true;
}

function validarRadio() {
	
	let opt1 = document.getElementById("radioBackendInput");
	let opt2 = document.getElementById("radioFrontendInput");
	let opt3 = document.getElementById("radioFullstackInput");
	
	let feedBack = document.getElementById("inputRadioFeedback");
	
	if(!opt1.checked || !opt2.checked || !opt3.checked){
		feedBack.classList.remove("is-valid");
		feedBack.classList.add("is-invalid")
		feedBack.innerHTML = "Seleccione uno";
		return false;
	}
	feedBack.classList.remove("is-invalid");
	feedBack.classList.add("is-valid");
	return true;
}

function validarForm() {
	
	let valNombre = validarName();
	let valEmail = validarEmail();
	let valCheck = validarCheck();
	let valEdad = validarEdad();
	let valRadio = validarRadio();
	
	if (!valCheck || !valEdad || !valRadio || !valNombre || !valEmail){		
		event.preventDefault();
	}
		
}

