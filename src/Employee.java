import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
public class Employee {
    public int[] getSalary;
    private String FIO;
    private int department;
    private int salary;
    private static int Counter;
    private static AtomicInteger COUNTER = new AtomicInteger(1);
    private final int id;

    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.id = ++Counter;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + FIO + " department: " + department + " salary: " + salary;
    }

    public int getid() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getSum() {
        return this.getSum();
    }

    public void SetDepartment(int department) {
        this.department = department;
    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }






}
