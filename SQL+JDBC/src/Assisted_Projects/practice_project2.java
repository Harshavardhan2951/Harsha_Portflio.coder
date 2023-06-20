package Assisted_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Demonstrate Connection, Statement, and ResultSet in JDBC*/
public class practice_project2 {
	public static void main(String[] args) throws SQLException {
		/*Link and Register the Drivers*/
		String url = "jdbc:mysql://localhost:3306/jdbc_1";
		String uname = "root";
		String pass = "Harsha2001$";	
		String query = "SELECT USER_NAME FROM STUDENT WHERE USER_ID = 2;";
		/*Establish the Connection*/
		Connection con = DriverManager.getConnection(url, uname, pass);
		/*Create a Statement*/
		Statement st = con.createStatement();
		/*Query the Result*/
		ResultSet rs = st.executeQuery(query);
		rs.next();	
		String name = rs.getString("USER_NAME");
		System.out.println("I am " + name + " Ghost of the Uchiha....");
	}
}
