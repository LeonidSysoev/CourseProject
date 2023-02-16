public class EmployeeBook {
    private final Employee[] employeesBook;
    private int size;

    public EmployeeBook() {
        this.employeesBook = new Employee[10];

    }

    public void addEmployeer(String fullName, int departament, float salary) {
        if (size >= employeesBook.length) {
            System.out.println("Места нет");
        }
        for (int i = 0; i < employeesBook.length; i++) {
            if (employeesBook[i] == null) {
                Employee newEmployee = new Employee(fullName, departament, salary);
                employeesBook[size++] = newEmployee;
                return;
            }
        }
    }


    public void printEmployees() {
        for (Employee employee : employeesBook) {
            System.out.println(employee.toString());
        }
    }

    public void findSumSalary() {
        int sum = 0;
        for (Employee employee : employeesBook) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат = " + sum);
    }

    public void findAverageSalary() {
        int sum = 0;
        for (Employee employee : employeesBook) {
            sum += employee.getSalary();
        }
        sum = sum / employeesBook.length;
        System.out.println("Средняя сумма зарплат = " + sum);

    }

    public int getCurrentSize() {
        return size;
    }

    public void removeEmployees(String employeeFullName) {
        for (int i = 0; i < employeesBook.length; i++) {
            if (employeesBook[i].getFullName().equals(employeeFullName)) {
                System.out.println(employeesBook[i].getFullName() + " удален");
                System.arraycopy(employeesBook, i + 1, employeesBook, i, size - i - 1);
                employeesBook[size - 1] = null;
                size--;
                return;
            }
        }
    }
}

