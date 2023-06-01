
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CekKoneksi {

    static Connection conn = null;
    static final String url = "jdbc:mysql://localhost:3306/data_mahasiswa" ;
    static final String username = "root" ;
    static final String pass = "" ;
    
    
    public static void main (String[]args){
        
            
    try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    conn = DriverManager.getConnection(url, username, pass);
    
    JOptionPane.showMessageDialog(null, "Koneksi database berhasil!");
    
  }catch (SQLException e) {
      
      JOptionPane.showMessageDialog(null, "Koneksi database gagal!");
       e.printStackTrace();
      
  }catch (ClassNotFoundException e) {
      
      JOptionPane.showConfirmDialog(null, "Driver tidak ditemukan!");
       e.printStackTrace();
      
  } finally {
        
        try {
            
            if(conn == null) {
                
                conn.close();
                
            }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
        
        
    }
            
    
    }
    
 

}
