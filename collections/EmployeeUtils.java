package collections;

import java.time.LocalDate;

public class EmployeeUtils {

    public static Employee employee3(int ID, String name, LocalDate dob) {
        Employee emp2= new Employee(ID, name, dob);

//        System.out.println(emp2);
        return emp2;
    }

    public static Employee employee2() {
        Employee emp1= new Employee();
        emp1.name="Anurag";
        emp1.ID=02;
        emp1.dob= LocalDate.of(1995,7,3);
//        System.out.println(emp1);
        return emp1;
    }

    public static Employee employee1() {
        Employee emp= new Employee();

        emp.name="Rashmi";
        emp.ID=01;
        emp.dob=LocalDate.of(1996,8,5);
        return emp;
    }

    public static Employee employee4(int ID, String name, LocalDate dob){
        Employee emp4= new Employee(ID, name,dob);
        return emp4;

    }
}
