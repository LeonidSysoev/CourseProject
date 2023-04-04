public class Main {


    public static void main(String[] args) {


        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployeer("Иванов А.А.", 5, 11000);
        employeeBook.addEmployeer("Баранов Б.Б.", 4, 12000);
        employeeBook.addEmployeer("Сухов А.В.", 1, 13000);
        employeeBook.addEmployeer("Егоров С.Р.", 3, 14000);
        employeeBook.addEmployeer("Петров К.О.", 5, 15000);
        employeeBook.addEmployeer("Седов А.Д.", 2, 16000);
        employeeBook.addEmployeer("Георгиев А.К.", 2, 17000);
        employeeBook.addEmployeer("Викторов С.Ю.", 4, 18000);
        employeeBook.addEmployeer("Степанов П.П.", 3, 19000);
        employeeBook.addEmployeer("Принципов Ф.Ф.", 2, 18560);

        employeeBook.printEmployees();
        employeeBook.findSumSalary();
        employeeBook.findAverageSalary();
        System.out.println("employeeBook.getCurrentSize() = " + employeeBook.getCurrentSize());
        employeeBook.removeEmployees("Петров К.О.");
        employeeBook.removeEmployees("Викторов С.Ю.");
        employeeBook.removeEmployees("Иванов А.А.");
        System.out.println("employeeBook.getCurrentSize() = " + employeeBook.getCurrentSize());
        employeeBook.printEmployees();
        employeeBook.addNewEmployeer("Сидоров А.В.", 1, 10000);
        employeeBook.addNewEmployeer("Антонов П.А.", 3, 11500);
        employeeBook.addNewEmployeer("Павлов Т.В.", 1, 13600);
        System.out.println();
        employeeBook.printEmployees();
        employeeBook.changeSalary("Сидоров А.В.", 15000);
        employeeBook.printEmployees();
        employeeBook.changeDepartament("Сидоров А.В.", 3);
        employeeBook.printEmployees();
        System.out.println();
        employeeBook.printEmployeeInDepartament();

    }

}