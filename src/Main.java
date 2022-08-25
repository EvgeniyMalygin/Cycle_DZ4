import java.text.Format;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("============================ Задание 1 =====================");
        int i = 1;
        while (i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        for (; i > 0; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 2
        System.out.println("============================ Задание 2 =====================");
        int dataFistFriday = 1; //Дата первой пятницы
        while (dataFistFriday <= 31)
        {
            System.out.println("Сегодня пятница, " + dataFistFriday + " число. Необходимо подготовить отчет.");
            dataFistFriday = dataFistFriday + 7;
        }
        //Задание 3
        System.out.println("============================ Задание 3 =====================");
        int yearToday = 2022; // текущий год
        int yearLast = yearToday - 200; // текущая дата - 200 лет
        int yearPast = yearToday + 100; // текущая дата + 100 лет
        for ( i = 0; i<= yearPast; i = i + 79)
        {
            if (i >= yearLast)
            {
            System.out.println(i);
            }
        }
    }
}