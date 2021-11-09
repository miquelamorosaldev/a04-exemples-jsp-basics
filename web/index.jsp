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
        <title>JSP DEMOS - VALIDACIÓ ADN.</title>
        <link rel="STYLESHEET" href="./css/estil.css" TYPE="text/css">
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        <h2>JSP DEMOS - VALIDACIÓ CADENA ADN</h2>
        <form method="post" action="index.jsp">
            <label for="adn">Cadena ADN</label>
            <input type="textarea" name="adn" id="adn" placeholder="AGCT"><br/>
            <input type="submit" name="ok" value="Enviar"/>
        </form> 

       
        <%
           
            //si ha clicat o no al botó del formulari
           if(request.getParameter("ok")!=null) {
              
              double base, alsada;
              // Validar el select.
              String adn = request.getParameter("adn");
              out.println("<p>" + adn + "</p>");
           }
           
        %>
        
    </body>
</html>
