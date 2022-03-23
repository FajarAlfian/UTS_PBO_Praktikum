package data;

import java.util.Scanner;
/**
 *
 * @author fajar
 */
public class LaptopApp {
    public static void main(String[] args) {
        String nama, brand, processor, so, storage;
        int jmlCore, ram, stok;
        
        Scanner nilai = new Scanner(System.in);
        
        System.out.println("PROGRAM INPUT DATA LAPTOP\n");
        
        System.out.println("--> INPUT DATA LAPTOP <--");
        System.out.print("Masukkan Nama Laptop                  : ");
        nama=nilai.nextLine();
        System.out.print("Masukkan Nama Brand Laptop            : ");
        brand=nilai.nextLine();
        System.out.print("Masukkan Nama Processor Laptop        : ");
        processor=nilai.nextLine();
        System.out.print("Masukkan Sistem Operasi yang Tersedia : ");
        so=nilai.nextLine();
        System.out.print("Masukkan Jenis Storage                : ");
        storage=nilai.nextLine();
        System.out.print("Masukkan Jumlah Core pada Processor   : ");
        jmlCore=nilai.nextInt();
        System.out.print("Masukkan Ukuran RAM dalam GB          : ");
        ram=nilai.nextInt();
        System.out.print("Masukkan Stok yang Tersedia           : ");
        stok=nilai.nextInt();
        
        
        var L1 = new Laptop(nama, brand, ram, stok, processor, jmlCore, so, storage);
        
        System.out.println("\n---> DATA LAPTOP LENGKAP 1<---");
        System.out.println("Nama Laptop                : " +L1.getNama());
        System.out.println("Brand Laptop               : " +L1.getBrand());
        System.out.println("Nama Processor             : " +L1.getProcessor());
        System.out.println("Jumlah Core pada Processor : " +L1.getJmlCore());
        System.out.println("Sistem Operasi             : " +L1.getSo());
        System.out.println("Ukuran RAM                 : " +L1.getRam()+ " GB");
        System.out.println("Jenis Storage              : " +L1.getStorage());
        System.out.println("Stok Laptop                : " +L1.getStok()+ " Pcs");
        
        var L2 = new Laptop("ASUS Vivobook A412", "Asus", 8, 
                3, "intel", 3, "Windows 11", "SSD");
        
        System.out.println("\n---> DATA LAPTOP LENGKAP 2<---");
        System.out.println("Nama Laptop                : " +L2.getNama());
        System.out.println("Brand Laptop               : " +L2.getBrand());
        System.out.println("Nama Processor             : " +L2.getProcessor());
        System.out.println("Jumlah Core pada Processor : " +L2.getJmlCore());
        System.out.println("Sistem Operasi             : " +L2.getSo());
        System.out.println("Ukuran RAM                 : " +L2.getRam()+ " GB");
        System.out.println("Jenis Storage              : " +L2.getStorage());
        System.out.println("Stok Laptop                : " +L2.getStok()+ " Pcs");
    }
}
