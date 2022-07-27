package ukl2;

public class Hasil {
    public static void main (String [] args){
    Client c = new Client (); 
    Petugas p = new Petugas (); 
    JenisLaundry j = new JenisLaundry (); 
    Transaksi t = new Transaksi ();
    SLaporan l = new SLaporan ();
    
    l.Laporan(p);
    l.laporan(j);
    l.laporan(c);
    l.laporan(t, j);
    t.prosesTransaksi(c, t, j);
    l.laporan(t, j);
    l.laporan(j);
    l.laporan(c);
}
}