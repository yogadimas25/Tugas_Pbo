/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author uta
 */
public class koneksi {

    public static Connection nilai;
     
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
   
    public static String user,pass,url;
    
    public static Connection ayokonek() throws SQLException
    {
        user=link.x("user");
        pass=link.x("pass");
        url=link.x("url");
        
        if(nilai==null)
        {
            Driver driver = new Driver();
            nilai=(Connection) DriverManager.getConnection(url,user,pass);
            
        }
        return nilai;
    }
}