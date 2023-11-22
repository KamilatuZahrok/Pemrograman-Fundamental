import java.util.Scanner;

    public class Kasir {
        public static void main (String args[]){
            int item0 = 2500;
            int item1 = 3000;
            int item2 = 4000;
            int item3 = 5000;
            int item4 = 6000;
            Scanner input = new Scanner(System.in);
            System.out.println("Jumlah belanja Item-0");
            int a = input.nextInt();
            System.out.println("Jumlah belanja Item-1");
            int b = input.nextInt();
            System.out.println("Jumlah belanja Item-2");
            int c = input.nextInt();
            System.out.println("Jumlah belanja Item-3");
            int d = input.nextInt();
            System.out.println("Jumlah belanja Item-4");
            int e = input.nextInt();
            int harga0 = a * item0;
            System.out.println("Daftar Belanja dan Harga:");
            System.out.println("Harga barang ke-0 = Rp " + harga0);
            int harga1 = b * item1;
            System.out.println("Harga barang ke-1 = Rp " + harga1);
            int harga2 = c * item2;
            System.out.println("Harga barang ke-2 = Rp " + harga2);
            int harga3 = d * item3;
            System.out.println("Harga barang ke-3 = Rp " + harga3);
            int harga4 = e * item4;
            System.out.println("Harga barang ke-4 = Rp " + harga4);
            int totalItem = a+b+c+d+e;
            System.out.println("TOTAL ITEM BELANJA = " + totalItem);
            int totalBelanja = harga0+harga1+harga2+harga3+harga4;
            System.out.println("TOTAL BELANJA = Rp " + totalBelanja);
        }
    }
