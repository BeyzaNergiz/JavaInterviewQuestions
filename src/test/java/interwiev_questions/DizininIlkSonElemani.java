package interwiev_questions;

import java.util.Arrays;

public class DizininIlkSonElemani {
    // SORU : Dizinin ilk ve son elemani birbirine eşit mi? Kontrol edelim..

    public static void main(String[] args) {

        int[] numbersX = {10, 20, 30, 40, 10};
        System.out.println("Sonuc: " + firstLastSame(numbersX));

        System.out.println("--------------------------------------");

        int[] numbersY = {75, 65, 35, 75, 30};
        System.out.println("Sonuc: " + firstLastSame(numbersY));

    }
    public static boolean firstLastSame(int[] numberList) {

        System.out.println("Listemiz: " + Arrays.toString(numberList));

        int firstNum = numberList[0];
        int lastNum = numberList[numberList.length - 1];

        if (firstNum == lastNum) {
            return true;
        } else {
            return false;
        }
    }
}
