import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1


        int[] inputArray1 = {10000, 12750, 3030, 700, 8250};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int max = 0;
        int min = inputArray1[0];
        float average = 0.0f;

        for (int i : inputArray1) {
            sum += i;
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        average = (float) sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println();

        // Задача 2

        int[] inputArray2 = {55000, 73000, 62000, 50000, 87000};
        float[] outputArray2 = new float[inputArray2.length];
        int index = 0;

        for (float salary : inputArray2) {
            outputArray2[index] = salary * 0.13f;
            index++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println();
        // Задача 3

        int[] inputArray3 = {7000, 2000, 4000, 6000, 8000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        index = 0;

        for (int bonus : inputArray3) {
            outputArray3[index] = bonus > 5000;
            index++;
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println();
        // Задача 4

        int[] inputArray4 = {100, 0, 5000, -100, 300};
        boolean[] outputArray4 = {true};

        for (int deposit : inputArray4) {
            if (deposit < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println();
        // Задача 5

        int[] inputArray5 = {-50000, 2000, -2000, 300, 70000};
        int positiveMonth = 0;

        for (int positive : inputArray5) {
            if (positive > 0) {
                positiveMonth++;
            }
        }
        int[] outputArray5 = {positiveMonth};

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));


        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double[] two = {1.57, 7.654, 9.986};

        char[] three = new char[4];
        three[0] = 'a';
        three[1] = 'b';
        three[2] = 'c';
        three[3] = 'd';

        System.out.println();
        // Задача 2

        for (int index = 0; index < one.length; index++) {
            if (index < one.length - 1) {
                System.out.print(one[index] + ", ");
            } else {
                System.out.print(one[index]);
            }
        }
        System.out.println();


        for (int i = 0; i != two.length; i++) {
            if (i < two.length - 1) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();

        for (int a = 0; a < three.length; a++) {
            if (a < three.length - 1) {
                System.out.print(three[a] + ", ");
            } else {
                System.out.print(three[a]);
            }
        }
        System.out.println();

        System.out.println();

        // Задача 3

        for (int i = one.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
            }
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(three[i] + ", ");
            } else {
                System.out.print(three[i]);
            }
        }
        System.out.println();

        System.out.println();

        // Задача 4

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));

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