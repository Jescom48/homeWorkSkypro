public class Employee {

    String fullName;
    int department;
    double salary;
    int id;

    private static int idCounter = 1;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }


    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + fullName + ", зарплата: " + salary);
    }


    @Override
    public String toString() {
        return "ФИО: " + fullName + ", отдел №" + department + ", зарплата: " + salary + ", ID: " + id;
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) return true;
        if (s == null || getClass() != s.getClass()) {
            return false;
        }

        Employee employee = (Employee) s;
        return Double.compare(employee.salary, this.salary) == 0;
    }


}
