<%-- 
    Document   : ErroCadastro
    Created on : 24/10/2018, 16:04:16
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro no Cadastro</title>
    </head>
    <body>        
                    
        <fieldset><legend><h3>Resultado do Processo de Cadastro de Paciente </h3></legend>
            <br><br>
            <p>Atenção! O CPF informado já está cadastrado na base de dados. Por isso, não foi possível cadastrar o Paciente.</p>
            <p>Por gentileza, solicite outro CPF do paciente.</p>
                    
        </fieldset>
        
        <br><br> 
        <input type="button" value = "Retornar para a Página Principal do SISTEMA AVICENA" onclick="history.go(-2)">
    </body>
</html>
