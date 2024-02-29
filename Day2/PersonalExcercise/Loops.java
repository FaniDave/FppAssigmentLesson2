package Day2.PersonalExcercise;

import java.util.Scanner;

public class Loops {

    //main method
    public static void main(String[] args) {
//        int goal = 500;
//        int balance = 100;
//        int payment = 50;
//        int years = 0;
//        int interestRate = 4;
//
//        while (balance < goal) {
//            balance += payment;
//            double interest = balance * interestRate / 100;
//            balance += interest;
//            years++;
//        }
//
//        System.out.println(years);
//        double balance = 0;
//        double interestRate = 4;
//        int years = 0;
//        String input = "";
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Please Enter a payment : ");
//            double payment = sc.nextDouble();
//            balance += payment;
//            double interest = balance * (interestRate / 100);
//            balance += interest;
//            years++;
//            System.out.println("Your balance is : " + balance);
//            System.out.println("Please Make other Payment : (Y/N)");
//            input = sc.next();
//        } while (input.equals("Y"));

//        Scanner sc = new Scanner(System.in);
//        while(true) {
//             System.out.println("Please Enter a positive value");
//             int num = sc.nextInt();
//             if(num <= 0) break;
//        }
//        System.out.println("We need only positive number");
//        System.out.println("Byyyyyyyyyyyy");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter your name : ");
//        String name = sc.nextLine();
//        int counter = 0;
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) == 'e') counter++;
//        }
//        sc.close();
//        System.out.println(counter);

//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name from (0 - 9)");
        int val = sc.nextInt();
        System.out.println();
        switch(val) {
            case 2, 4, 6, 8:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;
        }
    }
}
