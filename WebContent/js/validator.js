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





