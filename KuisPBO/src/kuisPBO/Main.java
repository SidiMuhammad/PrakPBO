package kuisPBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("FORM PENDAFTARAN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form: ");
            pilih = input.nextInt();
            input.nextLine();
            if(pilih == 1) {
                Form("ANDROID");
            }
            else if(pilih==2) {
                Form("WEB");
            }
        } while(pilih == 1 || pilih == 2);
    }
    
    public static void Form(String jenisPendaftaran) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("FORM PENDAFTARAN "+jenisPendaftaran+" DEVELOPMENT");
        System.out.print("Input NIK: ");
        String nik = input.nextLine();
        System.out.print("Input Nama: ");
        String nama = input.nextLine();
        System.out.print("Input Nilai Tes Tulis: ");
        int nilaiTulis = input.nextInt();
        System.out.print("Input Nilai Tes Coding: ");
        int nilaiCoding = input.nextInt();
        System.out.print("Input Nilai Tes Wawancara: ");
        int nilaiWawancara = input.nextInt();
        
        if(jenisPendaftaran == "ANDROID") {
            Android formAndroid = new Android(nilaiTulis, nilaiCoding, nilaiWawancara);
            int pilih;
            do{
                System.out.println("");
                System.out.println("MENU");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih Menu: ");
                pilih = input.nextInt();
                input.nextLine();
                if(pilih == 1) {
                    System.out.println("");
                    System.out.println("EDIT NILAI FORM "+jenisPendaftaran+" DEVELOPMENT");
                    System.out.print("Input Nilai Tes Tulis: ");
                    nilaiTulis = input.nextInt();
                    System.out.print("Input Nilai Tes Coding: ");
                    nilaiCoding = input.nextInt();
                    System.out.print("Input Nilai Tes Wawancara: ");
                    nilaiWawancara = input.nextInt();

                    formAndroid.setNilaiTulis(nilaiTulis);
                    formAndroid.setNilaiCoding(nilaiCoding);
                    formAndroid.setNilaiWawancara(nilaiWawancara);
                        }
                else if(pilih == 2) {
                    Hasil(formAndroid.nilaiAkhir(), jenisPendaftaran, nik, nama);
                }
            } while(pilih == 1 || pilih == 2);
        }
        if(jenisPendaftaran == "WEB") {
            Web formWeb = new Web(nilaiTulis, nilaiCoding, nilaiWawancara);
            int pilih;
            do{
                System.out.println("");
                System.out.println("MENU");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih Menu: ");
                pilih = input.nextInt();
                input.nextLine();
                if(pilih == 1) {
                    System.out.println("");
                    System.out.println("EDIT NILAI FORM "+jenisPendaftaran+" DEVELOPMENT");
                    System.out.print("Input Nilai Tes Tulis: ");
                    nilaiTulis = input.nextInt();
                    System.out.print("Input Nilai Tes Coding: ");
                    nilaiCoding = input.nextInt();
                    System.out.print("Input Nilai Tes Wawancara: ");
                    nilaiWawancara = input.nextInt();

                    formWeb.setNilaiTulis(nilaiTulis);
                    formWeb.setNilaiCoding(nilaiCoding);
                    formWeb.setNilaiWawancara(nilaiWawancara);
                        }
                else if(pilih == 2) {
                    Hasil(formWeb.nilaiAkhir(), jenisPendaftaran, nik, nama);
                }
            } while(pilih == 1 || pilih == 2);
        }
    }
    
    public static void Hasil(double nilaiAkhir, String jenisPendaftaran, String nik, String nama) {
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        if(nilaiAkhir >= 85) {
        System.out.println("Keterangan: LULUS");
            System.out.println("Selamat kepada "+nama+" dengan NIK "+nik+" telah diterima pada "+jenisPendaftaran+" Development");
        }
        else {
            System.out.println("Keterangan: GAGAL");
            System.out.println("Mohon maaf kepada "+nama+" dengan NIK "+nik+" telah ditolak pada "+jenisPendaftaran+" Development");
        }
    }
}
