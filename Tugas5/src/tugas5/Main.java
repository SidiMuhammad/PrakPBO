package tugas5;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        GUI g = new GUI();
                
    }
}

class GUI extends JFrame implements ActionListener{
    JLabel lpanjang = new JLabel("Panjang");
    JTextField tfpanjang = new JTextField(10);
    JLabel llebar = new JLabel("Lebar");
    JTextField tflebar = new JTextField(10);
    JLabel ltinggi = new JLabel("TInggi");
    JTextField tftinggi = new JTextField(10);
    JLabel lluas = new JLabel("Luas Persegi");
    JLabel lhasil1 = new JLabel(":");
    JLabel lkeliling = new JLabel("Keliling Persegi");
    JLabel lhasil2 = new JLabel(":");
    JLabel lvolume = new JLabel("Volume Balok");
    JLabel lhasil3 = new JLabel(":");
    JLabel lluaspermukaan = new JLabel("Luas Permukaan Balok");
    JLabel lhasil4 = new JLabel(":");
    JButton bhitung = new JButton("HITUNG");
    JButton breset = new JButton("RESET");
    
    public GUI() {
        setTitle("KALKULATOR BALOK");
        setSize(300, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(lpanjang);
        add(tfpanjang);
        add(llebar);
        add(tflebar);
        add(ltinggi);
        add(tftinggi);
        add(lluas);
        add(lhasil1);
        add(lkeliling);
        add(lhasil2);
        add(lvolume);
        add(lhasil3);
        add(lluaspermukaan);
        add(lhasil4);
        add(bhitung);
        add(breset);
        lpanjang.setBounds(10, 10, 80, 20);
        tfpanjang.setBounds(100, 10, 120, 20);
        llebar.setBounds(10, 40, 80, 20);
        tflebar.setBounds(100, 40, 120, 20);
        ltinggi.setBounds(10, 70, 80, 20);
        tftinggi.setBounds(100, 70, 120, 20);
        lluas.setBounds(10, 100, 130, 20);
        lhasil1.setBounds(150, 100, 120, 20);
        lkeliling.setBounds(10, 130, 130, 20);
        lhasil2.setBounds(150, 130, 120, 20);
        lvolume.setBounds(10, 160, 130, 20);
        lhasil3.setBounds(150, 160, 120, 20);
        lluaspermukaan.setBounds(10, 190, 130, 20);
        lhasil4.setBounds(150, 190, 120, 20);
        bhitung.setBounds(10, 220, 100, 20);
        breset.setBounds(120, 220, 100, 20);
        bhitung.addActionListener(this);
        breset.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bhitung) {
            try {
                int panjang = Integer.parseInt(tfpanjang.getText());
                int lebar = Integer.parseInt(tflebar.getText());
                int tinggi = Integer.parseInt(tftinggi.getText());
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);
                lhasil1.setText(": " + String.valueOf(persegiPanjang.luas()));
                lhasil2.setText(": " + String.valueOf(persegiPanjang.keliling()));
                lhasil3.setText(": " + String.valueOf(balok.volume()));
                lhasil4.setText(": " + String.valueOf(balok.luasPermukaan()));
            } catch(NumberFormatException nfexception) {
                JOptionPane.showMessageDialog(null, "NILAI INPUT HARUS DIISI DENGAN ANGKA !");
            }
            
        }
        else if(e.getSource() == breset) {
            tfpanjang.setText("");
            tflebar.setText("");
            tftinggi.setText("");
            lhasil1.setText(":");
            lhasil2.setText(":");
            lhasil3.setText(":");
            lhasil4.setText(":");
        }
    }
}
