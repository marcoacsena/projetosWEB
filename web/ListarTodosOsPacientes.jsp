
<%@page import="appavicena.model.vo.PacienteVO"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="crud.css">
        <title>Listar Todos Os Pacientes</title>
    </head>
    <body>
        <h1>Lista dos pacientes cadastrados na clínica AVICENA</h1><br><br>        
        
       <table>
           <tr>
               <th>Id</th>
               <th>Nome</th> 
               <th>Celular</th>
               <th>CPF</th>
           </tr>       
            
           
        <%
            
            ArrayList<PacienteVO> pacientesVO = (ArrayList<PacienteVO>) request.getAttribute("pacientes");         
                        
                for (PacienteVO pacienteVO: pacientesVO)                        
                        {%>                                            
                    
                       <tr>
                        <td><%= pacienteVO.getCodigoPaciente()%></td>
                        <td><%= pacienteVO.getNomePaciente()%></td>
                        <td><%= pacienteVO.getCelMensagemPaciente()%></td>
                        <td><%= pacienteVO.getCpfPaciente()%></td>
                       </tr>                   
           
                    <%
                      }
                    %>
                   </table> 
                   
                   <br>
                          <input type="button" value = "Retornar para a Página Principal do sistema AVICENA" onclick="history.go(-2)">
             
<footer>                
        &copy; Desenvolvido por Luciane Benetti e Marco Sena.
</footer> 
</body>
</html>
