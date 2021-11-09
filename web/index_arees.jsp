<%-- 
    Document   : index
    Created on : Nov 13, 2018, 4:17:45 PM
    Author     : alumne
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="index.*" %>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP DEMOS - CÀLCUL ÀREES.</title>
        <link rel="STYLESHEET" href="./css/estil.css" TYPE="text/css">
    </head>
    <body>
        <h2>JSP DEMOS - CÀLCUL ÀREA I PERIMETRE D'UNA FIGURA</h2>
        <%@include file="menu.jsp" %>
        <form method="post" action="index.jsp">
            <label for="figura">Figura</label>
            <p>
            <select name="figura">
                <option value="figuraTriangle">Triangle</option>
                <option value="figuraRectangle">Rectangle</option>
            </select>
            </p>
            <label for="base">Base (en cms):</label>
            <input type="text" name="base" id="base" placeholder="10.0"><br/>
            <label for="alsada">Alçada (en cms)</label>
            <input type="text" name="alsada" id="alsada" placeholder="10.0"><br/>
            <input type="submit" name="ok" value="Enviar"/>
        </form> 

       
        <%
           
            //si ha clicat o no al botó del formulari
           if(request.getParameter("ok")!=null) {
              
              double base, alsada;
              // Validar el select.
              String figura = request.getParameter("figura");
              out.println("<p>" + figura + "</p>");
              //debería validar los valores de mis cajas
              //según lo entrado, me debería salir o no un resultado
              //crear una clase de validacion
              
              base=Validation.validaDouble(
                   request.getParameter("base"));
              alsada=Validation.validaDouble(
                   request.getParameter("alsada"));
             
              if(base <0 || alsada <0){
                  out.println("<p class='error'>Error, has d'introduir números positius!</p>");
              }else{
                CalculArees indice = new CalculArees(base,alsada);

                out.println("<p>L'àrea és de: </p>");
                out.println(String.format("%.2f", indice.calculaAreaRectangle()));
                
                out.println("<p>El perímetre és de: </p>");
                out.println(String.format("%.2f", indice.calculaPerimetreRectangle()));
              }
           }
           
        %>
        
    </body>
</html>
