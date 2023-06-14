
package universitas;


public class MahasiswaBeraksi {
    public static void main(String[] args) {
        String nama = "Alif Ramadhan";
        String npm = "2110010172";
        String prodi = "Teknik Informatika";

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, prodi);

        System.out.println("NPM: " + mahasiswa.getNpm());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Program Studi: " + mahasiswa.getProdi());
    }

}
