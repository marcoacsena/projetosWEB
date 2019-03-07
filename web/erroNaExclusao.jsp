<%-- 
    Document   : ErroNaExclusao
    Created on : 29/11/2018, 13:41:21
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="crud.css">
        <title>Erro na Exclusão</title>
    </head>
    <body>
        <h1>Resultado da Solicitação de Exclusão!</h1>
        
        <div id="form">
            <form method="post">
                <fieldset><legend>Paciente Não foi excluído porque o CPF não existe!</legend>
               
                    CPF: <input type="text" size="30" disabled value="<%=request.getAttribute("cpf")%>"><br><br>                                  
           
                </fieldset>
                    
                    <br>
                          <input type="button" value = "Retornar para a Página Principal do sistema AVICENA" onclick="history.go(-2)">
            </form>
        
        </div>
                    
 <footer>                
        &copy; Desenvolvido por Luciane Benetti e Marco Sena.
 </footer>         
        
</body>
</html>
