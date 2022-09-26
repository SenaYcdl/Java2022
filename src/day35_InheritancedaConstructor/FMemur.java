package day35_InheritancedaConstructor;

public class FMemur extends EMuhasebe{

    /*
    extends keyword kullanilan class larda ister default
    constructor bulunsun istersek de biz yeni constructor(lar) olusturalim
    java constructor in ilk satirina super(); constructor call yazar

    super(); constructor call, default constructor a benzer gorunmesede orada vardir ve calisir ancak bi zilk
    satira farkli bir constructor call yazarsak
    Java super(); constructor ini siler

    eger biz mudahele edip constructor call u olusturmassak javanin default olarak olusturdugu constructor
    call her zamana parametresizdir= super();
     */

    FMemur() {
        System.out.println("Memur parametresiz constructor");
    }

    FMemur(String isim) {
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {

        FMemur mm1=new FMemur("ali");

    }
}
