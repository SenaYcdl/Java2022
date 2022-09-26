package day07_ifStatement;

public class C03_IfStatement {
    public static void main(String[] args) {

         /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
         */
        int sayi=-23;

        if(sayi>0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir");
        System.out.println("Ucuncu satir");


        if (sayi%2==0)
            System.out.println("sayi cift");
        System.out.println("cift kalacaktir");

        if (sayi%5==0)
            System.out.println("Sayi 5'in tam kati");

    }
}


