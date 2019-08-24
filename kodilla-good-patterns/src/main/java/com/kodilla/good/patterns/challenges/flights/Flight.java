package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Flight {

    public static Map<Airport, Set<Airport>> flights = new HashMap<>();

    private Airport airport;

    public Flight(Airport airport) {
        this.airport = airport;
    }

    public Airport getAirport() {
        return airport;
    }

    public static Set<Airport> getSetOfAirportArrivals(Airport airport) {
        return flights.entrySet().stream()
                .filter(port -> port.getValue().contains(airport))
                .map(flight -> flight.getKey())
                .collect(Collectors.toSet());
    }

    public static Set<Airport> getSetOfAirportDepartures(Airport airport) {

        return flights.entrySet().stream()
                .filter(port -> port.getKey() == airport)
                .flatMap(flight -> flight.getValue().stream())
                .collect(Collectors.toSet());

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
