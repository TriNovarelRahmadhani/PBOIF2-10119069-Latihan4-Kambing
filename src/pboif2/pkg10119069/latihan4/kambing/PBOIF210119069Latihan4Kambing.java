/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program untuk menambahkan sebuah value
 */
public class PBOIF210119069Latihan4Kambing {
    public void tambahKambing()  {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " +
                            jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119069Latihan4Kambing kambingJantan = new PBOIF210119069Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
