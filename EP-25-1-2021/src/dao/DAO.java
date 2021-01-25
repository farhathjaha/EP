package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import bean.Bean;
import DBUtil.DBUtil;

public class DAO {
	Scanner sc= new Scanner(System.in);
	public int ItemInsert(Bean item) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();
		String sql="insert into Item values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,item.getItemid() );
		ps.setString(2, item.getItemname());
		ps.setInt(3, item.getItemcost());
		int i=ps.executeUpdate();
		return i;
	}
	public void Display() throws ClassNotFoundException,SQLException{
		System.out.println("The details of item are:");
		Connection con=DBUtil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("Select * from Item");
		ResultSet res=stmt.executeQuery();
		System.out.println("Item_ID\tItem_Name\tItem_Cost");
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3));
		}
		
		con.close();
		
	}
	public void ItemDisplay() throws ClassNotFoundException,SQLException{
		System.out.println("The items that are bought:");
		Connection con=DBUtil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("Select itemname from Item");
		ResultSet res=stmt.executeQuery();
		System.out.println("Item_Name");
		while(res.next())
		{
			System.out.println(res.getString(1));
		}
		
		con.close();
		
	}
	public void TotalCost() throws ClassNotFoundException,SQLException{
		System.out.println("The total cost of  items that are bought:");
		Connection con=DBUtil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("Select SUM(itemcost) from Item");
		ResultSet res=stmt.executeQuery();
		System.out.println("Total Cost Of Items");
		while(res.next())
		{
			System.out.println(res.getInt(1));
		}
		
		con.close();
	}

}