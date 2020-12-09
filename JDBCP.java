import java.sql.*;
import java.lang.*;

class JDBCP
{
public static void main(String arg[])
{
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
try
{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("class loaded successfully");
con=DriverManager.getConnection("jdbc:mysql://localhost:2100/Marvellous","root","root");
System.out.println("connection established");

stmt=con.createStatement();
System.out.println("statement object created successfully");

rs=stmt.executeQuery("select * from Student");
System.out.println("Query executed successfully");
System.out.println("data from student table");

while(rs.next())
{
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}
}

catch(Exception e)
{
System.out.println("exception occurd");
System.out.println(e);
/*System.out.println(e.printStackTrace());*/
}

/*finally
{
rs.close();
stmt.close();
con.close();
}*/
}
}


