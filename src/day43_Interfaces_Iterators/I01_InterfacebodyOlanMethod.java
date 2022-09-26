package day43_Interfaces_Iterators;

public interface I01_InterfacebodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu dusunursek iki tane access modifier kullanma ihtimali olamaz

    asagidaki method da goreceginiz gibi interface de istisnai olarak body si olan methodlar olusturulabilir
    bu ozellik Java8 den sonra kullanilmaya baslanmistir. Bu ozellikten once bir interface e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface i implement eden tun classlara gidip yeni eklenen methodu override
    etmemiz gerekirdi

    bu ozellik sayesinde basina default veya static keyword ekleyerek interface de yeni ve bodysi olan bir method
    olusturusak bu method un child classlar tarafindan override edilme Mecburiyeti olmaz ve eskiden implement etmis
    classlari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olsturulan genel kurallari bozmaz

    bu methodlarin bodysi olsa da bunlara concrete method denmez ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir

    O zaman nicin 2 keyword(static ve default)tanimlanmistir?
    bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa , child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */


    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("Tum arabalarin direksiyonu vardir");
    }
    }
