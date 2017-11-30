/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Util.JdbcDBUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pessoa;

/**
 *
 * @author gui_m
 */
public class PessoaPersistencia implements IPessoa{
    
    private PreparedStatement ps;
	private ResultSet rs;

    public void cadastraPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO SPESSOA (CPF, NOME, SOBRENOME, EMAIL, TELEFONE , CIDADE) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        ps.setInt(1, pessoa.getCpf());
			ps.setString(2, pessoa.getNome());
			ps.setString(3, pessoa.getSobrenome());
			ps.setString(4, pessoa.getEmail());
			ps.setString(5, pessoa.getTelefone());
                        ps.setInt(6, pessoa.getCidade());
			ps.execute();

//			rs = ps.getGeneratedKeys();
//			rs.next();
//			int id = rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}}

    @Override
    public void editaPessoa(Pessoa ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   public Pessoa pesquisaPessoa(int cpf){
       String sql = "SELECT * FROM PESSOA WHERE\n" +
        "CPF = ?";
       
       //Pessoa pessoa = new Pessoa();
       
       try{
            ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
            rs = ps.executeQuery();
            int cpf2 = rs.getInt(1);
            String nome = rs.getString(2);
            String sobrenome = rs.getString(3);
            String telefone = rs.getString(4);
            String email = rs.getString(5);
            int cidade = rs.getInt(6);
            
            Pessoa pessoa = new Pessoa(cpf2, nome, sobrenome, telefone, email, cidade);
            return pessoa; 
       }
       catch(SQLException e){
           System.out.println("Erro no SQL!!!");
       }
       //Pessoa pessoa = new Pessoa(cpf2, nome, sobrenome, telefone, email, cidade);
       return null;    
    }

    @Override
    public Pessoa pesquisaPessoaNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
