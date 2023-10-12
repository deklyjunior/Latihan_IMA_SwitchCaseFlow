import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        int angka = siu.nextInt();

        String nilai = "";

        switch (angka) {
            case 1 :
                nilai = "satu";
                break;
            case 2 :
                nilai = "dua";
                break;
            case 3 :
                nilai = "tiga";
                break;
            case 4 :
                nilai = "empat";
                break;
            case 5 :
                nilai = "lima";
                break;
            case 6 :
                nilai = "enam";
                break;
            case 7 :
                nilai = "tujuh";
                break;
            case 8 :
                nilai = "delapan";
                break;
            case 9 :
                nilai = "sembilan";
                break;
            case 10 :
                nilai = "sepuluh";
                break;
            default :
                System.out.println("ini berapa ya?");
                siu.close();
                return;
        }
        
        System.out.println("Nilai dari huruf " + angka + " Adalah " + nilai);

        siu.close();

    }
}
