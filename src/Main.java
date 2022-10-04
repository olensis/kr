import java.io.OptionalDataException;
import java.util.*;

public class Main {
    private static double findSumWithoutUsingStream(Employee employee) {
        double sum = findSumWithoutUsingStream(employee);
        Employee[] empl = new Employee[5];
        return (double) sum / empl.length;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25000);
        empl[1] = new Employee("Петров Петр Петрович", 2, 30000);
        empl[2] = new Employee("Сидоров Иван Петрович", 3, 35000);
        empl[3] = new Employee("Фролов Александр Александрович", 4, 27500);
        empl[4] = new Employee("Садовникова Екатерина Владимировна", 5, 36000);
        for (Employee e : empl) {
            System.out.println(e);
            int salaryOfEmployee = empl[1].getSalary();
            int salaryOfEmployee1 = empl[0].getSalary();
            int salaryOfEmployee2 = empl[2].getSalary();
            int salaryOfEmployee3 = empl[3].getSalary();
            int salaryOfEmployee4 = empl[4].getSalary();
            int sum = salaryOfEmployee1 + salaryOfEmployee2 + salaryOfEmployee3 + salaryOfEmployee4 + salaryOfEmployee;
            System.out.println("Сумма затрат в месяц " + sum);

            Arrays.sort(empl, Comparator.comparing(Employee::getSalary));
            Employee maxSalary = empl[empl.length - 1];
            System.out.println("Самая большая зп у " + maxSalary);
            Arrays.sort(empl, Comparator.comparing(Employee::getSalary));
            Employee minSalary = empl[0];
            System.out.println("Самая невысокая зп у" + empl[0]);
            double findSumWithoutUsingStream = sum / empl.length;
            System.out.println(" средняя зп" + findSumWithoutUsingStream);
            String fullName = empl[0].getFIO();
            String fullName1 = empl[1].getFIO();
            String fullName2 = empl[2].getFIO();
            String fullName3 = empl[3].getFIO();
            String fullName4 = empl[4].getFIO();
            System.out.println("ФИО сотрудников " + fullName + "," + fullName1 + "," + fullName2 + "," + fullName3 + "," + fullName4);
        }

    }
}