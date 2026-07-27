public class EmployeeBook {

    private final Employee[] employees;

    public EmployeeBook() {
        employees = new Employee[10];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void printAllEmployees() {
        for (Employee i : employees) {
            if (i != null) {
                System.out.println(i.toString());
            }
        }
    }

    public double calculateAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee i : employees) {
            if (i == null) break;
            sum += i.getSalary();
            count++;
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public void calculateTaxProportional(String taxType) {
        for (Employee i : employees) {
            if (i == null) continue;
            double tax = 0.0;
            switch (taxType) {
                case "PROPORTIONAL":
                    tax = 0.13;
                    break;
                case "PROGRESSIVE":
                    double salary = i.getSalary();
                    if (salary <= 150) {
                        tax = 0.13;
                    } else if (salary <= 350) {
                        tax = 0.17;
                    } else {
                        tax = 0.21;
                    }
                    break;
            }
            double taxSalary = i.getSalary() * tax;
            System.out.println("Сотрудник: " + i.fullName + " налоговая ставка: " + (tax * 100) + " налог " + taxSalary);
        }
    }

    public void salaryIndexation(int department, double percent) {
        for (Employee i : employees) {
            if (i == null) continue;
            if (i.department != department) {
                continue;
            }
            double oldSalary = i.getSalary();
            double newSalary = oldSalary * (1 + percent / 100.0);
            if (newSalary > 450) {
                newSalary = 450;
            }
            if (Double.compare(oldSalary, newSalary) == 0) {
                continue;
            }
            i.setSalary(newSalary);
        }
    }

    public void findFirstEmployeeAboveSalaryInDepartment(int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e == null) break;
            if (e.getDepartment() == department && e.getSalary() > salary) {
                System.out.println("Порядковый номер: " + (i + 1));
                e.printShortInfo();
                return;
            }
        }
        System.out.println("Такой сотрудник не найден.");
    }

    public void printFirstEmployeesBelowWage(double wage, int employeeNumber) {
        int count = 0;
        int i = 0;
        while (i < employees.length) {
            Employee e = employees[i];
            if (e == null) break;
            if (e.getSalary() < wage) {
                e.printShortInfo();
                count++;
                if (count >= employeeNumber) {
                    break;
                }
            }
            i++;
        }
        if (count == 0) {
            System.out.println("Такие сотрудники не найдены.");
        }

    }

    public boolean containsEmployeeByAccountingEquals(Employee search) {
        for (Employee i : employees) {
            if (i == null) break;
            if (i.equals(search)) {
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeId(int id) {
        for (Employee i : employees) {
            if (i == null) break;
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
}
