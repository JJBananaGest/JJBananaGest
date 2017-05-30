document.getElementById('bc').onclick = function (evnt) {
    console.log('mira lo que hay en aqui ');
    var valido2 = validaEntradaUsuario();
    //debugger;
    if (!valido2) return false;
}

function validaEntradaUsuario() {
console.log('mira lo que hay en alli ');
    var nombre = document.getElementById('nombre');
    var email = document.getElementById('email');
    var password = document.getElementById('password');
    var presentacion = document.getElementById('presentacion');
    var foto = document.getElementById('foto');
    var video = document.getElementById('video');
    var errores2 = document.getElementById('errores');
    var mensajes = '';
   
    if (!nombre.validity.valid) {
        if (nombre.validity.patternMismatch) mensajes += '<li>Tienes que introducir un nombre correcto</li>'
        if (nombre.validity.valueMissing) mensajes += '<li>Tienes que introducir un nombre</li>'
    }

    if (!email.validity.valid) {
        if(email.validity.typeMismatch) mensajes +='<li>Tienes que introducir un formato de email correcto</li>'
        if (email.validity.valueMissing) mensajes += '<li>Tienes que introducir una email</li>'
    }

    if (!password.validity.valid) {
        if (password.validity.valueMissing) mensajes += '<li>Tienes que introducir una password</li>'
    }
    

    if (!presentacion.validity.valid) {
        if (presentacion.validity.valueMissing) mensajes += '<li>Tienes que introducir una presentación</li>'
    }
    if (!foto.validity.valid) {
        if (foto.validity.patternMismatch) mensajes += '<li>Tienes que introducir una extension de foto correcta</li>'
    }

    if (!video.validity.valid) {
        if (video.validity.patternMismatch) mensajes += '<li>Tienes que introducir una extension de video correcto</li>'
    }

    errores2.innerHTML = mensajes;

    return mensajes ? false : true;
}

//button volver

var lista_btns_volver = document.getElementsByClassName('volver2');
for (var i = 0; i < lista_btns_volver.length; i++) {
    lista_btns_volver[i].onclick = function (evnt) {
            
           window.history.back();
        }
}