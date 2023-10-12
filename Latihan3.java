import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.println("Masukkan kota tujuan: ");
        String kota = siu.nextLine();

        System.out.println("Masukkan total penumpang: ");
        int penumpang = siu.nextInt();

        int harga = 0;
        switch (kota) {
            case "Jakarta" :
                harga = 145000;
                break;
            case "Bogor" :
                harga = 200000;
                break;
            case "Garut" :
                harga = 75000;
                break;
            case "Purwakarta" :
                harga = 75000;
                break;
            default :
                System.out.println("Tidak valid.");
                siu.close();
                return;
        }

        int total = harga * penumpang;
        System.out.println("Harga dari " + kota + " Adalah " + total);

        siu.close();
    }
}
