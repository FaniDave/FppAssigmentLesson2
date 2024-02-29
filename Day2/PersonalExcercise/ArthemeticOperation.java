package Day2.PersonalExcercise;

public class ArthemeticOperation {

    //main method
    public static void main(String[] args) {
//          //Arithmetic Operations (+ - / * %)
//            int a = -5, b = 2;
//           //Addition
//           System.out.println(a + b);
//
//           //Subtraction
//           System.out.println(a - b);
//
//        //Multiplication
//        System.out.println(a * b);
//        //Division
//        System.out.println(a/b);
//        //Modulus
////        if(a < 0) a *= -1;
////        if(b < 0) b *= -1;
//        System.out.println(a % b); //Error answer (-1)
//         //Another way of modulus
//          System.out.println(Math.floorMod(a, b)); // -5 % 2 == 0
//
//        //Division by zero
////        int x = 90; //Arthemetic exeption
////        float y = 10; //Nan (Not a number)
////        double z = 15; //Nan (Not a number)
////        byte c = 24; ////Arthemetic exeption
////        long d = 98; //Arthemetic exeption
////        short e = 45; //Arthemetic exeption
////        System.out.println(y/0);
//
//        //Increment and Decrement
//         System.out.println(++a);
//         a++;
//        System.out.println(a);
//
//        int age = 25;
//
//        String name = (age >= 25) ? "Over25 Team" : "Under 25 Team";
//        System.out.println(name);
//
//        char gg = '1';
//        char hh = ++gg;
//        System.out.println(hh);

//         System.out.println(~3);
//
//         System.out.println(Math.PI); //
//         System.out.println(Math.pow(3, 2)); //9
//         System.out.println(Math.sqrt(25)); //25
//
//          double x = 9.97;
//          int xx = (int) Math.round(x);
//
//          int y = 130;
//          byte yy = (byte) y;
//
//        System.out.println(3 % 2 + 4);
//
//        int a = 5;
//        int b = 6;
//
//        System.out.println(++a + b--);

//       String h = "Hello World";
//       System.out.println(h.charAt(5));
//       System.out.println(h.substring(1, 7));
//        System.out.println(h.indexOf('c'));
//        System.out.println(h.startsWith("Hell"));
//        System.out.println(h.indexOf("or"));
//
//        System.out.println(h.equals("hello World"));

        String strLiteral = "Hello";
        String strLiteralOne = "Hello";
        String strObject = new String("Hello");
        String strObjectOne = new String("Hello");
        String strObjectTwo = strObjectOne;
        System.out.println(strObjectOne == strObjectTwo);
   }


}
