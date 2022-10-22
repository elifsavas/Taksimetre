import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km ;
        double perKm, toplam ;
        perKm = 2.20 ;

        Scanner input = new Scanner(System.in) ;
        System.out.print("Mesafe (KM): ");
        km = input.nextInt() ;

        toplam = 10 + (km * perKm) ;

        toplam = (toplam <= 20) ? 20 : toplam ;

        System.out.println("Ödenecek Tutar:" + toplam + " TL");

    }
}
