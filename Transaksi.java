package ukl2;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

        private ArrayList<Integer> idClient = new ArrayList<Integer>();
        private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        public Transaksi() {
            this.idClient.add(0);
            this.idJenisLaundry.add(0);
            this.banyak.add(2);
            
            this.idClient.add(1);
            this.idJenisLaundry.add(1);
            this.banyak.add(2);
            
            this.idClient.add(2);
            this.idJenisLaundry.add(2);
            this.banyak.add(2);
            
        }
           
            public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenislaundry) {
    //  intansiasi
            Scanner myObj = new Scanner(System.in);
            System.out.println("Selamat datang Di Toko Laundry kami, Silahkan Laundry");
    
            System.out.print("Masukkan ID Member : ");
            int idMember = myObj.nextInt();
            System.out.println("Selamat datang " + client.getNama(idMember));
            ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
            ArrayList<Integer> banyak = new ArrayList<Integer>();
            int i = 0;
            int temp = 0;
            do {
                System.out.print("Masukkan kode barang :");
                temp = myObj.nextInt();
                if (temp != 99) {
                    idJenisLaundry.add(temp);
                    System.out.print(jenislaundry.getJenisLaundry(idJenisLaundry.get(i)) + " sebanyak : ");
                    banyak.add(myObj.nextInt());
                    i++;
                }
    
            } while (temp != 99);
    
            System.out.println("Transaksi belanja " + client.getNama(idMember) + " sebagai berikut :");
            System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
    
            int total = 0;
            int x = idJenisLaundry.size();
            for (int j = 0; j < x; j++) {
                int jumlah = banyak.get(j) * jenislaundry.getHarga(idJenisLaundry.get(j));
                total += jumlah;
                System.out.println(jenislaundry.getJenisLaundry(idJenisLaundry.get(j)) + "\t"
                        + banyak.get(j) + "\t"
                        + jenislaundry.getHarga(idJenisLaundry.get(j)) + "\t"
                        + jumlah);
                transaksi.setTransaksi(jenislaundry, idMember, idJenisLaundry.get(j), banyak.get(j));
            }
    
            System.out.println("Total Belanja : " + total);
            client.editSaldo(idMember, client.getSaldo(idMember) - total);
        }
             public void setTransaksi(JenisLaundry jenislaundry, int idMember, int idBarang, int banyak) {
            this.idClient.add(idMember);
            this.idJenisLaundry.add(idBarang);
            this.banyak.add(banyak);
           
        }
    
        public int getIdBarang(int id) {
            return this.idJenisLaundry.get(id);
        }
    
        public int getBanyaknya(int id) {
            return this.banyak.get(id);
        }
    
        public int getIdMember(int id) {
            return this.idClient.get(id);
        }
    
        public int getJmlTransaksi() {
            return this.idClient.size();
        }
    }
    

