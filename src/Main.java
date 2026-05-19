
public class Main {
    public static void main(String[] args) {

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

        System.out.println();
        // Задача 3

        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника - " + replaceFullName);

    }
}