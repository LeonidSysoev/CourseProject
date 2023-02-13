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
        //System.out.println("employees[0].getId() = " + employees[0].getId());
        //System.out.println("employees.toString() = " + employees[1].toString());

        printEmployees1(employees);
        findSumSalary(employees);
        System.out.println("Среднее значение зарплат равно: " +
                findAverageSalary(employees) + " рублей.");

        findMaxSalary(employees);

        findMinSalary(employees);
        //  printNameEmployees(employees);
        int salaryIndex = 5;
        indexSalary(employees, salaryIndex);
        printEmployees(employees);
        findMinSalaryDepartament(employees, 3);

    }

    public static void printEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void findSumSalary(Employee[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        System.out.println("Сумма зарплат = " + sum);
    }

    public static float findAverageSalary(Employee[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        float averageSalary = (float) sum / array.length;
        return averageSalary;
    }

    public static void findMaxSalary(Employee[] array) {
        int maxSalary = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxSalary < array[i].getSalary()) {
                maxSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой " + array[i].toString());
            }
        }
    }

    public static void findMinSalary(Employee[] array) {
        int minSalary = 100000000;
        for (int i = 0; i < array.length; i++) {
            if (minSalary > array[i].getSalary()) {
                minSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой " + array[i].toString());
            }
        }
    }

    public static void printNameEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getFullName().toString());
        }
    }

    public static void indexSalary(Employee[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i].getSalary() + (array[i].getSalary() * index / 100);
            array[i].setSalary(i1);
        }
    }

    public static void findMinSalaryDepartament(Employee[] array, int departament) {
        int minSalary = 100000000;

        for (int i = 0; i < array.length; i++) {
            if (departament == array[i].getDepartament()) {
                if (minSalary > array[i].getSalary()) {
                    minSalary = array[i].getSalary();
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (departament == array[i].getDepartament()) {
                if (array[i].getSalary() == minSalary) {
                    System.out.println("Сотрудник с минимальной зарплатой  в отделе "
                            + departament + " " + array[i].toString());
                }
            }
        }
    }
    public static void printEmployees1(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getId()+ " " + array[i].getFullName() + " " + array[i].getSalary());
            System.out.println();
        }
    }

}