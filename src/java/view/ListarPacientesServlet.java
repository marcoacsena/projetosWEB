package view;

import appavicena.Controller.PacienteController;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import appavicena.model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
@WebServlet("/listarTodospacientes")
public class ListarPacientesServlet extends HttpServlet {

    PacienteVO pacienteVO = new PacienteVO();  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PacienteController pacienteController = new PacienteController();        
        ArrayList<PacienteVO> pacientesVO = pacienteController.listarTodosOsPacientesContoller();
        System.out.println(pacientesVO);
        
        
//        request.setAttribute("pacientes", pacientesVO);
//        request.getRequestDispatcher("ListarTodosOsPacientes.jsp").forward(request, response);
    }
}