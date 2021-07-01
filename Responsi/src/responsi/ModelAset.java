package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelAset {
    static final String DB_URL = "jdbc:mysql://localhost/aset_db";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    public ModelAset() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            statement = koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String[][] readData(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getJumlahData()][4]; //baris, kolom nya ada 4
            
            String query = "Select * from aset"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("nama_aset"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("jumlah_aset");                
                data[jmlData][2] = resultSet.getString("harga_aset");
                data[jmlData][3] = resultSet.getString("nilai_aset");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getJumlahData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from aset";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void tambahData(String nama, int jumlah, int harga) {
        int jmlData=0;
        try {
           String query = "Select * from aset WHERE nama_aset='" + nama + "'"; 
           System.out.println(nama + " " + jumlah + " " + harga);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {
                query = "INSERT INTO aset VALUES('"+nama+"','"+jumlah+"','"+harga+"','"+jumlah*harga+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateData(String nama, int jumlah, int harga) {
        int jmlData=0;
        try {
           String query = "Select * from aset WHERE nama_aset='" + nama + "'"; 
           System.out.println(nama + " " + jumlah + " " + harga);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==1) {
                query = "UPDATE aset SET jumlah_aset=" + jumlah + ", harga_aset=" + harga + ", nilai_aset=" + jumlah*harga + " WHERE nama_aset = '" + nama + "'";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data tidak ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void deleteData (String nama) {
        try{
            String query = "DELETE FROM aset WHERE nama_aset = '" + nama + "'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
}
