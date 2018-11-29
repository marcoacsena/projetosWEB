/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.PacienteController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.vo.PacienteVO;


/**
 *
 * @author Marco
 */
public class excluirPacienteServlet extends HttpServlet {

    PacienteVO pacienteVO = new PacienteVO();
               
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        pacienteVO.setCpfPaciente(request.getParameter("cpfPaciente"));
        
        PacienteController pacienteController = new PacienteController();
               
        Boolean delacao = pacienteController.excluirPacienteController(pacienteVO.getCpfPaciente());

        if(delacao){
           request.setAttribute("cpf", pacienteVO.getCpfPaciente());
           
           request.getRequestDispatcher("resultadoDaExclusao.jsp").forward(request, response);
          
        }else {
           request.getRequestDispatcher("erroNaExclusao.jsp").forward(request, response);
        
        }
        
    }

    

}
