import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.println("Masukkan Huruf: ");
        char huruf = siu.next().charAt(0);

        String nilai = "";

        switch (huruf) {
            case 'A' :
                nilai = "A: Excellent";
                break;
            case 'B' :
                nilai = "B: Good";
                break;
            case 'C' :
                nilai = "C = Average";
                break;
            case 'D' :
                nilai = "D: Fail";
                break;
            default :
                System.out.println("Tidak valid.");
                siu.close();
                return;
        }
        
        System.out.println("Nilai dari huruf " + huruf + " Adalah " + nilai);

        siu.close();;
    }
}
