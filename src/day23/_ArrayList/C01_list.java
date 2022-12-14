package day23._ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_list {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println( "Listenin boyutu:" + sayilar1.size());
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);
        System.out.println("Listenin yeni boyutu:" + sayilar1.size());

        sayilar1.set(2,8);
        System.out.println(sayilar1);

        System.out.println(sayilar1.set(0,12)); // burada sonuc 5 cikar cunku 0. indexi
        System.out.println(sayilar1);

        /*
        set methodu istenen index deki eski elementi silip yerine verdigimiz yeni elementi set eder

        eger eski elementi silmek istemiyorsak
        add(index,deger) methodu kullanabiliriz

        set methodu sildigi eski elementi bize donduurur
         */

    }
}
