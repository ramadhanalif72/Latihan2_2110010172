
package universitas;


public class Mahasiswa {
    private String npm,nama,prodi;
    
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    public static void main(String[] args) {
        Mahasiswa M = new Mahasiswa("21100010172", "Mochmmad Alif Ramadhan", "Teknik Informastika");
    }
             
}
