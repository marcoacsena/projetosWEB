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
public class alterarPacienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    PacienteVO pacienteVO = new PacienteVO();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
   pacienteVO.setCpfPaciente(request.getParameter("cpfPaciente"));
   pacienteVO.setNomePaciente(request.getParameter("nomePaciente"));
   pacienteVO.setNomePaciente(request.getParameter("celMen"));
        
        PacienteController pacienteController = new PacienteController();
               
        Boolean alteracao = pacienteController.alterarPacienteController(pacienteVO);

        if(alteracao){
           request.setAttribute("cpf", pacienteVO.getCpfPaciente());
           request.setAttribute("nomeAlterado", pacienteVO.getCpfPaciente());
           request.setAttribute("celularAlterado", pacienteVO.getCpfPaciente());
           request.getRequestDispatcher("resultadoDaAlteracao.jsp").forward(request, response);
            
        }else {
           request.getRequestDispatcher("erroNaalteracao.jsp").forward(request, response);
        
        }

    }
}
