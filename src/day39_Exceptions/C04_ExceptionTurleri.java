package day39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable i kullanmaya calisirsaniz
        Java Compile Time da bunu farkeder ve size izin vermez
         */

        str=null;
        //System.out.println(str.length());
        //NullPointerException (Run Time ma ait bir exception)

        Object obj="Java Java Java";
        Integer sayi=(Integer)obj; // ClassCastException


        /*
        String str2="Hava Civa";
        Integer sayi2=str2;

        jAVA bazi casting islemlerine Compile Time da izin vermez
        Ancak bazen syttax uygun olabilir bu durumda Java kodun calismasina itiraz etmez

         */

    }
}
