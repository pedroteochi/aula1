package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	
	public final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public final String DATABASE = "poo";
	public final String URL = "jdbc:sqlserver://localhost:1433;databasename="+DATABASE;
	public final String LOGIN = "usuario";
	public final String SENHA = "fatec";
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			//System.out.println("Driver carregado!");
			con = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("Conectou...");
			return true;
			
		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver não encontrado!");
			return false;
		}
		catch(SQLException erro) {
			System.out.println("Falha na conexão: "+erro);
			return false;
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
		}
		catch(SQLException e) {}
		try {
			if(st!=null) st.close();
		}
		catch(SQLException e) {}
		try {
			if(con!=null) {
				System.out.println("Desconectou...");
				con.close();
			}
		}
		catch(SQLException e) {}
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();
	}
}
