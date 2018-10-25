package model.bo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.dao.PacienteDAO;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class PacienteBO {
    
    PacienteDAO pacienteDAO = new PacienteDAO();

    public int cadastrarPacienteBO(PacienteVO pacienteVO) {
        
        
        int novoId;
        
        if(pacienteDAO.consultarPacientePorCpf(pacienteVO.getCpf()) != null){
            
           novoId = 0;

        } else{
          
            novoId = PacienteDAO.cadastrarPaciente(pacienteVO);
                      
            }
               
        return novoId;
    }

    public ArrayList listarTodosOsPacientesBO() {
        
        ArrayList listaDePacientes;
        
        listaDePacientes = pacienteDAO.listarTodosOsPacientes();
        return listaDePacientes;
    }
   
    
}
