/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualDetails05;

/**
 *
 * @author Ramu Vallapurapu
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 5: Ramu Vallapurapu");
        Person person = new Person("Ramu");
        Student student = new Student("Krishna");
        Employee employee = new Employee("Raja");
        Faculty faculty = new Faculty("Charles Hoot");
        Staff staff = new Staff("Dr Deva");

        System.out.println(person.toString());
        System.out.println("-------------------------");
        System.out.println(student.toString());
        System.out.println("-------------------------");
        System.out.println(employee.toString());
        System.out.println("-------------------------");
        System.out.println(faculty.toString());
        System.out.println("-------------------------");
        System.out.println(staff.toString());
        System.out.println("-------------------------");

    }

}
