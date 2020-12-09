package jdbcsample;

import java.lang.*;
import java.util.*;
import java.sql.*;

public class jdbcmain {
	public static void main(String args[])throws ClassNotFoundException, SQLException
	{
		//1] load the driver
		Class.forName(com.mysql.jdbc.Driver);
		
		//2] create coneection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
        
        //3] create statement
        Statement stmt=con.CreateStatement();
        
        //4] execute stmt
        stmt.execute();
        
        //5]close connection
        con.close();
        
	}

}
