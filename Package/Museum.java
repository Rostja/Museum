package Package;

import java.util.Random;

public class Museum {
    public static void main(String[] args) {

        int Reserved = generateRandomNumber(0,10);
        System.out.println(Reserved);
        System.out.println(Reserved);
        System.out.println(Reserved);
    }
    public static int generateRandomNumber(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1);
    }
}
