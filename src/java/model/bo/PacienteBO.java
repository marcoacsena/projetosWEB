package model.bo;

import javax.swing.JOptionPane;
import model.dao.PacienteDAO;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class PacienteBO {

    public int cadastrarPacienteBO(PacienteVO pacienteVO) {
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        int novoId;
        
        if(pacienteDAO.consultarPacientePorCpf(pacienteVO.getCpf()) != null){
            
           novoId = 0;

        } else{
          
            novoId = PacienteDAO.cadastrarPaciente(pacienteVO);
                      
            }
               
        return novoId;
    }
   
    
}
