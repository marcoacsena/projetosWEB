<%-- 
    Document   : resultadoDaAlteracao
    Created on : 29/11/2018, 16:20:56
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="crud.css">
        <title>Resultado da Alteração</title>
    </head>
    <body>
        <h1>Resultado da Solicitação de Alteração de Paciente</h1>
        <fieldset><legend><h3>Paciente com CPF Indicado a seguir Foi alterado</h3></legend>
            <br><br>
            CPF: <input type="text" size="30" value="<%=request.getAttribute("cpf")%>"><br><br>
                    
        </fieldset>
        
        <br><br> 
        <input type="button" value = "Retornar para a Página Principal do SISTEMA AVICENA" onclick="history.go(-2)">

        <footer>                
        &copy; Desenvolvido por Luciane Benetti e Marco Sena.
</footer>        
        
</body>
</html>
