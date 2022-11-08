import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random randomNum = new Random();

        int roll1 = 1 + randomNum.nextInt(6); // roll a number between 1 to 6
        int roll2 = 1 + randomNum.nextInt(6);

        int total = roll1+roll2;

        System.out.println("Roll 1 is " + roll1);
        System.out.println("Roll 2 is " + roll2);
        System.out.println("Your number is " + total);

    }
}
