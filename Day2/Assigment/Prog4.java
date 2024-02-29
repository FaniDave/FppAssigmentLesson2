package Day2.Assigment;

//Prog4 class
public class Prog4 {

    //main method
    public static void main(String[] args) {
        //Creating float variables
        float varOne = 1.27f;
        float varTwo = 3.881f;
        float varThree = 9.6f;

        //1. Sum of floats as an integer (casting)
        int sumCasting = (int) (varOne + varTwo + varThree);
        System.out.println(sumCasting); //14

        //2. Sum of floats as an integer (rounding)
        int sumRounding = Math.round(varOne + varTwo + varThree);
        System.out.println(sumRounding); //15
    }
}
