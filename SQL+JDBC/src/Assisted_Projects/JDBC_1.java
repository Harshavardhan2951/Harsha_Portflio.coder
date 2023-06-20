package Assisted_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*Steps Involved in Process is 
 * 1. Importing a Package import java.sql.*;
 * 2.Load and Register the Drivers --> com.sql.jdbc.Driver
 * 3.Establish the Connections --> Connection
 * 4.State a Query
 * 5.Execute  a Query
 * 6.Process Result
 * 7.END Process
 */
public class JDBC_1	 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc_1";
		String uname = "root";
		String pass = "Harsha2001$";
		String query = "SELECT USER_NAME FROM STUDENT WHERE USER_ID = 3;";
		Class.forName("com.mysql.cj.jdbc.Driver"); 	
		/*Create Connection Object*/
		Connection con = DriverManager.getConnection(url, uname, pass);
		/*CREATE  A STATEMENT*/
		Statement st = con.createStatement();
		/*Result Set has the Power to store the data*/
		ResultSet rs = st.executeQuery(query);	
		rs.next();
		String name = rs.getString("USER_NAME");
		System.out.println(name);
		st.close();
		con.close();
	}			
}
