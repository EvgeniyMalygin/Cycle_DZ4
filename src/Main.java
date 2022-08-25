import java.text.Format;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("============================ Задание 1 =====================");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        for (; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}