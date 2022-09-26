package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Collections<dataTuru> nu Object seçmeniz durumunda Collection'a farkli data turlerinden objeler koymaniza izin
        verir. Bu depolama acisindan bize esneklik saglar, ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir.
        */

        List<String> liste = new ArrayList<>();
        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List<Object> list=new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5); // 10
        list.set(3,list.get(3)+"Can"); // AliCan
        list.set(2,!(Boolean)list.get(2)); // false
        list.set(1,(Character)list.get(1)+'a'); // ascii degeri

        System.out.println(list);


        Set<Object> set1=new HashSet<>(); // siraya dizer
        set1.add(5);
        set1.add(true);
        set1.add('5');
        set1.add("Ali");
        System.out.println(set1);
    }
}