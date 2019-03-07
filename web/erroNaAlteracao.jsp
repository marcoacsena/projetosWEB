<%-- 
    Document   : erroNaAlteracao
    Created on : 30/11/2018, 08:19:09
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="crud.css">
        <title>Erro na Alteração</title>
    </head>
    <body>
        <fieldset><legend><h3>Não foi possível alterar o Paciente com o CPF indicado a seguir </h3></legend>
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
