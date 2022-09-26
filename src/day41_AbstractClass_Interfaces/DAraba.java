package day41_AbstractClass_Interfaces;

public abstract class DAraba {
    public static void main(String[] args) {

        /*
        abstract class da main method opsiyonel dir
        eger abstract class sadece child classlarin tasimak
        istedigi ozellikleri belirlemek icin olusturulduysa main method a
        ihtiyac duymaz
        sadece abstract methodlar olur

        ama bir abstarct method da standart belirlemek disinda da methodlar
        calisablir
        bu durumda ihtiyac olursa amin method olusturulabilir

        abstract yapıp yapmamaya sonradan değil baslangıcta karar veriyoruz,
         bu class abstract class olsun ve childleri icin kural koysun
         */
    }

    protected abstract void yakit();
    protected abstract void kaporta();
   protected abstract void motor();
    /*
    sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen methodlar abstract method
    olur ve abstract method larin body si olmaz
     */


    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");

        /*
        abstract olmayan methodlara concrete method denir.
        abstract bir methodu abstarct keyword ile belirtmek zorunludur
        ancak concrete methodlarda bunun deklare edilmesine gerek yoktur
        biz sadece abstarction ile ilgili konustugumuzda abstract olmayan methodlardan bahsetmek icin
        concrete tabirini kullaniriz
         */
    }
}

