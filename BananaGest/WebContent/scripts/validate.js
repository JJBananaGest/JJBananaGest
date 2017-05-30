//responsable
var lista_btns_asignar = document.getElementsByClassName('resp');
for (var i = 0; i < lista_btns_asignar.length; i++) {
    lista_btns_asignar[i].onclick = function (evnt) {
        var id = this.getAttribute('data-id');
        var elemAAsignar = document.getElementById(id);
        elemAAsignar.innerHTML = "<form class='form-inline' action='#' method='POST' novalidate><input type='text' id='" + id + "i' pattern='[a-zA-Z ]*' required></input></form>"

        var miro = document.getElementById('guarda' + id)
        document.getElementById('guarda' + id).onclick = function (evnt) {
            console.log('mira lo que hay: ', miro);
            var validos = validaInput();
            //debugger;
            if (!validos) return false;
        }
        function validaInput() {

            var responsable = document.getElementById(id + 'i');
            console.log('mira lo que responsableee: ', responsable, ' id: ', id);

            var mensajes = '';

            if (!responsable.validity.valid) {
                if (responsable.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de responsable correcto</li>'
                if (responsable.validity.valueMissing) mensajes += '<li>Tienes que introducir un responsable</li>'
            }

            document.getElementById('erroresresp').innerHTML = mensajes;

            return mensajes ? false : true;
        }
    }
}

document.getElementById('guarda1r').onclick = function (evnt) {
    var valido2 = validaEntradConAPI2();
    //debugger;
    if (!valido2) return false;
}

function validaEntradConAPI2() {

    var titulo = document.getElementById('titulo2');
    var descripcion = document.getElementById('descripcion');
    var fecha = document.getElementById('fecha');
    var responsable = document.getElementById('1r');
    var errores2 = document.getElementById('erroresresp');
    var mensajes = '';
     console.log('mira lo que hay en responsable: ', responsable); 
    if (!titulo.validity.valid) {
        if (titulo.validity.valueMissing) mensajes += '<li>Tienes que introducir un titulo</li>'
    }

    if (!descripcion.validity.valid) {
        if (descripcion.validity.valueMissing) mensajes += '<li>Tienes que introducir una descripcion</li>'
    }

    if (!fecha.validity.valid) {
        if (fecha.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de fecha correcta</li>'
        if (fecha.validity.valueMissing) mensajes += '<li>Tienes que introducir una fecha</li>'
    }

    if (!responsable.validity.valid) {
        if (responsable.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de responsable correcto</li>'
        if (responsable.validity.valueMissing) mensajes += '<li>Tienes que introducir un responsable</li>'
    }

    errores2.innerHTML = mensajes;

    return mensajes ? false : true;
}