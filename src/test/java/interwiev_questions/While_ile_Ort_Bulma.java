package interwiev_questions;

import java.util.Scanner;

public class While_ile_Ort_Bulma {

    public static void main(String[] args) {

    // Soru : While Loop ile kullanicidan 10 sayinin ortalamasini bulmasini isteyiniz.

        int sayac = 0;
        double toplam = 0.0;

        Scanner scanner = new Scanner(System.in);

        while (sayac < 10) {
            System.out.print("Lutfen Bir Sayi Giriniz: ");
            double sayi = scanner.nextDouble();
            sayac++;
            toplam += sayi;
        }

        double ortalama = toplam / 10;
        System.out.println("Ortalama: " + ortalama);

        scanner.close();
    }
}
