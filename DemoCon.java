import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

class DemoCon
{
	public static void main(String arg[])throws Exception
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MarvellousInfo?useTimezone=true&serverTimezone=UTC","root","");
			System.out.println("connection establish");
			
			Statement stmt = con.createStatement();
			System.out.println("satement object created sucessfully");
			
			ResultSet rs=stmt.executeQuery("select * from Student");
			System.out.println("Query executed sucessfully");
			
			System.out.println("data from student table");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" ");
				System.out.println(rs.getString(2)+" ");
				System.out.println(rs.getString(3)+" ");
				System.out.println(rs.getString(4)+" ");
				System.out.println(rs.getInt(5)+" ");
			}
			
			rs.close();
			stmt.close();
			con.close();
		
			
		
		}//end of try
		
		catch(Exception e)
		{
			System.out.println("Exception Occured");
			System.out.println(e);
			//System.out.println(e.printStackTrace(e));
		}
	
			
	}
}