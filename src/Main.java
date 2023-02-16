public class Main {


    public static void main(String[] args) {
        int size = 10;
        Employee[] employees = new Employee[size];
        employees[0] = new Employee("Петров А.А.", 1, 10000);
        employees[1] = new Employee("Михайлов П.В.", 2, 11000);
        employees[2] = new Employee("Александров С.В.", 3, 11000);
        employees[3] = new Employee("Ильин А.Н.", 4, 13000);
        employees[4] = new Employee("Викторов А.В.", 5, 14000);
        employees[5] = new Employee("Сидоров Я.С.", 1, 9000);
        employees[6] = new Employee("Леонидов А.В.", 2, 15000);
        employees[7] = new Employee("Сергеев Н.В.", 3, 16000);
        employees[8] = new Employee("Алексеев Г.В.", 4, 17000);
        employees[9] = new Employee("Степанов В.В.", 5, 6000);

        printEmployees(employees);
        findSumSalary(employees);
        System.out.println("Среднее значение зарплат равно: " +
                findAverageSalary(employees) + " рублей.");

        findMaxSalary(employees);

        findMinSalary(employees);
        printNameEmployees(employees);
        int salaryIndex = 5;
        indexSalary(employees, salaryIndex);

        findMinSalaryDepartament(employees, 1);
        findMaxSalaryDepartament(employees, 1);
        findDepartamentSumSalary(employees, 1);
        findDepartamentAverageSalary(employees, 1);
        indexDepartamentSalary(employees, 1, salaryIndex);
        printDepartametEmployees(employees, 1);
        findSalaryMoreThanNumber(employees, 12500);
        findSalaryLessThanNumber(employees, 15000);

    }

    public static void printEmployees(Employee[] array) {
        for (Employee employee : array) {
            System.out.println(employee.toString());
        }
    }

    public static void findSumSalary(Employee[] array) {
        int sum = 0;
        for (Employee employee : array) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат = " + sum);
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