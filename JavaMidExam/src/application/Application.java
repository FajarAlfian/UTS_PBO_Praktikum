package application;


import data.*;
import java.util.Scanner;
/**
 *
 * @author fajar
 */
public class Application {
    public static void main(String[] args) {
        String nama, brand, processor, so, storage;
        int jmlCore, ram, stok;
        double ukLayar;
       
        var input = new Scanner(System.in);
        

        System.out.println("PROGRAM INPUT DATA LAPTOP\n");
        
        var asus = new Asus();
        
        System.out.println("------------> INPUT DATA LAPTOP ASUS<---------");
        System.out.print("Masukkan Nama Laptop                  : ");
        nama=input.nextLine();
        System.out.print("Masukkan Nama Processor Laptop        : ");
        processor=input.nextLine();
        System.out.print("Masukkan Sistem Operasi yang Tersedia : ");
        so=input.nextLine();
        System.out.print("Masukkan Jenis Storage                : ");
        storage=input.nextLine();
        System.out.print("Masukkan Jumlah Core pada Processor   : ");
        jmlCore=input.nextInt();
        System.out.print("Masukkan Ukuran RAM dalam GB          : ");
        ram=input.nextInt();
        System.out.print("Masukkan Stok yang Tersedia           : ");
        stok=input.nextInt();
        System.out.print("Maukkan Ukuran Layar Laptop           : ");
        ukLayar=input.nextDouble();
        
        asus.setNama(nama);
        asus.setProcessor(processor);
        asus.setSo(so);
        asus.setStorage(storage);
        asus.setUkLayar(ukLayar);
        System.out.println(asus);
        
        
        var apple = new Apple();
         
        System.out.println("\n------------> INPUT DATA LAPTOP APPLE<---------");
        System.out.print("Masukkan Nama Laptop                  : ");
        nama=input.nextLine();input.nextLine();
        System.out.print("Masukkan Nama Processor Laptop        : ");
        processor=input.nextLine();
        System.out.print("Masukkan Sistem Operasi yang Tersedia : ");
        so=input.nextLine();
        System.out.print("Masukkan Jenis Storage                : ");
        storage=input.nextLine();
        System.out.print("Masukkan Jumlah Core pada Processor   : ");
        jmlCore=input.nextInt();
        System.out.print("Masukkan Ukuran RAM dalam GB          : ");
        ram=input.nextInt();
        System.out.print("Masukkan Stok yang Tersedia           : ");
        stok=input.nextInt();
        System.out.print("Maukkan Ukuran Layar Laptop           : ");
        ukLayar=input.nextDouble();
        
        apple.setNama(nama);
        apple.setProcessor(processor);
        apple.setSo(so);
        apple.setStorage(storage);
        apple.setUkLayar(ukLayar);
        System.out.println(apple);
    }
}