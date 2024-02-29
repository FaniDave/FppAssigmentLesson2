package Day2.Lecture;

public class BitwiseOperator {
       //main method
       public static void main(String[] args) {
        int value = 3;
        int complementedValue = ~3;
        System.out.println("Value : " + value + " Complemented Value : " + complementedValue);
        System.out.println("Binary of the Value : " + Integer.toBinaryString(value));
        System.out.println("Binary of the Complemented value : " + Integer.toBinaryString(complementedValue));

              System.out.println("*".repeat(50));

           int num = 12;
           int leftShift = num << 2;
           System.out.println("Num : " + num + " left shift by 2 : " + leftShift);
           System.out.println("Binary of the Num : " + Integer.toBinaryString(num));
           System.out.println("Binary of the left shifted : " + Integer.toBinaryString(leftShift));

           System.out.println("*".repeat(50));

           int numm = 12;
           int rightShift = num >> 2;
           System.out.println("Num : " + numm + " left shift by 2 : " + rightShift);
           System.out.println("Binary of the Num : " + Integer.toBinaryString(numm));
           System.out.println("Binary of the right shifted : " + Integer.toBinaryString(leftShift));

           double x = 9.997;
           int nx = (int) Math.round(x);
           System.out.println(nx);


    }
}
