import java.util.Scanner;
    public class KonversiNilai {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nilai huruf: ");

            String huruf = input.next();
            double index = 0;
            if (huruf.equals("A")) {
                index = 4.0;
            } else if (huruf.equals("B")) {
                index = 3.0;
            } else if (huruf.equals("C")) {
                index = 2.0;
            } else if (huruf.equals("D")) {
                index = 1.0;
            } else if (huruf.equals("F")) {
                index = 0;
            } else {
                System.out.println("Maaf, konversi nilai tidak diketahui");
                System.exit(0);
            }
            System.out.println("Index: " + index);
        }
    }
