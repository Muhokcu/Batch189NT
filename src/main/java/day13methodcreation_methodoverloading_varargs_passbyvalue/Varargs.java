package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {
        int result = toplamaYap(5, 6, 7);
        System.out.println(result);
        int sacmalik = toplamaYap(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        System.out.println(sacmalik);

    }

    // java farkli sayidaki parametlerin hepsini kabul eden bir yapi olusturdu
    //Bu yapiya varargs denir
    // Varargs arka planda Array yapisini kullanir
    // toplama islemi yapan bir method olustur
//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }//
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }//
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }//
//    public static int toplamaYap(int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
//    }
    public static int toplamaYap(int... a) {
        int sum = 0; // burayi  yaparsak carpma bolmede yapilabilir
        for (int w : a) {
            sum = sum + w;

        }
        return sum;

        //1) Bir method parantezinde birden fazla varargs kullanilmaz
        //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


        //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
        //Bu yapiya Varargs diyoruz
        //Varargs arka planda Array yapisini kullanir

        //toplama islemi yapan bir method olusturun
//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }
//
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    }


}
