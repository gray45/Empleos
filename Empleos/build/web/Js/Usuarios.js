/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var unica = "";
function add() {

    $.ajax({type: "POST",
        url: "addUser",
        data: {
            username: $("#username").val(),
            password: $("#password").val(),
            tipo: $("#tipo").val(),
            cedula: $("#cedula").val(),
            nombre: $("#nombre").val(),
            primerApellido: $("#primerApellido").val(),
            nacionalidad: $("#nacionalidad").val(),
            telefono: $("#telefono").val(),
            email: $("#email").val(),
            lactitud: $("#lactitud").val(),
            longitud: $("#longitud").val(),
            aprobado: $("#aprobado").val(),
            descripcion: $("#descripcion").val(),
            direccion: $("#inputDireccion").val()
        },

        dataType: "text",
        success: function (data) {
            var respuestaTxt = data.substring(2);
            var tipoRespuesta = data.substring(0, 2);
            if (tipoRespuesta === "E~") {
                alert("error");
            } else {
                alert("guardado");
                $("#formulario").trigger("reset");
            }
        },
        error: function (status) {
            window.alert("Error");
        }
    });
}
/*
 $(document).ready(function () {
 consultarUsuarios(1);
 //consultarUsuariosAutoComplete();
 // paginador(1);
 
 $("#mensajeAlert").hide();
 $("#mesajeResultNeg").removeClass();
 
 $("form").submit(function (event) {
 if (validar() === false){
 event.preventDefault();
 }
 });
 
 $("form").submit(function (event) {
 if (validarContrasenas() === false ){
 event.preventDefault();
 }
 });
 
 desactivaForm();
 $("#inputNombreUsuario").click(ayuda("inputNombreUsuario", 'Sólo texto'));
 
 });*/


/*function consultarUsuariosAutoComplete() {
 //Se envia la información por ajax
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: "consultarUsuarios"
 },
 error: function () { //si existe un error en la respuesta del ajax
 //alert("Se presento un error a la hora de cargar la información de los Chofers en la base de datos");
 mostrarModal("myModal", "Error al cargar en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el datos
 llenarAutoCompleteUsuario(data);
 // se oculta el modal esta funcion se encuentra en el utils.js
 },
 type: 'POST',
 dataType: "json"
 });
 }*/

/*function llenarAutoCompleteUsuario(data) {
 var opcions = {
 data,
 getValue: "nombreUsuario",
 
 list: {
 match: {
 enabled: true
 }
 },
 template: {
 type: "description",
 fields: {
 description: "nombre"
 }
 },
 theme: "dark-light"
 //gris oscuro
 };
 $("#buscarUsu").easyAutocomplete(opcions);
 }*/

function mostrarCampos() {
    if ($("#tipo").val() === "2") {
        ocultarCampos();
        mostrarCamposEmpresa();
    } else {
        if ($("#tipo").val() === "3") {
            ocultarCampos();
            mostrarCamposOferente();
        } else {
            ocultarCampos();
        }
    }
}

function ocultarCampos() {
    $("#divCedula").hide();
    $("#divNombre").hide();
    $("#divPrimerApe").hide();
    $("#divNacionalidad").hide();
    $("#divTelefono").hide();
    $("#divEmail").hide();
    //$("#divLactitud").hide();
    //$("#divlongitud").hide();
    $("#divAprobado").hide();
    $("#divDescripcion").hide();
    $("#divDireccion").hide();
}

function mostrarCamposEmpresa() {
    $("#divNombre").show();
    //$("#divLactitud").show();
    //$("#divlongitud").show();
    $("#divEmail").show();
    $("#divTelefono").show();
    $("#divDescripcion").show();
    $("#divAprobado").show();
    $("#divDireccion").show();
}

function mostrarCamposOferente() {
    $("#divCedula").show();
    $("#divNombre").show();
    $("#divPrimerApe").show();
    $("#divNacionalidad").show();
    $("#divTelefono").show();
    $("#divEmail").show();
    $("#divTelefono").show();
   // $("#divLactitud").show();
   // $("#divlongitud").show();
    $("#divAprobado").show();
    $("#divDireccion").show();
}


