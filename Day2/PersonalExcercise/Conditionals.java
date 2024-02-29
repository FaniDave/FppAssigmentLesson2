package Day2.PersonalExcercise;

public class Conditionals {

    //main method
    public static void main(String[] args) {
        int sale = 100;
        int target = 110;
        int bonus = 0;

        if (sale >= target * 2) {
            bonus = 100;
        } else {
            if (sale > target) {
                bonus = 50;
            } else {
                bonus = 0;
            }
        }
        System.out.println(bonus);
    }
}
