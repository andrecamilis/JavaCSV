package br.com.TratamentoDados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.TratamentoDados.teste.Produto;
import br.com.TratamentoDados.util.ConnectionFactory;

public class ProdutoDAO {

	private static ProdutoDAO proddao;
	private Produto produto;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public static synchronized ProdutoDAO getInstance() throws Exception {

		if (proddao == null) {
			proddao = new ProdutoDAO();
		}
		return proddao;

	}

	public ProdutoDAO() throws Exception {

		try {
			conn = ConnectionFactory.getConnection();

		} catch (Exception e) {
			throw new Exception("Erro" + e.getMessage());
		}

	}
	
	public void registro(Produto produto) throws Exception{
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "INSERT INTO ESTOQUE (NOME, PRECO, QUANTIDADE) VALUES (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, produto.getName());
			ps.setDouble(2, produto.getPrice());
			ps.setInt(3, produto.getQuantity());
			ps.executeUpdate();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erro ao registrar os dados " + e.getMessage());
		}
		
		
	}  
	
	public void consultar() throws Exception {
		try {
			
			String query = "SELECT * FROM LOJA WHERE NOME = ?";
			PreparedStatement pss = conn.prepareStatement(query);
			pss.setString(1, produto.getName());
			rs = ps.executeQuery();
			
			while(rs.next()){
				String nome = rs.getString("NOME");
				
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

	
	
}