/*
 function registraUsuario() {
 if (validar()) {
 if (validarContrasenas()) {                       
 $.ajax({
 url: 'UsuarioServer',
 data: {
 accion: $("#usuarioAction").val(),
 nombreUsuario: $("#inputNombreUsuario").val(),
 contrasena1: $("#inputContrasena1").val(),
 contrasena2: $("#inputContrasena2").val(),
 tipo: $("#inputTipo").val(),
 idUsuario: $("#usuarioAux").val()
 },
 error: function () {
 mostrarMensaje("alert alert-danger", "Se generó un error, contacte al administrador (Error del ajax)", "Error!");
 },
 success: function (data) {
 var respuestaTxt = data.substring(2);
 var tipoRespuesta = data.substring(0, 2);
 if (tipoRespuesta === "E~") {
 mostrarModal("myModal", "Se genero un error", respuestaTxt);
 } else {
 consultarUsuarios(1);
 mostrarModal("myModal", "Registro de Usuarios", $("#inputNombre").val() + " agregado con exito");
 limpiarForm();
 }
 },
 type: "POST",
 dataType: "texT"
 });
 } else {
 mostrarMensaje("alert alert-danger", "Las contraseñas no coinciden", "Error!");
 $("#collapseOne").addClass('show');
 }
 } else {
 mostrarMensaje("alert alert-danger", "Debe digitar los campos del formulario", "Error!");
 $("#collapseOne").addClass('show');
 }
 $("#usuarioAction").val("#agregarUsuario");
 }
 
 function consultarUsuarios(numpag) {
 //Se envia la información por ajax
 $.ajax({
 url: '../cr/ac/una/prograiv/project/controller/UsuarioServer',
 data: {
 accion: "consultarUsuarios"
 },
 error: function () { //si existe un error en la respuesta del ajax
 //alert("Se presento un error a la hora de cargar la información de los Usuarios en la base de datos");
 mostrarModal("mensajeAlert", "Error al cargar en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 dibujarTabla(numpag, data);
 paginador(numpag, data.length / 10);
 //doSearch(data);
 // se oculta el modal esta funcion se encuentra en el utils.js
 },
 type: 'GET',
 dataType: "json"
 });
 }
 
 function dibujarTabla(numpag, dataJson) {
 $("#tablaUsuarios").html("");
 //muestra el enzabezado de la tabla
 var head = $("<thead />");
 var row = $("<tr />");
 head.append(row);
 $("#tablaUsuarios").append(head);
 row.append($("<th><b>NombreUsuario</b></th>"));
 row.append($("<th><b>Tipo</b></th>"));
 row.append($("<th><b>Acción</b></th>"));
 //carga la tabla con el json devuelto
 var cont = 0;
 var i = 10 * (numpag - 1);
 for (; i < dataJson.length && (cont < 10); i++, cont++) {
 dibujarFila(dataJson[i]);
 }
 
 }
 
 function dibujarFila(rowData) {
 //Cuando dibuja la tabla en cada boton se le agrega la funcionalidad de cargar o eliminar la informacion
 //de una persona
 var row = $('<tr />');
 $("#tablaUsuarios").append(row);
 row.append($("<td>" + rowData.nombreUsuario + "</td>"));
 row.append($("<td>" + rowData.tipo + "</td>"));
 row.append($('<td><button type="button" class="btn btn-default btn-xs" aria-label="center Align" onclick="modificarUsuario(' + rowData.IdUsuario + ')">' +
 '<i class="fa fa-pencil" aria-hidden="true"></i>' +
 '</button>' +
 '<button type="button" class="btn btn-default btn-xs" aria-label="center Align" onclick="validaEliminacion(' + "'" + rowData.nombre + "'" + ',' + rowData.pkIdUsuario + ')" data-target="#confirm-delete" data-toggle="modal">' +
 '<i class="fa fa-times" aria-hidden="true"></i>' +
 '</button></td>'));
 }
 
 function mostrarMensaje(classCss, msg, neg) {
 //se le eliminan los estilos al mensaje
 $("#mensajeAlert").removeClass();
 
 //se setean los estilos
 $("#mensajeAlert").addClass(classCss);
 
 //se muestra la capa del mensaje con los parametros del metodo
 $("#mensajeAlert").fadeIn("slow");
 $("#mesajeResultNeg").html(neg);
 $("#mesajeResultText").html(msg);
 $("#mesajeResultText").html(msg);
 }
 
 
 function paginador(pagAct, tam) {
 var ini = 1;
 $("#paginacionOpc").html("");
 if (pagAct > 5) {
 ini = pagAct - 5;
 $("#paginacionOpc").append('<li onclick="consultarUsuarios(' + ini + '),paginador(' + (pagAct - 1) + ',' + tam + ')"><a>&laquo;</a></li>');
 } else {
 $("#paginacionOpc").append('<li onclick="consultarUsuarios(' + ini + '), paginador(' + (pagAct - 1) + ',' + tam + ')" ><a>&laquo;</a></li>');
 }
 for (var i = 0; i < tam; i++, ini++) {
 if (ini === pagAct) {
 $("#paginacionOpc").append('<li class="active" onclick="consultarUsuarios(' + ini + '),paginador(' + ini + ',' + tam + ') "><a>' + ini + '</a></li> ');
 } else {
 $("#paginacionOpc").append('<li onclick="consultarUsuarios(' + ini + '),paginador(' + ini + ',' + tam + ') "><a>' + ini + '</a></li>');
 }
 }
 $("#paginacionOpc").append('<li onclick="consultarUsuarios(' + (ini - 1) + '), paginador(' + (ini - 1) + ',' + tam + ')"><a>&raquo;</a></li>');
 }
 
 function limpiarForm() {
 $('#formularioUsuario').trigger("reset");
 }
 
 function validar() {
 var validacion = true;
 
 //Elimina estilo de error en los css
 //notese que es sobre el grupo que contienen el input
 $("#inputNombreUsuario").removeClass("error");
 $("#inputContrasena1").removeClass("error");
 $("#inputContrasena2").removeClass("error");
 $("#inputPasswordConfirm").removeClass("error");
 $("#inputTipo").removeClass("error");
 // $("#inputDireccion").removeClass("error");
 //valida cada uno de los campos del formulario
 //Nota: Solo si fueron digitadoslse;
 if ($("#inputNombreUsuario").val() === "") {
 $("#inputNombreUsuario").addClass("error");
 validacion = false;
 }
 if ($("#inputContrasena1").val() === "") {
 $("#inputContrasena1").addClass("error");
 validacion = false;
 }
 if ($("#inputContrasena2").val() === "") {
 $("#inputContrasena2").addClass("error");
 validacion = false;
 }
 
 if ($("#inputTipo").val() === "") {
 $("#inputTipo").addClass("error");
 validacion = false;
 }
 return validacion;
 }
 
 function validarContrasenas() {
 var validacion = true;
 $("#inputContrasena2").removeClass("error");
 var contr1 = $("#inputContrasena1").val();
 var contr2 = $("#inputContrasena2").val();
 if (contr1 !== contr2) {
 $("#inputContrasena2").addClass("error");
 validacion = false;
 }
 return validacion;
 }
 
 function validaEliminacion(nom, idUsuario) {
 $('#nombreEliminar').text(nom);
 $('#eliminar').click(function () {
 eliminarUsuario(idUsuario);
 });
 }
 
 function eliminarUsuario(idUsuario) {
 //mostrarModal("myModal", "Espere por favor..", "Se esta eliminando al usuario seleccionado");
 //Se envia la información por ajax
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: "eliminarUsuario",
 idUsuario: idUsuario
 },
 error: function () { //si existe un error en la respuesta del ajax
 cambiarMensajeModal("myModal", "Resultado acción", "Se presento un error, contactar al administador");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 // se cambia el mensaje del modal por la respuesta del ajax
 var respuestaTxt = data.substring(2);
 var tipoRespuesta = data.substring(0, 2);
 if (tipoRespuesta === "E~") {
 cambiarMensajeModal("myModal", "Resultado acción", respuestaTxt);
 } else {
 $("#myModal").hide();
 setTimeout(consultarUsuarios(1), 1000);// hace una pausa y consulta la información de la base de datos
 }
 },
 type: 'POST',
 dataType: "text"
 });
 $("#myModal").hide();
 }
 
 function modificarUsuario(IdUsuario) {
 $("#usuarioAction").val("buscarUsuario");
 
 //mostrarModal("myModal", "Espere por favor..", "Buscando en la base de datos");
 //Se envia la información por ajax
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: $("#usuarioAction").val(),
 idUsuario: IdUsuario
 },
 error: function () { //si existe un error en la respuesta del ajax
 alert("Se presento un error a la hora de buscar el usuario en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 cargaUsuario(data);
 $("#usuarioAction").val("modificarUsuario");
 $("#collapseOne").addClass('show');
 $("#encabezado").addClass('show');
 verificaNombreUsuarioEdicion(data);
 aux(data);
 },
 type: 'POST',
 dataType: "json"
 });
 }
 
 function cargaUsuario(usuario) {
 $("#usuarioAux").val(usuario.IdUsuario);
 $("#inputNombreUsuario").val(usuario.nombreUsuario);
 $("#inputContrasena1").val(usuario.contrasena1);
 $("#inputContrasena2").val(usuario.contrasena2);
 $("#inputTipo").val(usuario.tipo);
 //$("#myModalFormulario").modal();
 $("#usuarioAction").val("modificarUsuario");
 }
 
 function activaForm() {
 $("#inputNombreUsuario").attr("disabled", "true");
 $("#inputContrasena1").removeAttr("disabled");
 $("#inputContrasena2").removeAttr("disabled");
 $("#inputTipo").removeAttr("disabled");
 }
 function desactivaForm() {
 $("#inputNombreUsuario").removeAttr("disabled");
 $("#inputContrasena1").attr("disabled", "true");
 $("#inputContrasena2").attr("disabled", "true");
 $("#inputTipo").attr("disabled", "true");
 }
 
 function verificaNombreUsuarioEdicion(usuario) {
 var nombree = $("#inputNombreUsuario").val();
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: "verificarNombreUsuario",
 nombreUsuario: nombree
 },
 error: function () {
 mostrarMensaje("alert alert-danger", "Se genero un error, contacte al administrador (Error del ajax)", "Error!");
 },
 success: function (data) {
 var respuestaTxt = data.substring(2);
 var tipoRespuesta = data.substring(0, 2);
 if (tipoRespuesta !== "E~" || nombree === usuario.nombreUsuario) {
 $("#inputNombreUsuario").val(nombree);
 $("#inputNombreUsuario").addClass("correcto");
 $("#collapseOne").addClass('show');
 desactivaForm();
 //activaForm();
 } else {
 $("#inputNombreUsuario").addClass("error");
 desactivaForm();
 
 }
 },
 type: "POST",
 dataType: "text"
 });
 }
 
 function aux(usuario) {
 var unica = usuario.nombreUsuario;
 }
 
 function verificaNombreUsuario(id, tam, mensaje) {
 var nombree = $("#inputNombreUsuario").val();
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: "verificarNombreUsuario",
 nombreUsuario: nombree
 },
 error: function () {
 mostrarMensaje("alert alert-danger", "Se genero un error, contacte al administrador (Error del ajax)", "Error!");
 },
 success: function (data) {
 var respuestaTxt = data.substring(2);
 var tipoRespuesta = data.substring(0, 2);
 if (tipoRespuesta !== "E~") {
 if (validaTamMin(id, tam, mensaje)) {
 $("#inputNombreUsuario").val(nombree);
 $("#inputNombreUsuario").addClass("correcto");
 $("#collapseOne").addClass('show');
 alert("Nombre de usuario verificado correctamente, proceda a llenar los demás campos");
 activaForm();
 }
 } else {
 $("#inputNombreUsuario").addClass("error");
 var ff = unica;
 if ($("#usuarioAction").val() === "modificarUsuario" && $("#inputNombreUsuario").val() === ff) { //????
 alert("Nombre de usuario verificado correctamente, proceda a llenar los demás campos");
 activaForm();
 } else {
 alert("El nombre de usuario que digitó ya existe, por favor digite uno nuevo");
 }
 }
 },
 type: "POST",
 dataType: "text"
 });
 }
 
 
 function buscarUsuario() {
 // alert($("#buscarUsu").val());
 var nombree = $("#buscarUsu").val();
 $.ajax({
 url: '../UsuarioServlet',
 data: {
 accion: "buscarNombreUsuario",
 nombreUsuario: nombree
 },
 error: function () {
 mostrarMensaje("alert alert-danger", "Se genero un error, contacte al administrador (Error del ajax)", "Error!");
 $("#buscarUsu").addClass("error");
 alert("No se encontró al usuario, digite una nueva busqueda");
 },
 success: function (data) {
 // alert("repuesta");
 // alert( data[0].nombreUsuario);
 //var respuestaTxt = data.substring(2);
 //var tipoRespuesta = data.substring(0, 2);
 if (nombree === data[0].nombreUsuario){
 // alert("entro al if");
 
 dibujarTabla(1, data);
 } else {
 alert("No se encontró al usuario, digite una nueva busqueda");
 }
 },
 type: "POST",
 dataType: "json"
 });
 }
 */