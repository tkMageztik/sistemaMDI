package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

public class MysqlConnection {
	
	static {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection obtenerConexion(){
		
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/SUMIT", 
					"root", 
					"899833245");
			
		}catch (MySQLSyntaxErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); System.out.println("La base de datos no existe o esta mal escrita");
		}catch (Exception e) {
			// TODO: handle exception
		}
		return cn;
		
	}
}
