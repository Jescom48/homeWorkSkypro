
public class Main {
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