package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {
 /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        int couter = 0;

        do {
            if (couter == 4) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen usernameyi giriniz");
            String userName = input.next();
            System.out.println("Lutfen passwordu giriniz");
            String password = input.next();
            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz");
                break;

            }
            couter++;

        } while (true);


    }

}