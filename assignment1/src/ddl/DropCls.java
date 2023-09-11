package ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DropCls {
	public void drop()
	{
		

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con;
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaprasad","shiva123");
				Statement stmt;
				stmt=con.createStatement();
				ResultSet rs;
				rs=stmt.executeQuery("drop table product_details");
				System.out.print("query excueted");
				con.close();



			}
			catch(Exception e)
			{
				System.out.println("error at create class:"+e);
			}

		}
}
