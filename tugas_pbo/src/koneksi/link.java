/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Uta
 */
public class link {
    public static Properties Pro;
    public static String var;
    public static String x(String tampung){
        try {
            Pro = new Properties();
            Pro.load(new FileInputStream("src/koneksi/config.ini"));
            var = Pro.getProperty(tampung);
        } catch (Exception e) {
        }
        return var;
    }
}
