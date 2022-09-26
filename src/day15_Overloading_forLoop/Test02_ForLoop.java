package day15_Overloading_forLoop;

public class Test02_ForLoop {
    public static void main(String[] args) {

        //10 ile 30 arasindaki(sinirlar dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin


        int bas=10;
        int son=30;

        for (int i =bas; i<=son; i++) {
            if (i<son) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }

        }
    }
}
