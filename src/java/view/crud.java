/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.PacienteController;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class crud extends HttpServlet {

    PacienteVO pacienteVO = new PacienteVO();  

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado do Cadastro</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pacienteVO.setPacNome(request.getParameter("pacNome"));
        pacienteVO.setCelMen(request.getParameter("celMen"));
        pacienteVO.setCpf(request.getParameter("pacCpf"));     
        
        PacienteController pacienteController = new PacienteController();        
        pacienteVO.setPacCod(pacienteController.cadastrarPacientController(pacienteVO));
        
                
        if (pacienteVO.getPacCod() > 0){
        
            request.setAttribute("Identificador", pacienteVO.getPacCod());
            request.setAttribute("nome", pacienteVO.getPacNome());
            request.setAttribute("celMen", pacienteVO.getCelMen());
            request.setAttribute("CPF", pacienteVO.getCpf());
            
            request.getRequestDispatcher("ResultadoDoCadastro.jsp").forward(request, response);
            
        }  else request.getRequestDispatcher("ErroCadastro.jsp").forward(request, response);
            
           
        } 
    
}
