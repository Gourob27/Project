/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hallseat;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Aristo_NPC
 */
public class ConnectionProvider {
    

    public static Connection getCon() {
        Connection getCon=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
              getCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/nature","root","");
            //return con;
            System.out.println("Connceted");
        }
        catch(Exception e)
        {
        //return null;
            JOptionPane.showMessageDialog(null,e);
         
        }
        return getCon;
///localhost:3306
/// ?zeroDateTimeBehavior=CONVERT_TO_NULL
    }

}
