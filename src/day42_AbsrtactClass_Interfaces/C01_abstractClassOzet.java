package day42_AbsrtactClass_Interfaces;

public class C01_abstractClassOzet {

    /*
    1- bir classi abstract yapip yapmamaya bastan karar veririz eger bir class dan obje
    olusturmayacaksak o classi child classlarinin uymasi gereken kurallari belirleyecek
    sekilde dizayn etmek istiyorsak abstract class yapariz

    2-abstract bir classda child classlarin mutlaka uymasi gereken kurallari abstract methodlar ile belirleriz.
    Abstract methodlar mutlaka child class da override edilecegi icin body ye ihtiyac duymaz

    3-abstract olarak tanimlanan methodlarin body si olmaz

    4-abstract class zincirinden sonra gelen ilk concrete(abstract olmayan ) class,
    parentlarinda bulunan ve concrete olmayan tum methodlari override etmek zorundadir

    5-abstract method private,final veya static olmaz cunku override etmemiz lazim

    6-bir abstract class icinde concrete methodlar da olabilir ama concrete class icinde
    abstract method OLUSTURULAMAZ

    7-abstract class da obje olusturulamaz

    8-abstract bir classin abstract child i parent daki abstract methodlari override etmek zorunda degildir

    9-abstract classlar constructor a sahiptir fakat abstract classlardan obje olusturulamaz

    10-concrete bir child class, parent i olan abstract classlardaki tum abstract methodlari
    implement etmelidir,diger turlu CTE verir

    11-abstract methodlari implemet etmek icin oncelikler overriding yapilmalidir


     */
}
