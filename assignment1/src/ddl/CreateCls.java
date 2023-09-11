package ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateCls {
	public void create()
	{
		

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con;
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaprasad","shiva123");
				Statement stmt;
				stmt=con.createStatement();
				ResultSet rs;
				rs=stmt.executeQuery("create table product_details(pid number(10),pname varchar(13),price number(10),mfg_date date,exp_date date,remarks varchar(10))");
				System.out.print("\nquery excueted");
				con.close();



			}
			catch(Exception e)
			{
				System.out.println("error at create class:"+e);
			}

		}
	}





