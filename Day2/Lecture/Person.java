package Day2.Lecture;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

        //Instance fields
        private String name;
        private LocalDate dob;

        //Constructor
        public Person(String name, LocalDate dob) {
             this.name = name;
             this.dob = dob;
        }

        //getters

    public String getName() {
        return name;
    }
    public LocalDate getDob() {
             return dob;
    }
}

//Main class
class Main {

       //main method
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Your Name");
           String name = sc.nextLine();
           System.out.println("Enter Your year of birth (yyyy): ");
           int year = sc.nextInt();
           System.out.println("Enter your month of birth (mm): ");
           int month = sc.nextInt();
           System.out.println("Enter your birth day: ");
           int day = sc.nextInt();
           sc.close(); //Closing the Scanner

           Person person = new Person(name, LocalDate.of(year, month, day));
           System.out.println(person.getName());
           System.out.println(person.getDob());
       }
}
