package main;

import java.sql.SQLException;
import java.util.*;
import bean.Bean;
import dao.DAO;
public class MAIN {
	public static void main(String args[])throws ClassNotFoundException, SQLException
	{
		Scanner sc= new Scanner(System.in);
		DAO d = new DAO();
		Bean b = new Bean();
		b.setItemid(12);
		b.setItemname("markers");
		b.setItemcost(20);
		b.setItemid(13);
		b.setItemname("pens");
		b.setItemcost(50);
		System.out.println("Kindly Select one of the following  operations");
		System.out.println("1.Insert\n2.Display\n3.Display Items\n4.Sum of cost of items");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:int i=d.ItemInsert(b);
				   if(i>0)
				   {
					 System.out.println("insertion is succesfull");
				   }
				   else
				   {
					 System.out.println("insertion is failed");
				   }
				   break;
			case 2:d.Display();
		           break;
			case 3:d.ItemDisplay();
			       break;
			case 4:d.TotalCost();
			       break;
			default:System.out.println("Kindly select numbers from 1 to 4");
	                break;
		}
		sc.close();
	}
}
