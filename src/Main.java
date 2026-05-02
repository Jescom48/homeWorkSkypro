
public class Main {
    public static void main(String[] args) {


        // Задание 1

        int firstFridey = 3;

        for (int i = 1; i <= 31; i++) {
            if (i % 7 == firstFridey % 7) {
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println();
        // Задание 2

        int walketDistance = 0;

        do {
            System.out.println("Держитесь! Осталось " + (42195 - walketDistance) + " метров");
            walketDistance += 500;
        }
        while (walketDistance <= 42195);

        System.out.println();

        walketDistance = 0;
        for (; walketDistance <= 42_195; ) {
            System.out.println("Держитесь! Осталось " + (42195 - walketDistance) + " метров");
            walketDistance += 500;
        }

        System.out.println();
        // Задание 3

        int cash = 1235;
        int day = 1;
        int dayFree = 0;

        while (cash >= 100) {
            if (day % 5 == 0) {
                dayFree++;
                day++;
                continue;
            }
            cash -= 100;
            day++;
        }
        System.out.println("Вашей суммы хватит на " + (day - 1) + " дней, из них " + dayFree + " дней бесплатной парковки");

        System.out.println();

        cash = 1235;
        day = 1;
        dayFree = 0;

        for (; cash >= 100; day++) {
            if (day % 5 == 0) {
                dayFree++;
                continue;
            }
            cash -= 100;
        }
        System.out.println("Вашей суммы хватит на " + (day - 1) + " дней, из них " + dayFree + " дней бесплатной парковки");

        System.out.println();
        // Задание 4

        int month = 0;
        int total = 0;

        while (true) {
            if (total >= 12_000_000) {
                break;
            }
            total += 15_000;
            month++;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            System.out.println("За " + month + " месяцев, Вы накопили " + total + " рублей");
        }

        System.out.println();
        // Задание 5

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge <= 100) {
            if (minute % 10 == 0 && minute >= 10) {
                overheats++;
                System.out.println("Перегрев");
                if (overheats == 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute += 2;
                continue;
            }
            minute++;
            charge += 2;

        }
        System.out.println("Время зарядки составило " + minute + " минут");


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