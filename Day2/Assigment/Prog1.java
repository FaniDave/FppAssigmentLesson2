package Day2.Assigment;

//Prog1 class
public class Prog1 {

    //main method
    public static void main(String[] args) {

        //1 1. get a random number x in the range 1 ... 9 and compute π^x.
        int x = RandomNumbers.getRandomInt(1, 9);
        double resultX = Math.pow(Math.PI, x);
        System.out.println(resultX);

        //2. get a random number y in the range 3 ... 14 and compute y^π.
        int y = RandomNumbers.getRandomInt(3, 14);
        double resultY = Math.pow(y, Math.PI);
        System.out.println(resultY);


    }
}
