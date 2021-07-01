package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerAset {
    ViewAset viewAsett;
    ModelAset modelAsett;

    public ControllerAset(ViewAset viewAset, ModelAset modelAset) {
        this.viewAsett = viewAset;
        this.modelAsett = modelAset;
        
        if (modelAsett.getJumlahData()!=0) {
            String data[][] = modelAsett.readData();
            viewAsett.tabel.setModel((new JTable(data, viewAsett.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewAsett.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = viewAsett.getNama();
                    int jumlah = Integer.parseInt(viewAsett.getJumlah());
                    int harga = Integer.parseInt(viewAsett.getHarga());
                    modelAsett.tambahData(nama, jumlah, harga);

                    String data[][] = modelAsett.readData();
                    viewAsett.tabel.setModel((new JTable(data, viewAsett.namaKolom)).getModel());
                } catch(NumberFormatException nfexception) {
                    JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong");
                }
            }
        });
        
        viewAsett.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = viewAsett.getNama();
                    int jumlah = Integer.parseInt(viewAsett.getJumlah());
                    int harga = Integer.parseInt(viewAsett.getHarga());

                    int input = JOptionPane.showConfirmDialog(null,
                            "Update aset " + nama + "?", "Pilih", JOptionPane.YES_NO_OPTION);

                    if (input == 0) {
                        modelAsett.updateData(nama, jumlah, harga);

                        String data[][] = modelAsett.readData();
                        viewAsett.tabel.setModel((new JTable(data, viewAsett.namaKolom)).getModel());
                    }
                } catch(NumberFormatException nfexception) {
                    JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong");
                }
            }
        });
        
        viewAsett.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = viewAsett.getNama();

                    int input = JOptionPane.showConfirmDialog(null,
                            "Hapus aset " + nama + "?", "Pilih", JOptionPane.YES_NO_OPTION);

                    if (input == 0) {
                        modelAsett.deleteData(nama);

                        String data[][] = modelAsett.readData();
                        viewAsett.tabel.setModel((new JTable(data, viewAsett.namaKolom)).getModel());
                    }
                } catch(NumberFormatException nfexception) {
                    JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong");
                }
            }
        });
        
        viewAsett.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewAsett.tfNama.setText("");
                viewAsett.tfJumlah.setText("");
                viewAsett.tfHarga.setText("");
            }
        });
        
        viewAsett.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewAsett.tabel.getSelectedRow();

                String nama = viewAsett.tabel.getValueAt(baris, 0).toString();
                String jumlah = viewAsett.tabel.getValueAt(baris, 1).toString();
                String harga = viewAsett.tabel.getValueAt(baris, 2).toString();
                
                viewAsett.tfNama.setText(nama);
                viewAsett.tfJumlah.setText(jumlah);
                viewAsett.tfHarga.setText(harga);
            }
        });
    }
    
}
