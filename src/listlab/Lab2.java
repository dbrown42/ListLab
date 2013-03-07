/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author Dallas
 */
import java.util.*;
public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("123", "CEO");
        Employee e2 = new Employee("456", "HR Supervisor");
        Employee e3 = new Employee("789", "District Manager");
    
    
        List<Employee> employees = new ArrayList<>();  

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
    
        for(Employee e:employees){
            System.out.println("Employee with ID #: " + e.getiD() + " is a ");
        }
    }
}
