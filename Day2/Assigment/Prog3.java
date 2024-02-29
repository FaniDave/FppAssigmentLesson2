package Day2.Assigment;

import java.util.Arrays;

//Prog3 class
public class Prog3 {

    //main method
    public static void main(String[] args) {
        String[] strArr = {"horse", "dog", "cat", "horse", "dog"};

        //String array before removing duplicates
        System.out.println(Arrays.toString(strArr));

        //Invoking the removeDups method to remove the duplicates and save the unique one in the "newStrArr" array
        String[] newStrArr = removeDups(strArr);
        System.out.println(Arrays.toString(newStrArr)); //the unique array

    }

    //removeDups method
    public static String[] removeDups(String[] theStringArr) {
        int myLastIndex = 0;

        // Loop through each element in the array
        for (int i = 0; i < theStringArr.length; i++) {
            boolean isDuplicateFound = false;
            for (int j = 0; j < i; j++) {
                if (theStringArr[i].equals(theStringArr[j])) {
                    isDuplicateFound = true;
                    break;
                }
            }
            if (!isDuplicateFound) {
                theStringArr[myLastIndex++] = theStringArr[i];
            }
        }

        // Create a new array to hold the unique elements
        String[] finalArr = Arrays.copyOf(theStringArr, myLastIndex);
        return finalArr;
    }

}
