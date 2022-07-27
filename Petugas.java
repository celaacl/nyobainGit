package ukl2;

import java.util.ArrayList;

public class Petugas implements Laundry {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList <String>();
    private ArrayList<String> jabatan = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("winwin");
        this.alamat.add("Malang");
        this.telepon.add("081967436786");
        this.jabatan.add("Pemilik toko");
    }
    public void setJabatan(String jabatan){
        this.jabatan.add(jabatan);
    }
    public String getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmPetugas(){
        return this.namaPetugas.size();
      
    }
     @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }
    
}