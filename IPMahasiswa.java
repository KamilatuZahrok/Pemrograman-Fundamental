public class IPMahasiswa {
        public static void main(String[] args) {
            int sksSQ = 2;
            int sksKalkulus = 3;
            int sksTTKI = 2;
            int sksSistemDigital = 3;
            int TotalSKS = sksSQ + sksKalkulus + sksTTKI + sksSistemDigital;
            double nilaiSQ = 4;
            double nilaiKalkulus = 2.5;
            double nilaiTTKI = 3.75;
            double nilaiSistemDigital = 3.5;
            double TotalNilai = (sksSQ * nilaiSQ) + (sksKalkulus * nilaiKalkulus) + (sksTTKI * nilaiTTKI) + (sksSistemDigital * nilaiSistemDigital);
            double IP = TotalNilai / TotalSKS;
            System.out.println("IP Anda adalah " + IP);
        }
    }
