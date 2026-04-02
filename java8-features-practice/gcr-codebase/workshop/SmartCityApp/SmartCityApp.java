package workshop.SmartCityApp;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCityApp {

	public static void main(String[] args) {

		List<TransportService> services = Arrays.asList(new BusService(true, "Delhi", "Manali", "08:00"),
				new MetroService(true, "Delhi", "Noida", "07:30"), new TaxiService(false, "Delhi", "Kasol", "09:00"));

		services.stream().filter(TransportService::isAvailable).forEach(TransportService::printServiceDetails);

		FareCalculator busFare = distance -> distance * 2.5;

		double distance = GeoUtils.calculateDistance("Delhi", "Manali");
		System.out.println("Bus Fare: " + busFare.calculateFare(distance));

	}
}
