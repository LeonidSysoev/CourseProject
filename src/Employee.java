import java.util.Objects;

public class Employee {
    private String fullName;
    private int departament;
    private float salary;
    public static int counter = 1;
    private int id;

    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = counter;
        counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Персонал - " +
                "Ф.И.О.: " + fullName +
                ", отдел: " + departament +
                ", зарплата: " + salary +
                ", табельный номер: " + id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName) && Objects.equals(departament, employee.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departament, salary, id);
    }
}