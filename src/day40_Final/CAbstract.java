package day40_Final;

public abstract class CAbstract {

   void toplama(){
       System.out.println("Bu method toplama yapar");

   }

  abstract void carpma();

   abstract void bolme();

    void cikarma() {
        System.out.println("Bu method cikarma yapar");
    }


   /*
   bir methodun basina abstract yazarsaniz bu methodun child classlar icin bir standart oldugunu
   declare etmis olursunuz ve method body e ihtiyac kalmaz
    */

}
