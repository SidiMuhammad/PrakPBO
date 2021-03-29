package tugas1;

public class Mahasiswa {
    String nama, nim;
    int usia, uts, uas;

    public Mahasiswa(String nama, String nim, int usia, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    public int nilaiAkhir(){
        return (uts+uas)/2;
    }
    
    public void output() {
        System.out.println("Perkenalkan nama saya " + nama + ", NIM " + nim + ",");
        System.out.println("Usia        : " + usia);
        System.out.println("Nilai Akhir : " + nilaiAkhir());
        System.out.println("");
    }
}
