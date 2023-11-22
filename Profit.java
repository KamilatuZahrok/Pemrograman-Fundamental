import java.util.Scanner;
public class Profit {
    public static void main(String arga[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai modal penjual RP ");
        int modal = input.nextInt();

        System.out.println("Masukkan presentase keuntungan = ");
        int persenUntung = input.nextInt();

        int profit = modal + (modal * persenUntung/100);

        System.out.println("Modal penjualan adalah : " + modal);
        System.out.println("Persentase keuntungan penjualan adalah " + persenUntung + "%");
        System.out.println("Profit dari penjualan adalah Rp " + profit);
    }
}
