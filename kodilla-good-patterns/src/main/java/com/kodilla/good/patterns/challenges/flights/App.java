package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class App {

    public static void main(String[] args) {

        FlightDatabase.createFlights();
        Set<Airport> airportDeparture = Flight.getSetOfAirportDepartures(Airport.GDANSK);
        Set<Airport> airportArrivals = Flight.getSetOfAirportArrivals(Airport.KATOWICE);

        System.out.println(airportDeparture);
        System.out.println(airportArrivals);
    }
}
