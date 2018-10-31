package Controller;

import java.util.ArrayList;
import model.bo.PacienteBO;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class PacienteController {
    
    PacienteBO pacienteBO = new PacienteBO();

    public int cadastrarPacientController(PacienteVO pacienteVO) {
            
        int novoId = pacienteBO.cadastrarPacienteBO(pacienteVO);
        
        return novoId;
    }

    public ArrayList<PacienteVO> listarTodosOsPacientesContoller() {
        
        ArrayList<PacienteVO> listaDePacientes;
        
        listaDePacientes = pacienteBO.listarTodosOsPacientesBO();
        return listaDePacientes;
    }
    
}
