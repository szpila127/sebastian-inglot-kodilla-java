package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Flight {

    private Airport airport;
    public static Map<Airport, Set<Airport>> flights = new HashMap<>();
    public static Set<Airport> gdansk = new HashSet<>();
    public static Set<Airport> warsaw = new HashSet<>();
    public static Set<Airport> krakow = new HashSet<>();
    public static Set<Airport> katowice = new HashSet<>();
    public static Set<Airport> wroclaw = new HashSet<>();

    public Flight(Airport airport) {
        this.airport = airport;
    }

    public Airport getAirport() {
        return airport;
    }

    public static void fillFlights() {
        gdansk.add(Airport.WARSAW);
        gdansk.add(Airport.KRAKOW);
        gdansk.add(Airport.WROCLAW);

        warsaw.add(Airport.GDANSK);
        warsaw.add(Airport.KATOWICE);
        warsaw.add(Airport.WROCLAW);

        krakow.add(Airport.GDANSK);
        krakow.add(Airport.WROCLAW);

        katowice.add(Airport.WARSAW);
        katowice.add(Airport.KRAKOW);
        katowice.add(Airport.WROCLAW);

        wroclaw.add(Airport.WARSAW);
        wroclaw.add(Airport.KRAKOW);
        wroclaw.add(Airport.KATOWICE);

        flights.put(Airport.GDANSK, gdansk);
        flights.put(Airport.WARSAW, warsaw);
        flights.put(Airport.KRAKOW, krakow);
        flights.put(Airport.KATOWICE, katowice);
        flights.put(Airport.WROCLAW, wroclaw);
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
