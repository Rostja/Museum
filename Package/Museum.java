package Package;

import java.util.Calendar;
import java.util.Random;

public class Museum {
    public static void main(String[] args) {

        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int daysOfMonth = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int day = currentDay; day <= daysOfMonth; day++){
            int Reserved = generateRandomNumber(0,10);
            System.out.print ( day + currentMonth + " : " + Reserved + " zarezervovanych listkov;  " );
            System.out.println(" Pocet volnych listkov : " + (10 - Reserved) );

        }


    }
    public static int generateRandomNumber(int min,int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1);
    }
}
