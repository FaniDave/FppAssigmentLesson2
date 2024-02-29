package Day2.Assigment;

//Prog6 class
public class Prog6 {

    //main method
    public static void main(String[] args) {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minimumElement = min(arr);
        System.out.println(minimumElement);
    }

    //min method
    public static int min(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) minimum = arr[i];
        }
        return minimum;
    }
}
