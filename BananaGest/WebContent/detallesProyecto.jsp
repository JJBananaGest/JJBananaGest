<jsp:include page="head.jsp"></jsp:include>

<body>
	<jsp:include page="header.jsp"></jsp:include>
    <nav>
        <div class="row">
            <div id="erroresresp"></div>
            <div class="col-xs-3 anchop">
            </div>
        </div>
    </nav>
    <div class="container-fluid">
        <div class="row central">
            <div class="col-md-9 section">
                <section>
                    <div class="tabla">
                         <div class="fila-tabla row">
                            <div class="col-xs-4 col-sm-6 col-md-12 bct">Proyecto</div>
                        </div>                        
                        <div class="cabecera-tabla row">
                            <div class="col-xs-4 col-sm-6 col-md-2">Título</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">Descripción</div>
                            <div class="col-xs-4 col-sm-6 col-md-2 fecha">Fecha inicio</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">Responsable</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">Funciones</div>
                            <div class="col-xs-0 col-sm-6 col-md-2"></div>
                        </div>
                        <div class="fila-tabla  row" id="1">
                            <div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
                            <div class="col-xs-4 col-sm-6 col-md-2" id="1r">Gloria Fernandez</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">
                                <button type="reset" class="resp" data-id="1r" aria-label="boton para asignar responsable de proyecto">Asignar</button>
                                <button type="reset" class="edit" aria-label="boton para editar proyecto">Editar</button>
                                <button class="guard" id= "guarda1r" aria-label="Este botÃ³n sirve para guardar el responsable">guardar</button>
                                <button class="borr" data-id="1" aria-label="boton para borrar proyecto">Borrar</button>
                                <button class="ver" aria-label="boton para ver las tareas del proyecto">Ver</button>
                            </div>
                            <div class="col-xs-0 col-sm-6 col-md-2"></div>
                        </div>
                        <div class="fila-tabla  row" id="2" >
                            <div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
                            <div class="col-xs-4 col-sm-6 col-md-2" id="2r">Gloria Fernandez</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">
                                 <button type="reset" class="resp" data-id="2r" aria-label="boton para asignar responsable de proyecto">Asignar</button>
                                <button type="reset" class="edit" aria-label="boton para editar proyecto">Editar</button>
                                <button class="guard" id= "guarda2r" aria-label="Este botÃ³n sirve para guardar el responsable">guardar</button>
                                <button class="borr" data-id="2" aria-label="boton para borrar proyecto">Borrar</button>
                                <button class="ver" aria-label="boton para ver las tareas del proyecto">Ver</button>
                                </div>
                                
                            <div class="col-xs-0 col-sm-6 col-md-2"></div>
                        </div>
                        <div class="fila-tabla  row" id="3">
                            <div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
                            <div class="col-xs-4 col-sm-6 col-md-2" id="3r">Gloria Fernandez</div>
                            <div class="col-xs-4 col-sm-6 col-md-2">
                                <button type="reset" class="resp" data-id="3r" aria-label="boton para asignar responsable de proyecto">Asignar</button>
                                <button type="reset" class="edit" aria-label="boton para editar proyecto">Editar</button>
                                <button class="guard" id= "guarda3r" aria-label="Este botÃ³n sirve para guardar el responsable">guardar</button>
                                <button class="borr" data-id="3" aria-label="boton para borrar proyecto">Borrar</button>
                                <button class="ver" aria-label="boton para ver las tareas del proyecto">Ver</button>
                            </div>
                            <div class="col-xs-0 col-sm-6 col-md-2"></div>
                        </div>
                    </div>
                </section>
            </div>
            <div class="col-xs-12 col-sm-3 col-md-3 aside">
                <aside>
                 <div class="fila-tabla row">
                     <div class="col-xs-4 col-sm-6 col-md-12 bca">Informacion Importante</div>
                 </div>                        

                    <p>  !tip: Si quieres asignar un responsalbe pulsa el icono con forma de persona </p>
                    <p>  !tip: Si quieres editar un proyecto pulsa el icono con forma de lapiz </p>
                    <p>  !tip: Si quieres grabar un responsalbe editado pulsa el icono con forma de disquete </p>
                    <p>  !tip: Si quieres borrar un proyecto pulsa el icono con forma de papelera </p>
                    <p>  !tip: Si quieres ver las tareas de un proyecto pulsa el icono con forma de ojo </p>
                </aside>
            </div>
        </div>
    </div>
   <jsp:include page="footer.jsp"></jsp:include>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="scripts/bootstrap/js/bootstrap.min.js"></script>
<script src="scripts/funciones.js"></script>
<script src="scripts/validate.js"></script>
</html>