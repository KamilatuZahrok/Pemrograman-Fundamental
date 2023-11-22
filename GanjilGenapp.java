import java.util.Scanner;

    public class GanjilGenapp{
        public static void main (String[] args){

            Scanner input = new Scanner(System.in);
            int[] angka = new int[6];
            int jumlah = 0;
            System.out.println("Masukkan Data");
            for(int i = 0; i < angka.length; i++){
                System.out.println("Data ke-" + i + ": ");
                angka[i] = input.nextInt();
            }

            System.out.println("Menampilkan Data");

            for(int i = 0; i < 6; i++) {
                if(angka[i] % 2 == 0){
                    System.out.println(angka[i] + " --> " + "GENAP");
                } else {
                    System.out.println(angka[i] + " --> " + "GANJIL");
                }
            }

            int TotalPenjumlahan = 0;
            for(int i = 0; i < angka.length; i++){
                TotalPenjumlahan += angka[i];
            }
            double RataRata = (double) TotalPenjumlahan / angka.length;
            System.out.println("TOTAL PENJUMLAHAN: " + TotalPenjumlahan);
            System.out.println("RATA-RATA: " + RataRata);
        }
    }
