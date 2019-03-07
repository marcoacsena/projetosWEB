package view;

import appavicena.Controller.PacienteController;
import appavicena.model.vo.PacienteVO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Marco
 */
public class crud extends HttpServlet {

    PacienteVO pacienteVO = new PacienteVO();  

         
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pacienteVO.setNomePaciente(request.getParameter("nomePaciente"));
        pacienteVO.setCelMensagemPaciente(request.getParameter("celMen"));
        pacienteVO.setCpfPaciente(request.getParameter("cpfPaciente"));
        
        PacienteController pacienteController = new PacienteController();        
        pacienteVO.setCodigoPaciente(pacienteController.cadastrarPacientController(pacienteVO));
                 
        if (pacienteVO.getCodigoPaciente() > 0){
        
            request.setAttribute("identificador", pacienteVO.getCodigoPaciente());
            request.setAttribute("nome", pacienteVO.getNomePaciente());
            request.setAttribute("celMen", pacienteVO.getCelMensagemPaciente());
            request.setAttribute("CPF", pacienteVO.getCpfPaciente());
            
            request.getRequestDispatcher("ResultadoDoCadastro.jsp").forward(request, response);
            
        }  else{
            request.getRequestDispatcher("ErroCadastro.jsp").forward(request, response);
        }
            
//                  
    }
}
