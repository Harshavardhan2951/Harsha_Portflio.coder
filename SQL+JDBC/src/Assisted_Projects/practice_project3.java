package Assisted_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class practice_project3 {
	public static void main(String[] args) throws SQLException {
		String url = "";
		String uname = "";
		String pass = "";
		String query = "";
		Connection Con = DriverManager.getConnection(url, uname, pass);
		Statement st = Con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		System.out.println(qu);
		
	}
}
