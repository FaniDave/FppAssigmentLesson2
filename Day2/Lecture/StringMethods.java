package Day2.Lecture;

public class StringMethods {

    //main method
    public static void main(String[] args) {
//        String name = "Robert";
//
//        //SubString method
//        String nickName = name.substring(0, 3);
//        String whole = name.substring(0, name.length());
//        String first = name.substring(0, 1);
//        String empty = name.substring(0, 0);
//
//        System.out.println("*".repeat(50));
//
//        //indexOf method
//        int postOfT = name.indexOf('t');
//        int posOfSubStr = name.indexOf("bert");
//
//        System.out.println("*".repeat(50));
//
//        //startsWith method
//        boolean resutl1 = name.startsWith("Rob");
//        boolean result2 = name.startsWith("R");
//        boolean result3 = name.startsWith("bert");
//
//        //Concatenation
//        String space = " ";
//        String lastName = "Stevens";
//        String fullName = name + space + lastName;
//
//        //equals
//        boolean equal = name.equals("Robert");
//        boolean refEqual = (name == "Robert");
//        String newName = new String("Robert");
//        refEqual = (newName == "Robert");
//        refEqual = (newName.equals("Robert"));


        //compareTo method
//        String bob = "Bob";
//        String charles = "Charles";
//        System.out.println(charles.compareTo(charles));

//        String [] arr = new String[] {
//                 "Faniel", "Sirak", "Heran", "Luliya", "Petros", "Diana", "Maria"
//        };
//
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr.length; j++) {
//                if(arr[i].compareTo(arr[j]) < 0) {
//                    String holder = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = holder;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        String str1 = "Hello";
//        String str2 = "Hello";
//
//        String str3 = new String("Hello");
//        String str4 = new String ("Hello");
//
//        String str5 = str4;
//
//
//
//        System.out.println(str1 == str2); //true
//        System.out.println(str2 == str3); //false
//        System.out.println(str3 == str4); //false
//        System.out.println(str4 == str5); //true
//
//        System.out.println(str2 == str3);
//
//        str5 = new String("hii");
//
//        System.out.println(str5);
//        System.out.println(str4);

//        String str = "Hello,strings can be fun. They have many uses.";
//        String[] strArr = str.split(",| |\\. |\\.");
//        System.out.println(Arrays.toString(strArr));

//        int[] smallPrimes = {2, 3, 5, 7, 11};
//        int[] copySmallPrimes = new int[5];
//        System.arraycopy(smallPrimes, 0, copySmallPrimes, 0, copySmallPrimes.length);
//        System.out.println("Copy Small Primes : " + Arrays.toString(copySmallPrimes));
//
//
//        System.out.println("*".repeat(50));
//
//
//        int[] smallPrimesOne = {2, 3, 5, 7, 11};
//        int[] luckyNums = {350, 400, 150, 200, 250};
//        System.arraycopy(smallPrimesOne, 1, luckyNums, 3, 2);
//        System.out.println("Copy Lucky Numbers : " + Arrays.toString(luckyNums));
//
//        System.out.println("*".repeat(50));
//
//
//        String[] sourceOne = {"Aa", "Bb", "Cc"};
//        String[] sourceTwo = {"Dd", "Ee", "Ff", "Gg"};
//        String[] result = new String[7];
//
//        System.arraycopy(sourceOne, 0, result, 0, sourceOne.length);
//        System.arraycopy(sourceTwo, 0, result, sourceOne.length, sourceTwo.length);
//        System.out.println(Arrays.toString(result));
//
//
//        int[] arr = {5, 9, 3, 9, 4};
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));

        String[][] teams = {
                {"Joe", "Bob", "Frank", "Steve"},
                {"Jon", "Tom", "David", "Ralph"},
                {"Tim", "Bev", "Susan", "Dennis"}
        };

        System.out.println(teams.length);//3 (rows number)
        System.out.println(teams[1].length); // 4 (column number)
        System.out.println(teams[1][2]); //David


    }


}
