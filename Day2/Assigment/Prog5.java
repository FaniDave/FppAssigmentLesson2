package Day2.Assigment;

import java.util.Arrays;

//Prog5 class
public class Prog5 {

    //main method
    public static void main(String[] args) {
        Prog5 prog5 = new Prog5(); //We create prog5 to get call combine() (instance method)
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        int[] combinedArr = prog5.combine(a, b);
        System.out.println(Arrays.toString(combinedArr));
    }

    //combine method (Instance method)
    public int[] combine(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        //Iterating a to fill c
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            c[j] = a[i];
        }

        //Iterating b to fill c
        for (int i = 0, j = a.length; i < b.length; i++, j++) {
            c[j] = b[i];
        }
        return c;
    }
}
