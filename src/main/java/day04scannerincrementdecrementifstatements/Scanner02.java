package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println("Toplam" + (firstNumber + secondNumber));
        System.out.println("Cikarma" + (firstNumber - secondNumber));
        System.out.println("Carpim" + (firstNumber * secondNumber));
        System.out.println("Bolme" + (firstNumber / secondNumber));

    }
}
