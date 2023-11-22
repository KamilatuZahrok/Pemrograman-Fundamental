import java.util.Scanner;
    public class ScannerPersegiPanjang {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int Panjang;
            int Lebar;
            int Luas;
            int Keliling;
            System.out.println("Masukkan Panjang");
            Panjang = input.nextInt();
            System.out.println("Masukkan Lebar");
            Lebar = input.nextInt();
            Luas = Panjang * Lebar;
            Keliling = (Panjang + Lebar) * 2;
            System.out.println("Luas Persegi Panjang:" + Luas);
            System.out.println("Keliling Persegi Panjang:" + Keliling);
        }
    }
