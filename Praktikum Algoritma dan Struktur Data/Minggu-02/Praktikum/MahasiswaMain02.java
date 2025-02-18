public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Ardhan Dikri Achmad Fahrudin";                 
        mhs1.nim = "244107020012";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.9;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("TI 1X");
        mhs1.updateIpk(4.0);
        mhs1.tampilInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Gisellma Firmasnyah", "21222792", 3.5, "AN 4Q" );
        mhs2.updateIpk(4.0);
        mhs2.tampilInformasi();
        
        Mahasiswa mhsArdhan = new Mahasiswa("Ardhan Fahrudin", "244107020012", 4.0, "TI-1F");
        mhsArdhan.tampilInformasi();
    }
}
