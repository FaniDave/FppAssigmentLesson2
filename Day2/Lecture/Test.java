package Day2.Lecture;

public class Test {

    static String s;

         //main method
         public static void main(String[] args) {
//             float x = 2.3456F;
//             float y = 5.4193F;
//             double x1 = 2.3456;
//             double y1 = 5.4193;
//
//             System.out.println(x * y);
//             System.out.println(x1*y1);
//             System.out.println((x * y) == (x1*y1));
//             System.out.println(Math.round(5.987));
////             System.out.println((2+3) == 5);
//
//             float a = 0.7f;
//             float b = 0.9f;
//             float x2 = a + 0.1f;
//             float y2 = b - 0.1f;
//             System.out.println(x2 == y2);

//             float f = 1.34524535324f;
//             System.out.println(f);

             char c = 'A';
             int uniCodeValue = (int) c;
             String hexVal = Integer.toHexString(uniCodeValue);
             System.out.println(hexVal);
//
//             System.out.println("Peace \u270C");
//             System.out.println("Fuel Pump \u26FD" );
//
//             System.out.println("After waving, \"Hello\" ");
//             System.out.println("Use \"\\t\" to produce tab");

//             char a = '\ud835\udd6b';
//             System.out.println(a);

             System.out.println(Double.SIZE);
             System.out.println(Integer.MIN_VALUE);
             System.out.println(Float.MAX_VALUE);
             System.out.println(Long.MAX_VALUE);

             System.out.println("He said \"Byy\"");

             String name = "Faniel";
              char e = 'e';
              int counter = 0;
              for(int i = 0; i < name.length(); i++) {
                  if(name.charAt(i) == e) counter++;
              }
              System.out.println(counter);
//             int k = 0;
//              int m = k++;
//              System.out.println(k);
//              System.out.println(m);
//
//               int l = ++k;
//               System.out.println(l);
//
//               boolean condition1 = (5==4); //false
//               boolean condition2 = 3 < 9; //true
//               boolean resultOr = condition1 || condition2; //ture
//               boolean resultAnd = condition1 && condition2; //false
//               boolean resultNot = !condition1; //true
//
//             if(s == null || s.length() ==0) System.out.println("String is empty");
//
//             if(s == null | s.length() == 0) System.out.println("String is Empty");
         }
}
