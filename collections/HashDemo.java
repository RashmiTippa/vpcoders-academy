package collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static collections.EmployeeUtils.*;

public class HashDemo {

    public static void main(String[] args) {


//        Set<String> s1= new HashSet<>();
//        s1.add("Rashmi");
//        s1.add("Anurag");
//        s1.add("Shivu");
//
//        for (String s: s1){
//            System.out.println(s);
//        }
//
//        Set<Integer> s2= new HashSet<>();
//        s2.add(1);
//        s2.add(2);
//        s2.add(3);
//        s2.add(2);
//        s2.add(1);
//        for (Integer i: s2){
//            System.out.println(i);
//        }

        Employee e1= employee1();
        Employee e2= employee2();
        Employee e3= employee3(3,"Shivu", LocalDate.of(1995,8,8));

        Set<Employee> hs = new HashSet<Employee>();
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);


        for (Employee e : hs) {
            System.out.println(e);
        }


    }
}
