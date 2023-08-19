package day05ifelseswitchternary;

public class Switch01 {
    public static void main(String[] args) {

        //Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        //1 yol
        String dayName = "WEDnesday";

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }

        //2. yol : switch


        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli gun ismi giriniz..");

                // switch : değiştir
// case : durum
// Break : (bırak) dinlenme, mola
// default :  else görevi görüyor (hatalı girişler için)
// switch methodlarda  keys insensitive için ".toLowerCase" ==> hepsini küçük harf yapar, ".toUpperCase" ==> hepsini büyük harf yapar
// gereksinimler sağlandıktan sonra ilk break methodunu gördükten sonra geri kalan syntax'leri switchbloğunu terk eder
// ne zaman switch kullanılır?
// if/else' nin kullanıldığı her durumda switch kullanılabilir.
// yazılan kodlarda eğer 3 den fazla durum varsa switch tercih edilir.
                //ÖNEMLİ NOT:  if else blokları mutlaka bağlantılı olmalı, bloklar her gereksinim için ayrı olursa bloklar doğrulanan ilk if methodundan sonra çalışmayacağı için kod sağlıklı olmaz
//başka çareler varsa nested yapı kullanılmamalı, eğere başka çareler varsa kod reddedilebilir!!!
//kodlar yazıldıktan sonra mutlaka yazılan tüm senaryolar TEST edilmeli
//BVA ==> Boundray Value Analysis  (istenen tüm senaryolar test edildikten sonra haricinde kalan sonsuz ihtimallerin mihenk beirlenerek test edilemsine denir
//   ".equals" methodu ( eşit mi?) demek
//syntax'i .equals ile çalıştırıp küçük harfle "monday, sunday, vs. yazdığımızda çalıştırmıyor..
// .equeals methodu keys sensitive => hassas bir method'dur, büyük harf küçük harfe duyarlıdır
                // ".equalsIgnoreCase" harfi görmezden gelen demek => büyük küçük harf duyarlılığı olmaması için kullanılır
                //NOTE: hangi parantez nerede kapanıyor görmek için ilgili paranteze tıkladığımızda nerde kapandığını java otomatik olarak gösteriyor
        }


    }
}