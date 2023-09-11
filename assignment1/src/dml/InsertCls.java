package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertCls {
	public void insert()
	{

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaprasad","shiva123");
			Statement stmt;
			stmt=con.createStatement();
			ResultSet rs;
			rs=stmt.executeQuery("INSERT INTO product_details VALUES(101,'soap',45,TO_DATE('2023-09-01','yyyy-mm-dd'),TO_DATE('2025-12-31','yyyy-mm-dd'),'noremarks')");
			System.out.print("query excueted");
			con.close();



		}
		catch(Exception e)
		{
			System.out.println("error at insert class:"+e);
		}

	}
}
