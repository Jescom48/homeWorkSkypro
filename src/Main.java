import java.lang.reflect.Array;
import java.util.Arrays;


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
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // метод к задаче 3
    public static void calculationDeliveryDays(int distance) {
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


        EmployeeBook book = new EmployeeBook();

        String[] fullName = {"Ветров П.П.", "Дождев А.Т.", "Озерова И.К.", "Горный И.В.", "Полянов П.П.", "Дорожная А.А.",
                "Морев М.Д.", "Полевая С.А.", "Рощин Н.С.", "Снегов М.О."};
        int[] department = {5, 4, 3, 2, 1, 1, 2, 3, 4, 5};
        double[] salary = {100, 50, 450, 300, 270, 70, 400, 260, 320, 350};

        for (int i = 0; i < fullName.length; i++) {
            boolean added = book.addEmployee(new Employee(fullName[i], department[i], salary[i]));
            if (added) {
                System.out.println("Сотрудник " + fullName[i] + " добавился успешно");
            } else {
                System.out.println("Сотрудник " + fullName[i] + " не добавился в список. В списке нет свободного места.");
            }
        }

        System.out.println();
        System.out.println("Добовляем 11 сотрудника");

        Employee peskov = new Employee("Песков В.В.", 2, 150);

        boolean added = book.addEmployee(peskov);
        if (added) {
            System.out.println("Сотрудник " + peskov.getFullName() + " добавился успешно");
        } else {
            System.out.println("Сотрудник " + peskov.getFullName() + " не добавился в список. В списке нет свободного места.");

        Product p1 = new Product(1, "Samsung A71", 17999, "смартфоны");
        Product p2 = new Product(2, "Apple 6s", 15000, "смартфоны");
        Product p3 = new Product(3, "Poco x3", 7000, "смартфоны");
        Product p4 = new Product(1, "Samsung A71", 10000, "смартфоны"); // смартфон с уценкой

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.println();

        System.out.println(p1.equals(p2)); // проверка что продукты разные
        System.out.println(p1.equals(p4)); // проверка разных продуктов с одинаковым id  и категорией

        System.out.println();

        Product[] basket1 = {p1, p3, p2};
        Product[] basket2 = {p3, p1, p2};
        Product[] basket3 = {p3};
        Product[] basket4 = {p1, p3, p2};

        System.out.println(Arrays.toString(basket1));
        System.out.println(Arrays.toString(basket2));
        System.out.println(Arrays.toString(basket3));
        System.out.println(Arrays.toString(basket4));

        System.out.println();

        Order o1 = new Order("Иван", basket1);
        Order o2 = new Order("Иван", basket2);
        Order o3 = new Order("Мария", basket3);
        Order o4 = new Order("Иван", basket4);

        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

        System.out.println();

        System.out.println(o1.equals(o2)); // сравнение заказов с разным порядком товаров
        System.out.println(o1.equals(o3)); // сравнение заказов с  разными покупателями и разными товарами
        System.out.println(o1.equals(o4)); // сравнение заказов с одинаковыми покупателями и одинаковым порядком товаров


        // Задача 1


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName + '.';

        System.out.println(" Ф.И.О. сотрудника - " + fullName);

        System.out.println();
        // Задача 2

        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + upperCaseFullName);

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


        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника - " + replaceFullName);

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


        int clientOS = 1;
        int clientDeviceYear = 2022;
        checkOSAndYear(clientOS, clientDeviceYear);

        System.out.println();
        // Задача 3

        int deliveryDistance = 15;
        calculationDeliveryDays(deliveryDistance);

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


        System.out.println("Выводим список всех сотрудников с ID");
        book.printAllEmployees();

        System.out.println();

        System.out.println("средняя зарплата: " + book.calculateAverageSalary());

        System.out.println();

        System.out.println("Расчет налоговой ставки (PROGRESSIVE)");
        book.calculateTaxProportional("PROGRESSIVE");
        System.out.println("Расчет налоговой ставки (PROPORTIONAL)");
        book.calculateTaxProportional("PROPORTIONAL");

        System.out.println();

        System.out.println("Индексируем зарплату 2 отдела на 5% и выводим список сотрудников.");
        book.salaryIndexation(2, 5);
        book.printAllEmployees();

        System.out.println();

        System.out.println("Первый сотрудник в отделе 4 с зарплатой больше 90");
        book.findFirstEmployeeAboveSalaryInDepartment(4, 90);

        System.out.println();

        System.out.println("Первые 5 сотрудников с зарплатой меньше 200");
        book.printFirstEmployeesBelowWage(200, 5);

        System.out.println();

        System.out.println("Проверка сотрудников по зарплате ");
        Employee sample = new Employee("Опушкин С.С.", 2, 350);
        System.out.println(book.containsEmployeeByAccountingEquals(sample));

        System.out.println();

        System.out.println("Поиск сотрудника c ID 2");
        System.out.println(book.getEmployeeId(2).toString());


    }


}

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

