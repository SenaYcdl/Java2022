package day07_ifStatement;

public class C02_IfStatements {
    public static void main(String[] args) {

        int sayi=23;
        if(sayi>0)
        {
            System.out.println("sayi pozitif");
        }

        if(sayi%2==0){
            System.out.println("sayi cift");
        }

        if (sayi%5==0)
        {
            System.out.println("Sayi 5 in kati");
            /* basit if cumleleri kodun diger parcaalrindan bagimsizdir sadce bir sart kontrol eder
            sart saglaniyorsa if body calidir yoksa calismaz
            birden fazla basit if cumlesi varsa girilen sarta bagli olarak tumunde if body si calisabilir
            kismen if bodyleri calisabilir veya hicbit if bodysi calismayabilir
             */

        }
    }
}
