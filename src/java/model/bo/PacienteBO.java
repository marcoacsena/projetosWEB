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
        
        if(pacienteDAO.consultarPacientePorCpf(pacienteVO.getCpfPaciente()) != null){
            
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

    public boolean excluirPaciente(String cpf) {
        Boolean delacao = false;
        
        if(pacienteDAO.excluirPaciente (cpf)){
            
           delacao = true;
        } 
        
        return delacao;
    }

    public Boolean alterarPacienteBO(PacienteVO pacienteVO) {
        Boolean alteracao = false;
        
        if(pacienteDAO.alterarPacienteDAO(pacienteVO)){
            
           alteracao = true;
        } 
        
        return alteracao;
    }

    
   
    
}
