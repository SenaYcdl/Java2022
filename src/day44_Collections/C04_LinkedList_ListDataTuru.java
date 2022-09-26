package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        List<String> list2 = new LinkedList<>();

        Queue<String> list3= new LinkedList<>();

        Deque<String> list4=new LinkedList<>();

        list2.add("Berk");
        list2.add("Done");
        list2.add("Enes");
        list2.add("Ayse");

        System.out.println(list);

        System.out.println(list2.remove(3)); //Ayse
        //eger listemiz integer elementlerden olusuyorsa direk sayi yazarsak index olarak kabul ede
        //ama bir variable a atama yapar ve remove da o variable in ismini yazarsak obje olarak kabul eder
        System.out.println(list2.remove("Kemal")); //false
        System.out.println(list2.isEmpty()); // false

        list2.set(1,"Serap");
        System.out.println(list2); // [Berk, Serap, Enes]

        //
        list.add("Berk");
        list.add("Ismail");
        System.out.println(list); // [Berk, Ismail]
        //
        list2.retainAll(list); //list2 deki tum elementleri list ile karsilastirir list de olmayanlari siler
        System.out.println(list2); // [Berk]
        System.out.println(list2.hashCode()); // 2066939
        list2.add("Fatih");
        System.out.println(list2.hashCode()); // 131726141
    }
}
