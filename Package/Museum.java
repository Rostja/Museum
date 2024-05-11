package Package;

import java.util.Calendar;
import java.util.Random;

public class Museum {
    public static void main(String[] args) {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Přičtení 1, protože měsíce jsou indexovány od 0
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int daysOfMonth = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        int totalTickets = 0;
        int totalReservedTickets = 0;

        int totalReservedTicketsChild = 0;
        int totalReservedTicketsAdult = 0;
        int totalReservedTicketsSenior = 0;
        int totalReservedTicketsStudent = 0;

        for (int day = currentDay; day <= daysOfMonth; day++) {
            int  Reserved = generateRandomNumber(0, 10);
            totalReservedTickets += Reserved;
            totalTickets += 10;
            double percentageOfDay = (((double) Reserved / 10) * 100);
            System.out.print(day + "/" + currentMonth + " : " + Reserved + " zarezervovanych listkov;  ");
            System.out.print(" Pocet volnych listkov : " + (10 - Reserved) + "  ");
            System.out.println(" Percentualne vytazenie na den : " + percentageOfDay + " %");
        }

        double percentageOfMonth = (((double) totalReservedTickets / totalTickets) * 100);
        System.out.println("Percentualne vytazenie za mesiac : " + percentageOfMonth + " %");
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}