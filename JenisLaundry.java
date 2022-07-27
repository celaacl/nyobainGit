package ukl2;

import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
 
    public JenisLaundry() {
       this.jenisLaundry.add("seragam");
       this.harga.add(10000);
       this.durasi.add(2);
      
       this.jenisLaundry.add("sprei");
       this.harga.add(50000);
       this.durasi.add(3);
 
       this.jenisLaundry.add("karpet");
       this.harga.add(20000);
       this.durasi.add(1);
 }
    public int getJmlLaundry(){
       return this.jenisLaundry.size();
 }
    public void setJenisLaundry(String jenisLaundry ){
       this.jenisLaundry.add(jenisLaundry);
 }
    public String getJenisLaundry(int idjenisLaundry){
       return this.jenisLaundry.get(idjenisLaundry);
 } 
    public void setDurasi(int durasi ){
       this.durasi.add(durasi);
 }
    public int getDurasi(int durasi){
       return this.durasi.get(durasi);
 } 
   
    public void setHarga(int harga ){
       this.harga.add(harga);
 }
    public int getHarga(int idjenisLaundry){
       return this.harga.get(idjenisLaundry);
 } 
}
