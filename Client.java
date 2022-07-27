package ukl2;

import java.util.ArrayList;

public class Client implements Laundry {

    
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Celi");
        this.alamat.add("Malang");
        this.telepon.add("081249821843");
        this.saldo.add(50000);

        this.namaClient.add("jeje");
        this.alamat.add("Malang");
        this.telepon.add("08136348299");
        this.saldo.add(70000);

        this.namaClient.add("jojo");
        this.alamat.add("Malang");
        this.telepon.add("08544362826");
        this.saldo.add(100000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

    public int getJm1Client() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
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
    public String getNama(int id) {
        return this.namaClient.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        
       return this.telepon.get(id);
    }
}

