package ukl2;

public class SLaporan {
   
    public void laporan(JenisLaundry barang){ 
        int x=barang.getJmlLaundry();
    

        System.out.println(); 
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi/jam \tHarga"); 
        for (int i = 0; i < x; i++) {
        System.out.println(barang.getJenisLaundry(i)+"\t"+ barang.getDurasi(i)+"\t\t"+barang.getHarga(i));
        }
    }
    public void Laporan (Petugas petugas){
       int x=petugas.getJmPetugas();
 
     System.out.println();
     System.out.println("Petugas");
     System.out.println();
     System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
     for (int i = 0; i < x; i++) {
     System.out.println(petugas.getNama(i)+"\t"+
     petugas.getAlamat(i)+"\t"+petugas.getTelepon(i)+"\t"+
     petugas.getJabatan(i)); 
        }}
            public void laporan(Client member){ 
                int x=member.getJm1Client();

        System.out.println(); 
        System.out.println("Tabel Member"); 
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo"); 
        for (int i = 0; i < x; i++) {
        System.out.println(member.getNama(i)+"\t"+ member.getAlamat(i)+"\t\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
        }
    }
        public void laporan(Transaksi transaksi, JenisLaundry jl){ 
            int x=transaksi.getJmlTransaksi();
            
            System.out.println();
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tQty \tHarga \tJumlah");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyaknya(i)*jl.getHarga(transaksi.getIdBarang(i));
                            total+=jumlah; 
                            
                System.out.println(jl.getJenisLaundry(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+jl.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
            }
           System.out.println("Total Omset ="+total);
            }
            }