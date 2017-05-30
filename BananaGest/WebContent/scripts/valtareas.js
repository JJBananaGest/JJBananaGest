document.getElementById('guarda1r').onclick = function (evnt) {
    var valido2 = validaEntradConAPI2();
    //debugger;
    if (!valido2) return false;
}

function validaEntradConAPI2() {

    document.getElementById('guarda1r').onclick = function (evnt) {
        var valido2 = validaEntradConAPI2();
        //debugger;
        if (!valido2) return false;
    }

    function validaEntradConAPI2() {


        var descripcion = document.getElementById('descripcion');
        var notas = document.getElementById('notas');
        var adjuntos = document.getElementById('adjuntos');
        var fechai = document.getElementById('fecha');
        var fechaf = document.getElementById('fechaf');
        var responsable = document.getElementById('responsable');
        var estado = document.getElementById('estado');
        var errores2 = document.getElementById('erroresresp');
        var mensajes = '';

        console.log('mira lo que hay en responsable: ', responsable);

        if (!descripcion.validity.valid) {
            if (descripcion.validity.valueMissing) mensajes += '<li>Tienes que introducir una descripcion</li>'
        }

        if (!notas.validity.valid) {
            if (notas.validity.valueMissing) mensajes += '<li>Tienes que introducir unas notas</li>'
        }

        if (!fechai.validity.valid) {
            if (fechai.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de fecha inicial correcta</li>'
            if (fechai.validity.valueMissing) mensajes += '<li>Tienes que introducir una fecha inicial</li>'
        }

        if (!fechaf.validity.valid) {
            if (fechaf.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de fecha final correcta</li>'
            if (fechaf.validity.valueMissing) mensajes += '<li>Tienes que introducir una fecha final</li>'
        }


        if (!responsable.validity.valid) {
            if (responsable.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de responsable correcto</li>'
            if (responsable.validity.valueMissing) mensajes += '<li>Tienes que introducir un responsable</li>'
        }

        if (!estado.validity.valid) {
            if (estado.validity.patternMismatch) mensajes += '<li>Tienes que introducir un formato de estado correcto</li>'
            if (estado.validity.valueMissing) mensajes += '<li>Tienes que introducir un estado</li>'
        }

        errores2.innerHTML = mensajes;

        return mensaje ? false : true;
    }
}