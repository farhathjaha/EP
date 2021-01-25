package main;
import insert.StudentInsertion;
import java.sql.SQLException;
import bean.StudentBean;
import java.util.*;

public class StudentMain {
	public static void main(String args[]) throws ClassNotFoundException,SQLException{
	    Scanner s=new Scanner(System.in);
		StudentInsertion si=new StudentInsertion();
		StudentBean sb=new StudentBean();
		sb.setRegno(190031491);
		sb.setName("SHAIK FARHATH JAHA");
		sb.setEmail("fj@gmail.com");
		sb.setRegno(190031490);
		sb.setName("SHAIK  JAHA");
		sb.setEmail("j@gmail.com");
		System.out.println("Select crud operation");
		int op=s.nextInt();
		switch(op)
		{
			case 1:int i=si.StudentInsert(sb);
				   if(i>0)
				   {
					 System.out.println("insertion is succesfull");
				   }
				   else
				   {
					 System.out.println("insertion is failed");
				   }
			case 2:int j=si.StudentDelete();
				   if(j>0)
					System.out.println("deleted");
				   else
					System.out.println("not deleted");
			case 3:int k=si.StudentUpdate();
				   if(k>0)
					System.out.println("updated");
				   else
					System.out.println("not updated");
			case 4:si.StudentDisplay();
			       break;
		}
		s.close();
		
	}
	
	

}