import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double fArmut = 2.14, fElma = 3.67, fDom = 1.11, fMuz = 0.95, fPat = 5.0;

        Scanner kilo = new Scanner(System.in);

        System.out.println("Armut kac kilo?: ");
        int kArmut = kilo.nextInt();

        System.out.println("Elma kac kilo?: ");
        int kElma = kilo.nextInt();

        System.out.println("Domates kac kilo?: ");
        int kDom = kilo.nextInt();

        System.out.println("Muz kac kilo?: ");
        int kMuz = kilo.nextInt();

        System.out.println("Patlıcan kac kilo?: ");
        int kPat = kilo.nextInt();

        double tutar = fArmut*kArmut + fElma*kElma+ fDom*kDom +fMuz*kMuz + fPat*kPat;

        System.out.println("Toplam Tutar: " + tutar);
    }
}
