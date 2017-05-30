//borrar
var req = new XMLHttpRequest();
var lista_btns_borrar = document.getElementsByClassName('borr');
for (var i = 0; i < lista_btns_borrar.length; i++) {
    lista_btns_borrar[i].onclick = function (evnt) {
        var id = this.getAttribute('data-id');

        var seguro = confirm('Estas seguro de borrar?');
        if (seguro) {
            req.onreadystatechange = function () {
                if (req.readyState == 4) {
                    var elemABorrar = document.getElementById(id);
                    if (req.responseText == 'ok') elemABorrar.parentNode.removeChild(elemABorrar);
                }
            }
            req.open("GET", 'ok.html', true);
            req.send("");
        }
    }
}

//button volver

var lista_btns_volver = document.getElementsByClassName('volver');
for (var i = 0; i < lista_btns_volver.length; i++) {
    lista_btns_volver[i].onclick = function (evnt) {
            
                   window.history.back();
        }
}

//button tareas

var lista_btns_vertareas = document.getElementsByClassName('ver');
for (var i = 0; i < lista_btns_vertareas.length; i++) {
    lista_btns_vertareas[i].onclick = function (evnt) {

                    window.location="tareas1.html";
        }
}

//button editar
var lista_btns_editproyectos = document.getElementsByClassName('edit');
for (var i = 0; i < lista_btns_editproyectos.length; i++) {
    lista_btns_editproyectos[i].onclick = function (evnt) {

                    window.location="editar.html";
        }
}

//button editar tareas
var lista_btns_editartar = document.getElementsByClassName('edittar');
for (var i = 0; i < lista_btns_editartar.length; i++) {
    lista_btns_editartar[i].onclick = function (evnt) {

                    window.location="editart.html";
        }
}

//button ordena fechas

var fecha = document.getElementsByClassName("fecha");

fecha.onclick = function(){
    
}




