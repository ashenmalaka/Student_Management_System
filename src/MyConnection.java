
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashen Malaka
 */
public class MyConnection {
    
    public static Connection getConnection(){
       
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        
        return connection;
    }
}
