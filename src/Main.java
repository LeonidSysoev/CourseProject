public class Main {


    public static void main(String[] args) {


        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Баранов", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Петров", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Виктор", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);
        employeeBook.addEmployeer("Иванов", 1, 10000);



        employeeBook.printEmployees();
        employeeBook.findSumSalary();
        employeeBook.findAverageSalary();
        employeeBook.getCurrentSize();
        employeeBook.removeEmployees("Петров");
        employeeBook.removeEmployees("Викто");
        employeeBook.removeEmployees("Иванов");
        employeeBook.printEmployees();
        employeeBook.addEmployeer("Сидоров", 1, 10000);
        employeeBook.printEmployees();
    }




    public static float findAverageSalary(Employee[] array) {
        int sum = 0;
        for (Employee employee : array) {
            sum += employee.getSalary();
        }
        return (float) sum / array.length;

    }

    public static void findMaxSalary(Employee[] array) {
        float maxSalary = -1f;
        for (Employee employee : array) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : array) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой " + employee);
            }
        }
    }

    public static void findMinSalary(Employee[] array) {
        float minSalary = 100000000f;
        for (Employee employee : array) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : array) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой " + employee);
            }
        }
    }

    public static void printNameEmployees(Employee[] array) {
        for (Employee employee : array) {
            System.out.println("Ф.И.О.: " + employee.getFullName());
        }
    }

    public static void indexSalary(Employee[] array, int index) {
        for (Employee employee : array) {
            float i1 = employee.getSalary() + (employee.getSalary() * index / 100);
            employee.setSalary(i1);
        }
    }

    public static void findMinSalaryDepartament(Employee[] array, int departament) {
        float minSalary = 100000000f;

        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }

        }
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                if (employee.getSalary() == minSalary) {
                    System.out.println("Сотрудник с минимальной зарплатой  в отделе "
                            + departament + " " + employee);
                }
            }
        }
    }

    public static void findMaxSalaryDepartament(Employee[] array, int departament) {
        float maxSalary = -1f;

        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                }
            }

        }
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                if (employee.getSalary() == maxSalary) {
                    System.out.println("Сотрудник с максимальной зарплатой в отделе "
                            + departament + " " + employee);
                }
            }
        }
    }

    public static void findDepartamentSumSalary(Employee[] array, int departament) {
        int sum = 0;
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат по отделу - " + departament + " = " + sum);
    }

    public static void findDepartamentAverageSalary(Employee[] array, int departament) {
        int sum = 0;
        int count = 0;
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                sum += employee.getSalary();
                count++;
            }
        }
        float averageSalary = (float) sum / count;
        System.out.println("Среднее значение зарплат по отделу - " + departament + " равно " +
                averageSalary + " рублей.");
    }

    public static void indexDepartamentSalary(Employee[] array, int departament, int index) {
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                float i1 = employee.getSalary() + (employee.getSalary() * index / 100);
                employee.setSalary(i1);
            }
        }
    }

    public static void printDepartametEmployees(Employee[] array, int departament) {
        for (Employee employee : array) {
            if (departament == employee.getDepartament()) {
                System.out.print("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
                System.out.println();
            }
        }
    }

    public static void findSalaryMoreThanNumber(Employee[] array, float number) {
        for (Employee employee : array) {
            if (number <= employee.getSalary()) {
                System.out.println("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void findSalaryLessThanNumber(Employee[] array, float number) {
        for (Employee employee : array) {
            if (number > employee.getSalary()) {
                System.out.println("Табельный номер: " + employee.getId() +
                        "; Ф.И.О.: " + employee.getFullName() + "; Зарплата: " + employee.getSalary());
            }
        }
    }

}