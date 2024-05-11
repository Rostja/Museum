package Package;

import java.util.Calendar;
import java.util.Random;

public class Museum {
    public static void main(String[] args) {

        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int daysOfMonth = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0, i <= daysOfMonth, i++){
            int Reserved = generateRandomNumber(0,10);
            System.out.println( day + currentMonth + " : " + Reserved + " zarezervovanych listkov" );
        }


    }
    public static int generateRandomNumber(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1);
    }
}
