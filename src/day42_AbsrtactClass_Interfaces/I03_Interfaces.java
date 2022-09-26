package day42_AbsrtactClass_Interfaces;

public interface I03_Interfaces{

    int SAYI=20;

    /*
    int sayi;
    interface lerde tum variable lar public,static ve final dir
    dolayisiyla sonradan deger atama sansimiz yoktur
    bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

    bir interface bir classi parent edinemez
     */


    /*
    interface icerisindeki her method public, abstract
    ozelliklere sahiptir

    abstract bir methodun bodysi olmasi mumkun degildir
    Java sonradan dev lerin istedi uzerine kismi bir update yapmistir
    bir interface e sonradan  bir abstract method eklerseniz o interface i daha once implement etmis
    tum classlara gidip hepsinde yeni eklenen methodu override etmeniz gerekir bu da
    buyuk ve eskiden gelen projeler icin cok zor bir islemdir

    bunun icin Java8 den itibaren interfacelere sonradan body si olan method eklenmesine izin vermistir
    bu methodlarin body si olsada interface in yapisi geregi bu methodlara concrete denmez
     bu body si olan methodlar istisna olarak kabul edilebilir
     */




}
