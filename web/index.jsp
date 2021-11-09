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
        <h2>JSP DEMOS - VALIDACIÓ CADENA ADN</h2>
        <%@include file="menu.jsp" %>
        <form method="post" action="index.jsp">
            <P>
                <label for="adn">Cadena ADN</label>
                <input type="textarea" name="adn" id="adn" placeholder="AGCT" />
            </P>
            <P>
                <label for="condicions">He llegit y acepto las condicions</label>
                <input type="checkbox" name="condicions" value="selected" />
            </P>
            <input type="submit" name="ok" value="Enviar"/>
        </form> 

       
        <%
           
            //si ha clicat o no al botó del formulari
           if(request.getParameter("ok")!=null) {
              
              double base, alsada;
              // Validar el ADN
              String adn = request.getParameter("adn");
              
              ADN_Manager adnManager = new ADN_Manager();
              boolean adnOK = adnManager.validaADN(adn);
              
              // Validar la checkbox
              String casilla = request.getParameter("condicions");
              boolean casillaOK = casilla!=null && casilla.equals("selected");
              
              if(casillaOK && adnOK) {
                  out.println("<p>" + adn + 
                          "</p><p>La cadena ADN introduïda és vàlida</p>");
              } else {
                  if(!casillaOK) { 
                      out.println("<p class='error'>No has seleccionat la casella.</p>");
                  }
                  if(!adnOK) { 
                      out.println("<p class='error'>L'ADN introduit no té un format vàlid.</p>");
                  }
              }
           }
           
        %>
        
    </body>
</html>
