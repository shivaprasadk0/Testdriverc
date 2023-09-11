import ddl.*;
import dml.*;
import dql.*;
import java.util.*;
public class driverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int ch;
do {
System.out.println("select any one of the following options\n");
System.out.println("1.DDL\n");
System.out.println("2.DML\n");
System.out.println("3.DQL\n");
System.out.println("4.exit");
Scanner s=new Scanner(System.in);
 ch=s.nextInt();
 
{
if(ch==1)

{
	int ch1;
	do {
	System.out.println("\nplease select one  of the following DDL commands\n");
	System.out.println("1.create\n");

	System.out.println("2.alter\n");

	System.out.println("3.drop\n");

	System.out.println("4.truncate\n");

	System.out.println("5.go to main menu");

ch1=s.nextInt();
	
	switch(ch1) {
	case 1:CreateCls c;
	       c=new CreateCls();
     c.create();
	       break;
	       
	case 2: AlterCls a;
		   a=new AlterCls();
		   a.alter();
	      break;
	case 3: DropCls d;
	        d=new DropCls();
	        d.drop();
	        break;
	        
	        
	case 4:TruncateCls t;
	       t=new TruncateCls();
	       t.truncate();
	       break;
	case 5: break;
	
  default:	
	  System.out.println(" invalid input,please select valid input\n ");
	 
	}

}while(ch1!=5);
}
else if(ch==2)
{
	int ch2;
	do {
		
	
	System.out.println("\nplease select one  of the following DML commands\n");
	System.out.println("1.insert\n");

	System.out.println("2.update\n");

	System.out.println("3.delete\n");


	System.out.println("4.go to main menu");
		 ch2=s.nextInt();
		
		switch(ch2) {
		case 1:InsertCls i=new InsertCls();
		        i.insert();
		       break;
		case 2: UpdateCls u=new UpdateCls();
		        u.update();
		       break;
		case 3: DeleteCls d1=new DeleteCls();
		        d1.delete();
		        break;
		case 4:break;
		
		   default:	  System.out.println(" invalid input,please select valid input \n");
		
		}
}while(ch2!=4);
}
else if(ch==3)
 {
	int ch3;
 
	do {
			   System.out.println("please select the following DQL command\n");
				System.out.println("1.select\n");
				System.out.println("2.go to main menu");
				 ch3=s.nextInt();
				switch(ch3)
				{
				
				case 1:SelectCls s1=new SelectCls();
				        s1.select();
				        break;
				case 2:   System.out.println(" go to main menu"); 
				          break;
				  default:      
					  System.out.println(" invalid input,please select valid input \n");
				
				}			

		   }while(ch3!=2);
 }
else if(ch==4)
{
	System.out.println(" thank u visit again\n");

}





else
{
	   System.out.println(" invalid input ,please select valid input \n");
}				
	
	
	}

	}while(ch!=4);
	}
}


