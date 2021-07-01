package responsi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewAset extends JFrame {
    JLabel lNama = new JLabel("Nama Aset");
    JLabel lJumlah = new JLabel("Jumlah");
    JLabel lHarga = new JLabel("Harga");
    
    JTextField tfNama = new JTextField();
    JTextField tfJumlah = new JTextField();
    JTextField tfHarga = new JTextField();
    
    JButton btnTambah = new JButton("Tambah");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnClear = new JButton("Clear");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nama Aset", "Jumlah", "Harga", "Nilai"};

    public ViewAset() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Aset");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 380);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 400, 300);
        
        add(lNama);
        lNama.setBounds(440, 20, 90, 20);
        add(tfNama);
        tfNama.setBounds(440, 40, 120, 20);
        
        add(lJumlah);
        lJumlah.setBounds(440, 60, 90, 20);
        add(tfJumlah);
        tfJumlah.setBounds(440, 80, 120, 20);
        
        add(lHarga);
        lHarga.setBounds(440, 100, 90, 20);
        add(tfHarga);
        tfHarga.setBounds(440, 120, 120, 20);
        
        add(btnTambah);
        btnTambah.setBounds(440, 190, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(440, 220, 90, 20);
        
        add(btnDelete);
        btnDelete.setBounds(440, 250, 90, 20);
        
        add(btnClear);
        btnClear.setBounds(440, 280, 90, 20);
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getJumlah(){
        return tfJumlah.getText();
    }
    
    public String getHarga(){
        return tfHarga.getText();
    }
    
}
