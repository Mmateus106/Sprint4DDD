package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		Connection c = null;
		try {
			c = new ConexaoFactory().conexao();
			System.out.println("Conectado com sucesso!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erro no main!");
			e.printStackTrace();
		}finally {
			try {
				c.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		
		
		

	}

	
}