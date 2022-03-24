import java.time.*;
import java.util.*;


public class DateTimeDemo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the recharge amount...");
		int n = sc.nextInt();
		LocalDate date = LocalDate.now();
		LocalDateTime dtime = LocalDateTime.now();
		LocalTime time = LocalTime.now(); 
				System.out.println("The time now is "+time);
				System.out.println("Recharge successful on "+ LocalDate.now());
		if(n<=100) {
			System.out.println("This recharge is valid till "+dtime.plusMonths(1));
		}
		else if (n>=200 && n<300){
			System.out.println("This recharge is valid till "+dtime.plusMonths(2));
		}

		else {
			System.out.println("This recharge is valid till "+dtime.plusMonths(4));
		}

		ZonedDateTime currentZone = ZonedDateTime.now();
    		System.out.println("the current zone is "+currentZone.getZone());

		Set<String> allZones = ZoneId.getAvailableZoneIds();
		LocalDateTime dt = LocalDateTime.now();

		// Create a List using the set of zones and sort it.
		List<String> zoneList = new ArrayList<String>(allZones);
		Collections.sort(zoneList);

		for (String s : zoneList) {
    		ZoneId zone = ZoneId.of(s); 
		System.out.println(zone);
			}
	}
 
}