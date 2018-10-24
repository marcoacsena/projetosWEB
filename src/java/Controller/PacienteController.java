package Controller;

import model.bo.PacienteBO;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class PacienteController {

    public int cadastrarPacientController(PacienteVO pacienteVO) {
                
        PacienteBO pacienteBO = new PacienteBO();
        int novoId = pacienteBO.cadastrarPacienteBO(pacienteVO);
        
        return novoId;
    }
    
}
