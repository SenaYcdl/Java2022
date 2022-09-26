package day15_Overloading_forLoop;

public class Test06_ForLoop {
    public static void main(String[] args) {

      /*
      Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
        girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
                - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
                - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin

       */

        for (int i=1; i<=100; i++) {
            if (i%3==0) {
                System.out.print("Java,");
            } else if (i%5==0) {
                System.out.print("Guzeldir,");
            } else if (i%3==0 && i%5==0) {
                System.out.print("Java Guzeldir,");
            } else {
                System.out.print(i+",");
            }
            }
        }
    }


     /*daha iyi bir cozum

      Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir pozitif tamsayi giriniz");

        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Java Guzeldir");
            }else if(i%5==0){
                System.out.print("Guzeldir"+ " ");
            }else if(i%3==0){
                System.out.print("Java" + " ");
            }else{
                System.out.print(i + " ");
            }
      */
