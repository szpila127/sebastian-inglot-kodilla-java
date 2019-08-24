package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class App {

    public static void main(String[] args) {

        FlightDatabase.createFlights();

        Airport gdansk = Airport.GDANSK;
        Airport warsaw = Airport.WARSAW;
        Airport krakow = Airport.KRAKOW;
        Airport katowice = Airport.KATOWICE;
        Airport wroclaw = Airport.WROCLAW;
        Airport gotartowice = Airport.GOTARTOWICE;

        FlightSeeker.getAirportDepartures(wroclaw);
        System.out.println();

        FlightSeeker.getAirportArrivals(gdansk);
        System.out.println();

        FlightSeeker.getAirportsDepartures2(warsaw, gotartowice);
    }
}
