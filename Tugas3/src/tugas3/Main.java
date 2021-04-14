package tugas3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilih = 1;
        
        do {
            System.out.println("");
            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH  : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("");
                System.out.print("PANJANG : ");
                int panjang = input.nextInt();
                System.out.print("LEBAR   : ");
                int lebar = input.nextInt();
                System.out.print("TINGGI  : ");
                int tinggi = input.nextInt();

                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);
                
                System.out.println("");
                System.out.println("OUTPUT");
                System.out.println("LUAS PERSEGI         : " + persegiPanjang.luas());
                System.out.println("KELILING PERSEGI     : " + persegiPanjang.keliling());
                System.out.println("VOLUME BALOK         : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK : " + balok.luasPermukaan());
            } else if (pilih == 2) {
                System.out.println("");
                System.out.print("JARI JARI : ");
                int jari = input.nextInt();
                System.out.print("TINGGI    : ");
                int tinggi = input.nextInt();

                Lingkaran lingkaran = new Lingkaran(jari);
                Kerucut kerucut = new Kerucut(jari, tinggi);
                
                System.out.println("");
                System.out.println("OUTPUT");
                System.out.println("LUAS PERSEGI           : " + lingkaran.luas());
                System.out.println("KELILING PERSEGI       : " + lingkaran.keliling());
                System.out.println("VOLUME KERUCUT         : " + kerucut.volume());
                System.out.println("LUAS PERMUKAAN KERUCUT : " + kerucut.luasPermukaan());
            } else {
                System.exit(0);
            }
        } while (pilih == 1 || pilih == 2);
    }
    
}
