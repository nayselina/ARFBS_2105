package ARFBS_Connection;
import java.sql.*;

import javax.swing.JOptionPane;
public class Connection_ARFBS {
  
	
		private static Connection connection;
		private static Connection_ARFBS db;
		public Connection_ARFBS() 
		{
		    new JOptionPane();
		    
			connection = null;
			try
			{
			connection = DriverManager.getConnection
	        (
	            "jdbc:mysql://localhost:3306/arfbs_db", 
	            "admin", 
	            "admin"
	            
	        );
			
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Connection Error"+ e.getMessage());
			}
			
		}
		
		public static Connection_ARFBS getDbConnection()
		{
			if(db == null)
			{
				db = new Connection_ARFBS();
			}
			return db;
		}
		public Connection getConnection()
		{
			return connection;
		}
	
	
}

