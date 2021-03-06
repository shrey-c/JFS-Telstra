import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JDBCProductTableDemo {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/telstra";
		
		String username = "root";
		String password = "Abhijeet";
		String createTable = "create table product(productid INT(4),productname VARCHAR(20),price INT(4));";
		String insertCommand = "Insert into product values (1, 'Table', 1000),(2, 'Chair',500);";
		
		int i=0;
		
		Connection cn = null;
		Statement st = null;
		
		try{
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			
			boolean b = st.execute(createTable);
			i = st.executeUpdate(insertCommand);
			
			System.out.println("Successful?: "+(b?"Yes":"No"));
			System.out.println(i+" records added !!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}
