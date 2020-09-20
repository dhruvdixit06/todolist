/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author dhruv
 */
public class ConnectionProvider {
      public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","dd123456");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
             
    }
}
