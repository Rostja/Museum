package Package;

import java.util.Random;

public class Museum {
    public static void main(String[] args) {

        for (int i = 0, i <= dayOfMonth, i++){
            int Reserved = generateRandomNumber(0,10);
        }


    }
    public static int generateRandomNumber(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1);
    }
}
