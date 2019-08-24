package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightDatabase {

    public static Set<Airport> gdansk = new HashSet<>();
    public static Set<Airport> warsaw = new HashSet<>();
    public static Set<Airport> krakow = new HashSet<>();
    public static Set<Airport> katowice = new HashSet<>();
    public static Set<Airport> wroclaw = new HashSet<>();
    public static Set<Airport> gotartowice = new HashSet<>();
    public static Map<Airport, Set<Airport>> flights = new HashMap<>();

    public static void createFlights() {
        gdansk.add(Airport.WARSAW);
        gdansk.add(Airport.KATOWICE);
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

        gotartowice.add(Airport.WARSAW);

        flights.put(Airport.GDANSK, gdansk);
        flights.put(Airport.WARSAW, warsaw);
        flights.put(Airport.KRAKOW, krakow);
        flights.put(Airport.KATOWICE, katowice);
        flights.put(Airport.WROCLAW, wroclaw);
        flights.put(Airport.GOTARTOWICE, gotartowice);
    }
}
