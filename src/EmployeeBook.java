

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
            if (employee != null) {
                System.out.println(employee.toString());
            }

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
        for (int i = 0; i <= employeesBook.length; i++) {
            if (employeesBook[i].getFullName().equals(employeeFullName)) {
                System.out.println(employeesBook[i].getFullName() + " удален");
                System.arraycopy(employeesBook, i + 1, employeesBook, i, size - i - 1);
                employeesBook[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void addNewEmployeer(String fullName, int departament, float salary) {
        if (size >= employeesBook.length) {
            System.out.println("Места нет");
        }
        for (int i = 0; i < employeesBook.length; i++) {
            if (employeesBook[i] == null) {
                Employee newEmployee = new Employee(fullName, departament, salary);
                employeesBook[i] = newEmployee;
                size++;
                return;
            }
        }
    }

    public void changeSalary(String fullName, float salary) {
        for (Employee employee : employeesBook) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }

    public void changeDepartament(String fullName, int departament) {
        for (Employee employee : employeesBook) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartament(departament);
            }
        }
    }

    public void printEmployeeInDepartament() {

        for (Employee employee : employeesBook) {

            System.out.println("Сотрудники в отделе - " + employee.getDepartament());

            if (employee.getDepartament() == employee.getDepartament()) {

                System.out.println(employee.getFullName());
            }
        }
    }


    public void findMaxSalary() {
        float maxSalary = -1f;
        for (Employee employee : employeesBook) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employeesBook) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой " + employee);
            }
        }
    }

    public void findMinSalary() {
        float minSalary = 100000000f;
        for (Employee employee : employeesBook) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employeesBook) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой " + employee);
            }
        }
    }

    public void printNameEmployees() {
        for (Employee employee : employeesBook) {
            System.out.println("Ф.И.О.: " + employee.getFullName());
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : employeesBook) {
            float i1 = employee.getSalary() + (employee.getSalary() * index / 100);
            employee.setSalary(i1);
        }
    }

    public void findMinSalaryDepartament(int departament) {
        float minSalary = 100000000f;

        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }

        }
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                if (employee.getSalary() == minSalary) {
                    System.out.println("Сотрудник с минимальной зарплатой  в отделе "
                            + departament + " " + employee);
                }
            }
        }
    }

    public void findMaxSalaryDepartament(int departament) {
        float maxSalary = -1f;

        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                }
            }

        }
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                if (employee.getSalary() == maxSalary) {
                    System.out.println("Сотрудник с максимальной зарплатой в отделе "
                            + departament + " " + employee);
                }
            }
        }
    }

    public void findDepartamentSumSalary(int departament) {
        int sum = 0;
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат по отделу - " + departament + " = " + sum);
    }

    public void findDepartamentAverageSalary(int departament) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                sum += employee.getSalary();
                count++;
            }
        }
        float averageSalary = (float) sum / count;
        System.out.println("Среднее значение зарплат по отделу - " + departament + " равно " +
                averageSalary + " рублей.");
    }

    public void indexDepartamentSalary(int departament, int index) {
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                float i1 = employee.getSalary() + (employee.getSalary() * index / 100);
                employee.setSalary(i1);
            }
        }
    }

    public void printDepartametEmployees(int departament) {
        for (Employee employee : employeesBook) {
            if (departament == employee.getDepartament()) {
                System.out.print("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
                System.out.println();
            }
        }
    }

    public void findSalaryMoreThanNumber(float number) {
        for (Employee employee : employeesBook) {
            if (number <= employee.getSalary()) {
                System.out.println("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
            }
        }
    }

    public void findSalaryLessThanNumber(float number) {
        for (Employee employee : employeesBook) {
            if (number > employee.getSalary()) {
                System.out.println("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
            }
        }
    }
}

