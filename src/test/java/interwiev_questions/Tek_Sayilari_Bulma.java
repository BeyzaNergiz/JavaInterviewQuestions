package interwiev_questions;

public class Tek_Sayilari_Bulma {

    public static void main(String[] args) {

        // Soru : Dizideki tek sayi adedini bulunuz.

        int[] arr = {8,3,1,6,2,4,5,9};
        int sayac = 0;

        for(int i=0; i< arr.length; i++){

            if(arr[i] % 2 != 0)
                sayac++;
        }

        System.out.println("Dizideki tek sayi adedi: "+ sayac);

    }
}
