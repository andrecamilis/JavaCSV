package br.com.TratamentoDados.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;




public class ConnectionFactory {

		public static Connection getConnection() throws Exception{
			//metodo getConnetion
			try {
				Class.forName("com.mysql.jdbc.Driver");
			//conecxão com o DB
				String login ="root";
				String senha = "";
				String url = "jdbc:mysql://localhost:3306/LOJINHA";
				return DriverManager.getConnection(url,login,senha);
			}catch(Exception e ) {
				throw new Exception(e.getMessage());
			}
		}
		public static void main(String[] args) {
			try {
			Connection conn = ConnectionFactory.getConnection();
			JOptionPane.showMessageDialog(null, "Conectado :D");
		}catch(Exception e ) {
			JOptionPane.showMessageDialog(null,"ERROR não foi possivel se conectar com o banco de dados :(" );
			e.printStackTrace();
		}
			}
	}


