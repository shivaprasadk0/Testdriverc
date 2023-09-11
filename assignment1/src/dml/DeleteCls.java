package dml;
import java.sql.*;
public class DeleteCls {
public void delete()
{
	


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaprasad","shiva123");
			Statement stmt;
			stmt=con.createStatement();
			ResultSet rs;
			rs=stmt.executeQuery("delete from product_details where pid=103");
			System.out.print("query excueted");
			con.close();



		}
		catch(Exception e)
		{
			System.out.println("error at create class:"+e);
		}

	}
}

