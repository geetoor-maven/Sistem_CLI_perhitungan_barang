
package Final_sls;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplikasi {

   
    public static void main(String[] args) {
        System.out.println("--------------------------- SISTEM PERSEDIAAN BARANG ---------------------------");
        int pilihan;
        boolean kondisi = false;
        
        Integer kode_barang;
        String nama_barang;
        Integer jenis_barang;
        Integer stok_barang;
        Integer harga_barang;
        
        
        Scanner input = new Scanner(System.in);
        ArrayList<Array> Barang = new ArrayList<Array>();
      
        
        while(kondisi == false)
        {
             System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Data Barang : ");
            System.out.println("2. Tampil Data Barang : ");
            System.out.println("3. Hapus Data Barang : ");
            System.out.println("4. Cari Data Mahasiswa : ");
            System.out.println("5. Hitung total Stok Barang Berdasarkan Jenisnya : ");
            System.out.println("6. Keluar ");
             System.out.print("Masukan Menu Pilihan[1,2,3,4,5,6] : ");
             pilihan = input.nextInt();
             
             switch(pilihan){
                 
                 case 1:{
                     System.out.println("--------------------------- INPUT DATA BARANG---------------------------");
                     System.out.println("Input Data Barang");
                     int jawaban = 1;
                     
                     while(jawaban == 1){
                        Array objek1 = new  Array(1,"Nama_barang","lempar_jenis",2,3,5000);
                        
                         System.out.print("Masukkan Kode Barang : ");
                         kode_barang = input.nextInt();
                         objek1.setKode_barang(kode_barang);
                         System.out.print("Masukan Nama Barang : ");
                         nama_barang = input.next();
                         objek1.setNama_barang(nama_barang);
                         System.out.print("Masukkan Jenis Barang [1]Sabun mandi [2]Sabun muka [3]Pewangi pakaian : ");
                         jenis_barang = input.nextInt();
                         if(jenis_barang == 1){
                             objek1.setLempar_jenis("Sabun mandi");
                         }else if(jenis_barang == 2){
                             objek1.setLempar_jenis("Sabun muka");
                         }else if(jenis_barang == 3){
                             objek1.setLempar_jenis("Pewangi pakaian");
                         }
                         objek1.setJenis_barang(jenis_barang);
                         System.out.print("Masukan Stok Barang : ");
                         stok_barang = input.nextInt();
                         objek1.setStok_barang(stok_barang);
                         System.out.print("Masukan Harga barang : ");
                         harga_barang = input.nextInt();
                         objek1.setHarga_barang(harga_barang);
                         
                         Barang.add(objek1);
                         System.out.println("-----------------------------------------------------------------");
                         System.out.print("Menginput Barang lagi [1] Ya [2] Tidak  : ");
                         pilihan=input.nextInt(); 
                         if(pilihan==2){
                              System.out.println("-----------------------------------------------------------------");
                             break;
                             
                         }
                             System.out.println("-----------------------------------------------------------------");
                     }
                     break;
                 }
                 case 2 :{
                        System.out.println("---------------- TAMPILKAN DATA BARANG --------------------");
                        
                        for(int i =0; i<Barang.size(); i++){
                               System.out.println("Barang ke-"+(i+1));
                               System.out.print("Kode Barang = "+Barang.get(i).getKode_barang());
                               System.out.print("   Nama Barang = "+Barang.get(i).getNama_barang());
                               System.out.print("   Jenis Barang = "+Barang.get(i).getLempar_jenis());
                               System.out.print("   Stok Barang = "+Barang.get(i).getStok_barang());
                               System.out.println("   Harga Barang = "+Barang.get(i).getHarga_barang());
                               
                        }
                        
                        System.out.println("-----------------------------------------------------------------");
                        break;
                 }
                 case 3:{
                     Integer kodebarang;
                     int hapus,i;
                     System.out.println("---------------- HAPUS DATA BARANG --------------------");
                     System.out.print("Masukan Kode Barang Yang Ingin Dihapus : ");
                     kodebarang = input.nextInt();
                     System.out.print("Apakah betul anda ingin menghapus kode barang "+kodebarang+" [1]ya [2] tidak : ");
                     hapus = input.nextInt();
                     if(hapus == 2){
                         break;
                     }
                     boolean hasil = Barang.contains(kodebarang);
                     for(i=0; i<Barang.size(); i++){
                         if(Barang.get(i).getKode_barang().equals(kodebarang)){
                             Barang.remove(Barang.get(i));
                             System.out.println("Berhasil Menghapus Kode barang : "+kodebarang+" dengan indeks ke : "+(i+1));
                             System.out.println("-----------------------------------------------------------------");
                         }
                         if(hasil = false){
                             System.out.println("Data kode barang tidak di temukan ");
                         }
                     }
                     break;
                     
                 }
                 case 4:{
                     System.out.println("---------------- CARI DATA BARANG --------------------");
                     String carinamabarang;
                     int i;
                     System.out.print("Masukan nama barang yang ingin di cari : ");
                     carinamabarang = input.next();
                     System.out.println("-----------------------------------------------------------------");
                     
                     boolean hasil = Barang.contains(carinamabarang);
                     if (hasil=true) {
                         for(i=0; i<Barang.size();i++){
                             if(Barang.get(i).getNama_barang().equals(carinamabarang)){
                                 System.out.println("Data nama barang : "+carinamabarang+" di temukan pada indeks ke : "+(i+1));
                                 System.out.println("-----------------------------------------------------------------");
                             }
                         }
                     }else{
                         System.out.println("Data nama barang : "+carinamabarang+" tidak di temukan");
                     }
                     
                     break;
                 }
                 case 5:{
                      System.out.println("---------------- MENU HITUNG STOK BERDASARKAN JENIS BARANG  --------------------");
                      Integer carijenisbarang;
                      Integer hasill = null;
                      int i;
                       System.out.print("Masukkan Jenis Barang yang ingin di cari [1]Sabun mandi [2]Sabun muka [3]Pewangi pakaian : ");
                       carijenisbarang = input.nextInt();
                       boolean hasil = Barang.contains(carijenisbarang);
                       
                       if (hasil = true) {
                         for(i=0; i<Barang.size();i++){
                             if(Barang.get(i).getJenis_barang().equals(carijenisbarang)){
                                 hasill =  Barang.get(i).getStok_barang();
                           
                             }
                              System.out.println("Total stok barang dengan jenis : "+Barang.get(i).getLempar_jenis()+" Adalah : "+(hasill+hasill));      
                                System.out.println("-----------------------------------------------------------------");
                                break;
                         }
                     }
                       break;
                 }
                 case 6:{
                     kondisi = true;
                     System.out.println("--------------- TERIMA KASIH ------------------");
                     System.out.println("------- develop by : agus kurniawan --------");
                 }
                 default:
                     System.out.println("---- menu inputan tidak ada ----------------- ");
                 
             }
        }
    }
    
}
