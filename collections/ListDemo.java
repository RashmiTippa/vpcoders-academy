package collections;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static collections.EmployeeUtils.*;

public class ListDemo {
    public static void main(String[] args) {

        Employee e1= employee1();
        Employee e2= employee2();
        Employee e3= employee3(3, "Shivu", LocalDate.of(1995,8,8));

        LinkedList empList= new LinkedList();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

//        System.out.println(empList);

        empList.toArray();
        System.out.println(empList);
    }
}
