package Model;
import java.sql.*;
import com.mysql.*;

public class JDBCExample {
public static void main(String[] args) throws SQLException
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakash","root","prks52ms");
	//String sql="insert into prks(age, name, designation)values(26, 'Periya', 'Amma');";
	//String sql1="insert into prks(age, name, designation)values(25, 'Velan', 'ma');";
	String sql="insert into prks values(25, 'Velnkni','ma');";
	PreparedStatement st = con.prepareStatement(sql);
	//PreparedStatement st1 = con.prepareStatement(sql1);
	//String sql="insert into prks()values();";
	
	int rowsdeleted=st.executeUpdate();
	//int rs1=st1.executeUpdate();
	System.out.println(rowsdeleted);
		/*while(rs.next())
		{
			//int age=rs.getInt("age");
			String name=rs.getString("name");
			
			
			//System.out.println("Age is :"+age);
			System.out.println("Name is :"+name);
		}*/
		con.close();
	}catch(Exception e)	
	{
		e.printStackTrace();
	}
	}
}
