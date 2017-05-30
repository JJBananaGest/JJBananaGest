document.getElementById('btn_login').onclick = function(evnt) {
    var valido = validaEntradConAPI();
    //debugger;
    if (!valido) return false;
}

function validaEntradConAPI() {
    
    var email = document.getElementById('email');
    var password = document.getElementById('password');
    var errores = document.getElementById('errores');
    var mensaje = '';

    if(!email.validity.valid){
        if(email.validity.typeMismatch) mensaje +='<li>Tienes que introducir un formato de email correcto</li>'
        if(email.validity.valueMissing) mensaje +='<li>Tienes que introducir un email</li>'
    }

    if(!password.validity.valid){
        if(password.validity.valueMissing) mensaje +='<li>Tienes que introducir una contraseña</li>'
    }
    errores.innerHTML = mensaje;

    return mensaje?false:true;
}

