package tugas1;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        int usia, uts, uas, pilih;
        Main a = new Main();
        System.out.println("--INPUT DATA--");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM  : ");
        nim = input.nextLine();
        System.out.print("Usia : ");
        usia = input.nextInt();
        System.out.print("UTS  : ");
        uts = input.nextInt();
        System.out.print("UAS  : ");
        uas = input.nextInt();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa(nama, nim, usia, uts, uas);
        do {
            System.out.println("--OPSI--");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            System.out.println("");
            
            if (pilih == 1) {
                mhs.output();
            }
            else if (pilih == 2) {
                main(null);
            }
            else {
                System.exit(0);
            }
        }
        while (pilih == 1 || pilih == 2);
    }
}
