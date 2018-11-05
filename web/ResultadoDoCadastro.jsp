<%-- 
    Document   : ResultadoDoCadastro
    Created on : 22/10/2018, 08:34:37
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="crud.css">
        <title>Solicitação de Cadastro</title>
    </head>
    <body>       
        <h1>Resultado do Cadastro!</h1>
        
        <div id="form">
            <form method="post">
                <fieldset><legend>Dados Cadastrados do Paciente</legend>
               
                    Identificador: <input type="text" size="30" value="<%=request.getAttribute("identificador")%>"><br><br>
                    Nome: <input type="text" size="30" value="<%=request.getAttribute("nome")%>"><br><br>
                    Celular: <input type="text" size="30" value="<%=request.getAttribute("celMen")%>"><br><br>
                    CPF: <input type="text" size="30" value="<%=request.getAttribute("CPF")%>"><br><br>                                  
           
                </fieldset>
                    
                    <br>
                          <input type="button" value = "Retornar para a Página Principal do sistema AVICENA" onclick="history.go(-2)">
            </form>
            <br>
        </div>
        
        
        
    </body>
</html>
