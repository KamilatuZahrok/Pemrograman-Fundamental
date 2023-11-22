import java.util.Scanner;
    public class KonversiKodeNegara {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kode negara: ");

            String kodeNegara = input.next();
            String namaNegara = "";

            switch (kodeNegara) {
                case "ES":
                    namaNegara = "Spain";
                    break;
                case "TN":
                    namaNegara = "Tunisia";
                    break;
                case "ID":
                    namaNegara = "Indonesia";
                    break;
                case "MM":
                    namaNegara = "Myanmar";
                    break;
                case "IN":
                    namaNegara = "India";
                    break;
                default:
                    System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                    System.exit(0);
                    break;
            }
            System.out.println("Nama negara: " + namaNegara);
        }
    }
