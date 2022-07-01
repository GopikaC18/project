package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Registration {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
       Connection con=DriverManager.getConnection("Jdbc:mysql:"+host+":"+port+"/Hospital", "root", "root");
      Statement s=con. createStatement();
      ResultSet rs=s.executeQuery("insert into Registration values('Gopika','Chithra','Gopakumar','2.5','Female'),\r\n"
      		+ "                               ('Anju','Bindhu','Venu','2','Male'),\r\n"
      		+ "                               ('Aanvi','Anjitha','Abhishek','1,7','Female'),\r\n"
      		+ "                               ('Janvi','Anjitha','Abhishek kumar','1.9','Female'),\r\n"
      		+ "                               ('Akhil','Beena','Mahesh','2.1','Male');");
      
      ResultSet rs1=s.executeQuery("update Registration  set ChildWeight=2 where Child='Gopika';");
      ResultSet rs2=s.executeQuery("Delete from Registration where Child='Akhil';");
      ResultSet rs3=s.executeQuery("select * from Registration;");
      ResultSet rs4=s.executeQuery(" Select * from Registration where Child='Aanvi';");
      ResultSet rs5=s.executeQuery(" drop table Registration;");
      
      
      while(rs.next())
      {
      System.out.println(getString(rs));
      System.out.println(getString(rs1));
      System.out.println(getString(rs2));
      System.out.println(getString(rs3));
      System.out.println(getString(rs4));
      System.out.println(getString(rs5));
      
      }
      
	}

	private static char[] getString(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

}
