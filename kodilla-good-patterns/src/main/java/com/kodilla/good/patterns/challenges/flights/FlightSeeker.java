package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSeeker {

    public static void getAirportsDepartures2(Airport departure, Airport arrival) {

        Set<Airport> result = getAirportDepartures(departure);
        List<Airport> listAirport = new ArrayList<>(result);

        if (result.contains(arrival)) {
            System.out.println(departure + " -> " + arrival);
        } else {
            for (int i = 0; i < listAirport.size(); i++) {
                int finalI = i;
                Set<Airport> airports = (FlightDatabase.flights.entrySet().stream()
                        .filter(port -> port.getKey() == listAirport.get(finalI))
                        .flatMap(flight -> flight.getValue().stream())
                        .collect(Collectors.toSet()));

                if (!airports.contains(arrival)) {
                    System.out.println("NO CENNECTIONS!");
                    return;
                } else if (airports.contains(arrival)) {
                    System.out.println(departure + " -> " + listAirport.get(finalI) + " -> " + arrival);
                }
            }
        }
    }

    public static Set<Airport> getAirportArrivals(Airport airport) {

        Set<Airport> result = FlightDatabase.flights.entrySet().stream()
                .filter(port -> port.getValue().contains(airport))
                .map(flight -> flight.getKey())
                .collect(Collectors.toSet());

        System.out.println(result + " -> " + airport);
        return result;
    }

    public static Set<Airport> getAirportDepartures(Airport airport) {

        Set<Airport> result = FlightDatabase.flights.entrySet().stream()
                .filter(port -> port.getKey() == airport)
                .flatMap(flight -> flight.getValue().stream())
                .collect(Collectors.toSet());

        System.out.println(airport + " -> " + result);
        return result;

//        Set<Airport> result = new HashSet<>();
//        if (airport == Airport.GDANSK) {
//            result = gdansk;
//        } else if (airport == Airport.WARSAW) {
//            result = warsaw;
//        } else if (airport == Airport.KRAKOW) {
//            result = krakow;
//        } else if (airport == Airport.KATOWICE) {
//            result = katowice;
//        } else if (airport == Airport.WROCLAW) {
//            result = wroclaw;
//        }
//        return result;
    }
}