package testjdbc;

import java.sql.*;
import java.lang.*;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			//1)load the Driver (name)
			Class.forName("com.mysql.jdbc.Driver");
			
			//2)Create Connection (path db)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			//3)Create Stmt
			String sql="Create table Candidate (id int,name varchar(20))";
			Statement stmt= con.createStatement();
			
			//4)eXECUTE STMT
			stmt.execute(sql);
			System.out.println("Table Created Succesfully");
			
			//5)Close COnnection
			con.close();
			
			
			
		}

}

