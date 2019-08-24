package com.kodilla.good.patterns.challenges.flights;

public class App {

    public static void main(String[] args) {

        FlightDatabase.createFlights();
        FlightSeeker.getAirportDepartures(Airport.GDANSK);
        FlightSeeker.getAirportArrivals(Airport.KATOWICE);
    }
}
