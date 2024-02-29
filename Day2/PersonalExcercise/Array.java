package Day2.PersonalExcercise;

import java.util.Arrays;

public class Array {

    //main method
    public static void main(String[] args) {
        //split(delimiter) splits a string and changes to an array
//         String str = "Hello World this is Faniel";
//         String[] strArr = str.split(" ");
//         System.out.println(Arrays.toString(strArr));
//
//         String strOne = "Hello,Strings can be fun. They have many uses.";
//         String[] strOneArr = strOne.split(",| |\\.");
//         System.out.println(Arrays.toString(strOneArr));

//        int [] arr = new int[2];
////        arr = {1, 2}; //Compiler Error
//          arr = new int[] {1, 2};

//          int [] arr = {3, 9, 4, 7, 1, 0, 3};
//          int [] arrCopy = {2, 7, 3, 5, 0};
//
//          System.arraycopy(arr, 2, arrCopy, 0, 3);
//          System.out.println(Arrays.toString(arrCopy));
//
//          Arrays.sort(arrCopy);
//
//        System.out.println(Arrays.toString(arrCopy));

//        String[] arr = {"Faniel", "Asmina", "Sirak", "Erena", "Heran"};
//        for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr.length; j++) {
//                 if(arr[i].compareTo(arr[j]) < 0) {
//                     String holder = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = holder;
//                 }
//             }
//        }
//        System.out.println(Arrays.toString(arr));

//        String[] arr = {"Faniel", "Asmina", "Sirak", "Erena", "Heran"};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int[] arrOne = {5, 1, 4, 2, 3};
//        Arrays.sort(arrOne);
//        System.out.println(Arrays.toString(arrOne));

        String[][] names = {
                {"Faniel", "Asmina", "Maria"},
                {"Heran", "Diana", "Luliya"},
                {"Dawit", "Weini", "Petros"}
        };

        for (String[] name : names) {
            System.out.println(Arrays.toString(name));
        }

        for (String[] name : names) {
            Arrays.sort(name);
        }

        System.out.println("*".repeat(50));
        for (String[] name : names) {
            System.out.println(Arrays.toString(name));
        }
    }
}
