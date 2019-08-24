package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSeeker {

    public static void getAirportsConnections(Airport departure, Airport arrival) {

    }

    public static void getAirportArrivals(Airport airport) {

        Set<Airport> result = FlightDatabase.flights.entrySet().stream()
                .filter(port -> port.getValue().contains(airport))
                .map(flight -> flight.getKey())
                .collect(Collectors.toSet());

        System.out.println("Arrivals at " + airport + " from: " + result);
    }

    public static void getAirportDepartures(Airport airport) {

        Set<Airport> result = FlightDatabase.flights.entrySet().stream()
                .filter(port -> port.getKey() == airport)
                .flatMap(flight -> flight.getValue().stream())
                .collect(Collectors.toSet());

        System.out.println("Departures from: " + airport + " to: " + result);

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
