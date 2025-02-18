public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa02 mhs1 = new Mahasiswa02();

        mhs1.nama = "Ardhan Dikri Achmad Fahrudin";                 
        mhs1.nim = "244107020012";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.9;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("TI 1X");
        mhs1.updateIpk(4.0);
        mhs1.tampilInformasi();

        Mahasiswa02 mhs2 = new Mahasiswa02("Gisellma Firmasnyah", "21222792", 3.5, "AN 4Q" );
        mhs2.updateIpk(4.0);
        mhs2.tampilInformasi();
        
        Mahasiswa02 mhsArdhan = new Mahasiswa02("Ardhan Fahrudin", "244107020012", 4.0, "TI-1F");
        mhsArdhan.tampilInformasi();
    }
}
