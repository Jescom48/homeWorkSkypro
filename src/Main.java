
public class Main {
    public static void main(String[] args) {
        // Задача №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Задача №2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Задача №3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();

        // Задача №4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Задача №5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println();

        // Задача №6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // Задача №7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // Задача №8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();

        // Задача №9
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary + total * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();

        // Задача №10
        int result = 0;
        int multiplierNumber = 2;
        for (int i = 1; i <= 10; i++) {
            result = multiplierNumber * i;
            System.out.println(multiplierNumber + "*" + i + "=" + result);
        }
    }
}