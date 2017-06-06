package Com.Project.Tracko;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCclass 
{
	 String name=null;
	 String email;
	public String jdbc () 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
			Statement smt=con.createStatement();
			
			ResultSet rs=smt.executeQuery("select * from customers where customerName like'%Signal gift%';");
			
			while(rs.next())
			{
				name =rs.getString("customerName");
				email=rs.getString("phone");
				System.out.println(name+""+email);
			}
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
		
	}


		
	
	
	

}
