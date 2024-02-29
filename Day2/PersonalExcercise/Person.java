package Day2.PersonalExcercise;


import java.time.LocalDate;
import java.util.Scanner;

//Person class
public class Person {

       //Instance fields
       private String name;
       private int age;

       //Constructor
        public Person(String name, int age) {
             this.name = name;
             this.age = age;
        }

        //getters
       public String getName() {
             return name;
       }
       public int getAge() {
             return age;
       }
}

//Main class
 class Main {

       //main method
       public static void main(String[] args) {
            //Scanner class to get input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your first Name : ");
            String firstName = sc.nextLine();
            System.out.println("Please Enter your last Name : ");
            String lastName = sc.nextLine();
            System.out.println("Please Enter your Date of birth in the following order : ");
            System.out.println("Year (yyyy) : ");
            int year = sc.nextInt();
           System.out.println("Month (m) : ");
           int month = sc.nextInt();
           System.out.println("Day (d)");
           int day = sc.nextInt();
           sc.close();

           int currentYear = LocalDate.now().getYear();
           int birthYear = LocalDate.of(year, month, day).getYear();
           int age = currentYear - birthYear;

           Person person = new Person((firstName + " " + lastName), age);

           System.out.println("Name : " + person.getName() + " ---> Age : " + person.getAge());

       }
}
