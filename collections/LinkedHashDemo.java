package collections;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.SplittableRandom;

import static collections.EmployeeUtils.*;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> slh= new LinkedHashSet<>();
        slh.add("Rashmi");
        slh.add("Anurag");
        slh.add("Shivu");
        slh.add("Rashmi");
        slh.add("Shivu");

        for(String s: slh){
            System.out.println(s);
        }

        LinkedHashSet<Integer> ilh= new LinkedHashSet<>();
        ilh.add(1);
        ilh.add(3);
        ilh.add(2);
        ilh.add(3);
        ilh.add(2);
        ilh.add(3);
        ilh.add(4);

        for(Integer i:ilh){
            System.out.println(i);
        }

        Employee e1= employee1();
        Employee e2= employee2();
        Employee e3= employee3(3,"Shivu", LocalDate.of(1995,8,8));


        LinkedHashSet<Employee> em= new LinkedHashSet<>();
        em.add(e1);
        em.add(e2);
        em.add(e3);

        for(Employee e:em){
            System.out.println(e);
        }



    }
}
