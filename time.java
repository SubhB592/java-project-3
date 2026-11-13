
package worldclock;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    @SuppressWarnings("java:S1172")
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter country name: ");
            String country = sc.nextLine().trim().toLowerCase();

            Map<String, String> countries = new HashMap<>();

            countries.put("india", "Asia/Kolkata");
            countries.put("usa", "America/New_York");
            countries.put("uk", "Europe/London");
            countries.put("japan", "Asia/Tokyo");
            countries.put("china", "Asia/Shanghai");
            countries.put("australia", "Australia/Sydney");
            countries.put("canada", "America/Toronto");
            countries.put("germany", "Europe/Berlin");
            countries.put("france", "Europe/Paris");
            countries.put("uae", "Asia/Dubai");
            countries.put("singapore", "Asia/Singapore");
            countries.put("south korea", "Asia/Seoul");
            countries.put("brazil", "America/Sao_Paulo");
            countries.put("russia", "Europe/Moscow");
            countries.put("nepal", "Asia/Kathmandu");
            countries.put("bangladesh", "Asia/Dhaka");
            countries.put("pakistan", "Asia/Karachi");
            countries.put("thailand", "Asia/Bangkok");
            countries.put("indonesia", "Asia/Jakarta");
            countries.put("new zealand", "Pacific/Auckland");

            if (countries.containsKey(country)) {

                ZoneId zone = ZoneId.of(countries.get(country));

                ZonedDateTime time = ZonedDateTime.now(zone);

                DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("hh:mm:ss a");

                System.out.println("\n========== WORLD CLOCK ==========");
                System.out.println("Country: " + country.toUpperCase());
                System.out.println("Date: " + time.toLocalDate());
                System.out.println("Day: " + time.getDayOfWeek());
                System.out.println("Current Time: " + time.format(formatter));
                System.out.println("Time Zone: " + zone);
                System.out.println("=================================");

            } else {
                System.out.println("Country not found!");
                System.out.println("Please enter a supported country.");
            }
        }
    }
}
