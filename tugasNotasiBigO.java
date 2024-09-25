

public class tugasNotasiBigO {

    
    public static void main(String args[]) {
        
        int bilangan = 5;
        
        int hasil = 0;
        for(int i = 1; i <= bilangan; i++) {
            hasil += bilangan;
        }
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasil);
        
//    1.  Analisis kompleksitas algoritma
//        pada program tersebut menggunakan notasi big O(n)
//        kenapa?, karena input dengan iterasi yang dilakukan adalah sama.
//    2.  Simulasi Perhitungan Data
//        menghitung n^2, untuk n = 1, 2, 3, 4, 5
//        simulasinya:
//        untuk n = 1, maka hasil: 0 + 5 = 5
//        untuk n = 2, maka hasil: 5 + 5 = 10
//        untuk n = 3, maka hasil: 10 + 5 = 15
//        untuk n = 4, maka hasil: 15 + 5 = 20
//        untuk n = 5, maka hasil: 20 + 5 = 25
    }
}
