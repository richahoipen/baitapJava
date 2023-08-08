package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connect 
{
	String url = "jdbc:sqlserver://localhost:3000;databaseName=Shopee";
    String username = "siu";
    String password = "messivodichworldcupUCL0981";   
	public Connect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Connection con()
	{
		Connection con=null;
		try 
		{
			con= DriverManager.getConnection(url, username, password);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return con;
	}
}
