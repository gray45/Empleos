/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*$(document).ready(function () {
todas();

});*/

function hijos (){
    $.ajax({
        
 url: "CarateristicasServer",
 
 data: {
 accion: "hijos",
 padre: 0
 },
 error: function () { //si existe un error en la respuesta del ajax
 alert("Se presento un error a la hora de cargar la información en la base de datos");
 //mostrarModal("mensajeAlert", "Error al cargar en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 dibujarRama(data);
 //alert(data[0].descripcion);
  },
 type: 'GET',
 dataType: "json"
 });
 
}

function childs (daddy){
    
    $.ajax({
        
 url: "CarateristicasServer",
 
 data: {
 accion: "hijos",
 padre: daddy
 },
 error: function () { //si existe un error en la respuesta del ajax
 alert("Se presento un error a la hora de cargar la información en la base de datos");
 //mostrarModal("mensajeAlert", "Error al cargar en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 dibujarHoja(data, daddy);

  },
 type: 'GET',
 dataType: "json"
 });
 
}

function todas() {
 //Se envia la información por ajax
 $.ajax({
 url: "CarateristicasServer",
 
 data: {
 accion: "todas"
 },
 error: function () { //si existe un error en la respuesta del ajax
 alert("Se presento un error a la hora de cargar la información en la base de datos");
 //mostrarModal("mensajeAlert", "Error al cargar en la base de datos");
 },
 success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
 dibujarArbol(data);
 alert(data[0].descripcion);
  },
 type: 'GET',
 dataType: "json"
 });
 }
 
 function  dibujarArbol(data){
 for (i=0; data.length > i ; i++) {
 var  li= $("<li />");
 var a = $("<a />");
 li.append(a);
 $("#barra").append(li);
 a.append(data[i].descripcion);
 //carga la tabla con el json devuelto
 }
 }
 
 function  dibujarRama(data){
     if($("#caract").children()){
         //var al = $("#a"); 
          $("#caract").children('ul').remove();
     // $("#caract").append(al);
     }
     var  ul= $("<ul />");
 for (i=0; data.length > i ; i++) {
 var  li= $('<li class="segundo" onclick="childs('+ data[i].idCarateristicas + ')" id="' + data[i].idCarateristicas + '" />');
 var a = $("<a />");
 li.append(a);
 ul.append(li);
 $("#caract").append(ul);
 a.append(data[i].descripcion);
 //carga la tabla con el json devuelto
 }
 }
 
  function  dibujarHoja(data, padre){
     if($("#"+ padre).children()){
         //var al = $("#a"); 
          $("#"+ padre).children('ul').remove();
     // $("#caract").append(al);
     }
     var  ul= $("<ul />");
 for (i=0; data.length > i ; i++) {
 var  li= $('<li onclick="childs('+ data[i].idCarateristicas + ')" id="' + data[i].idCarateristicas + '" />');
 var a = $("<a />");
 li.append(a);
 ul.append(li);
 $("#"+ padre).append(ul);
 a.append(data[i].descripcion);
 //carga la tabla con el json devuelto
 }
 }