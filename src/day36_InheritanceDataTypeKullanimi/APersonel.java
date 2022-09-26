package day36_InheritanceDataTypeKullanimi;

public class APersonel {


        protected String isim="Isim belirtilmedi";
        protected String soyisim="SoyIsim belirtilmedi";
        protected String departman="departman belirtilmedi";

         protected void maas() {
             System.out.println("Tum personelimiz maas alir");
         }

         protected void sigorta() {
             System.out.println("Tum personele sigorta yapilir");
         }
    }
