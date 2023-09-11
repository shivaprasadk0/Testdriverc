package dql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectCls {
	public void select()
	{

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaprasad","shiva123");
			Statement stmt;
			stmt=con.createStatement();
			ResultSet rs;
			rs=stmt.executeQuery("select *from product_details");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " +rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));

			con.close();



		}
		catch(Exception e)
		{
			System.out.println("error at select class:"+e);
		}

	}

}
