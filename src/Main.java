import java.time.LocalDate;

public class Main {

    // метод к задаче 1
    public static void checkLeapYear(int year) {
        if (year >= 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // метод к задаче 2
    public static void checkOSAndYear(int os, int year) {

        int currentYear = LocalDate.now().getYear();
        if (os == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // метод к задаче 3
    public static void checkDeliveryDays(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void main(String[] args) {
        // Задача 1

        int year = 2021;
        checkLeapYear(year);

        System.out.println();
        // Задача 2

        int clientOS = 1;
        int clientDeviceYear = 2022;
        checkOSAndYear(clientOS, clientDeviceYear);

        System.out.println();
        // Задача 3

        int deliveryDistance = 15;
        checkDeliveryDays(deliveryDistance);

    }
}
