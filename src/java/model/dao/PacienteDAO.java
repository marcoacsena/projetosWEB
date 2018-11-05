package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.vo.PacienteVO;

/**
 *
 * @author Marco
 */
public class PacienteDAO {

    public static int cadastrarPaciente(PacienteVO pacienteVO) {
       
        int novoId = 0;

		String sql = "INSERT INTO paciente (nomePaciente, celMensagemPaciente,  cpfPaciente)  VALUES (?,?,?)";
//foneRes, foneCom, email, cnpj,logradouro, numLog, complemento, bairro, cidade, uf, cep
		Connection conn = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conn, sql, Statement.RETURN_GENERATED_KEYS);

		try {
			prepStmt.setString(1, pacienteVO.getNomePaciente());
			prepStmt.setString(2, pacienteVO.getCelMensagemPaciente());
			//prepStmt.setString(3, paciente.getFoneRes());
			//prepStmt.setString(4, paciente.getFoneCom());
			//prepStmt.setString(5, paciente.getEmail());
			prepStmt.setString(3, pacienteVO.getCpfPaciente());
			//prepStmt.setString(7, pacienteVO.getCnpj());
			//prepStmt.setString(8, pacienteVO.getLogradouro());
			//prepStmt.setString(9, pacienteVO.getNumLog());
			//prepStmt.setString(10, pacienteVO.getComplemento());
			//prepStmt.setString(11, pacienteVO.getBairro());
			//prepStmt.setString(12, pacienteVO.getCidade());
			//prepStmt.setString(13, pacienteVO.getUf());
			//prepStmt.setString(14, pacienteVO.getCep());
			
		
			prepStmt.executeUpdate();

			ResultSet generatedKeys = prepStmt.getGeneratedKeys();

			if (generatedKeys.next()) {
				novoId = generatedKeys.getInt(1);
				
			}

		} catch (SQLException e) {
			System.out.println("Erro ao executar o Cadastro do paciente! Causa: \n: " + e.getMessage());

		} finally {
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conn);
		}
		return novoId;        
    }
    
    public PacienteVO consultarPacientePorCpf(String cpf){
    
    		String query = "SELECT * from paciente where cpfPaciente = ?";

		Connection conn = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conn, query);                
		PacienteVO pacienteVO = null;
                
		try {
			prepStmt.setString(1, cpf);
			ResultSet result = prepStmt.executeQuery();

			while (result.next()) {
				pacienteVO = new PacienteVO();
                                
				pacienteVO.setCodigoPaciente(result.getInt("codidoPaciente"));
				pacienteVO.setNomePaciente(result.getString("nomePaciente"));
				pacienteVO.setCelMensagemPaciente(result.getString("celMensagemPaciente"));
//				pacienteVO.setFoneRes(result.getString(4));
//				pacienteVO.setFoneCom(result.getString(5));
//				pacienteVO.setEmail(result.getString(6));
				pacienteVO.setCpfPaciente(result.getString("cpfPaciente"));
//				pacienteVO.setCnpj(result.getString(8));
//				pacienteVO.setLogradouro(result.getString(9));
//				pacienteVO.setNumLog(result.getString(10));
//				pacienteVO.setComplemento(result.getString(11));
//				pacienteVO.setBairro(result.getString(12));
//				pacienteVO.setCidade(result.getString(13));
//				pacienteVO.setUf(result.getString(14));
//				pacienteVO.setCep(result.getString(15));
				

			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			Banco.closeStatement(prepStmt);
			Banco.closeConnection(conn);
		}
		return pacienteVO;   
    
    }
    
    	public ArrayList<PacienteVO> listarTodosOsPacientes() {

	 ArrayList <PacienteVO> listaDePacientes = new ArrayList<PacienteVO>();	
         PacienteVO pacienteVO = null;
           
         String query = "select * from paciente";
               

		Connection conn = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conn, query);
		try {
			ResultSet result = prepStmt.executeQuery();

			while (result.next()) {
				pacienteVO = new PacienteVO();

				pacienteVO.setCodigoPaciente(result.getInt(1));
				pacienteVO.setNomePaciente(result.getString(2));
				pacienteVO.setCelMensagemPaciente(result.getString(3));
				pacienteVO.setCpfPaciente(result.getString("cpfPaciente"));
						
				listaDePacientes.add(pacienteVO);
			}

		} catch (SQLException e) {
		}
		return listaDePacientes;
	}

        
}
