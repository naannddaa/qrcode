package barcode;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Koneksi {
 private static Connection koneksi;
 
  public static Connection getKoneksi(){
       if (koneksi == null){
           try {
               String url = "jdbc:mysql://localhost:3306/triger_db";
               String user = "root";
               String password = "";
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               koneksi = DriverManager.getConnection(url, user, password);
               System.out.println("berhasil");
           } catch (Exception e) {
               System.out.println("gagal");
           }
       }
       return koneksi;
   }
    public static void main(String[] args) {
        getKoneksi();
        
    }
    
}
