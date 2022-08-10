package collections;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static collections.EmployeeUtils.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> inmap= new HashMap<>();

        inmap.put(1,2);
        inmap.put(3,4);
        inmap.put(5,6);
        inmap.put(7,8);

//        System.out.println(inmap);

        Map<Integer,String> inmap1= new HashMap<Integer, String>();

        inmap1.put(1,"Rashmi");
        inmap1.put(2,"Anurag");
        inmap1.put(3,"Shivu");

//        System.out.println(inmap1);

        Employee e1= employee1();
        Employee e2= employee2();
        Employee e3= employee3(3,"Shivu", LocalDate.now());
        Employee e4= employee4(4, "Manju", LocalDate.now());

//        Map<Integer,String> empdetails= new HashMap<>();
        Map<Integer,Employee> details= new HashMap<>();
        details.put(e1.getID(),e1);
        details.put(e2.getID(),e2);
        details.put(e3.getID(),e3);
        details.put(e4.getID(),e4);



        Set<Map.Entry<Integer, Employee>> names1= details.entrySet();

        for (Map.Entry converted: names1
             ) {
//           Integer id= (Integer) new Integer(int i);
//            System.out.println(converted);
            System.out.println("Employee_ID: " + converted.getKey() + " ,DOB: " +converted.getValue());
        }

//        empdetails.put(e1.ID, e1.name);
//        empdetails.put(e2.ID, e2.name);
//        empdetails.put(e3.ID,e3.name);

//        Set<Map.Entry<Integer, String>> names= empdetails.entrySet();

//        for (Map.Entry converted: names
//             ) {
//            Integer key = (Integer) converted.getKey();
//            String value = (String) converted.getValue();
////            System.out.println(converted);
//            System.out.println("key: " + key + " ,value: " +value.toUpperCase());
//        }

//        Iterator<Map.Entry<Integer, String>> entryIterator = empdetails.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<Integer, String> check = entryIterator.next();
//            Integer key = (Integer) check.getKey();
//            String value = (String) check.getValue();
//            System.out.println("key: " + key + " ,value: " + value.toLowerCase());
//
//        }



//        System.out.println(empdetails);
    }
}
