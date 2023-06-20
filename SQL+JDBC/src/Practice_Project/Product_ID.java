package Practice_Project;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product_ID {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/retrive";
        String username = "root";
        String password = "Harsha2001$";
        String query ="SELECT * FROM PRODUCTS WHERE PRODUCT_ID = 3;";
 
        Connection Con = DriverManager.getConnection(jdbcUrl, username, password);
        Statement st = Con.createStatement();
        ResultSet rs = st.executeQuery(query);
            
        while (rs.next()) {
            String productName = rs.getString("USER_NAME");
            double productPrice = rs.getDouble("COST");
                
            System.out.println("Product Name: " + productName);
            System.out.println("Product Cost: " +"\u20B9 "+ productPrice );
        }
            
        rs.close();
        st.close();
        Con.close();
    }
}
