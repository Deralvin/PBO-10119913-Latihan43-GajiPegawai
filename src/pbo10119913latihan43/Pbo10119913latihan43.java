/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan43;

/**
 *
 @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class Pbo10119913latihan43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai pgw = new GajiPegawai();
        String nama, alamat;
        int uangTransport, uangTunjangan, gajiPokok, totalGaji;

        System.out.println("###Data Gaji Karyawan PT. KAKATU###");
        System.out.println("-----------------------------------");

        pgw.setNama("Rizki Adam Kurniawan");
        pgw.setAlamat("Jalan Semar dlm 4 No 72/66");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);

        nama = pgw.getNama();
        alamat = pgw.getAlamat();
        uangTransport = pgw.getUangTransport();
        uangTunjangan = pgw.getUangTunjangan();
        gajiPokok = pgw.getGajiPokok();
        totalGaji = pgw.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        pgw.tampilData(nama,alamat,uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
    
}
