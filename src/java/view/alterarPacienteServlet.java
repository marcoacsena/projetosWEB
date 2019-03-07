/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import appavicena.Controller.PacienteController;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import appavicena.model.vo.PacienteVO;

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
        pacienteVO.setCelMensagemPaciente(request.getParameter("celMen"));
        
        PacienteController pacienteController = new PacienteController();
               
        Boolean alteracao = pacienteController.alterarPacienteController(pacienteVO);

        if(alteracao){
           request.setAttribute("cpf", pacienteVO.getCpfPaciente());
           request.setAttribute("nomeAlterado", pacienteVO.getNomePaciente());
           request.setAttribute("celularAlterado", pacienteVO.getCelMensagemPaciente());
           request.getRequestDispatcher("resultadoDaAlteracao.jsp").forward(request, response);
            
        }else {
           request.getRequestDispatcher("erroNaAlteracao.jsp").forward(request, response);
        
        }

    }
}
