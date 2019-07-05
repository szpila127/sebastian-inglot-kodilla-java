package com.kodilla.exception.test;

import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) {

        Flight berlin = new Flight("Warsaw", "Berlin");
        Flight amsterdam = new Flight("Warsaw", "Amsterdam");
        FlightSeeker flightSeeker = new FlightSeeker();

        try {
            flightSeeker.findFlight(berlin);

        } catch (RouteNotFoundException e) {
            System.out.println("Can't find that flight, try another.");
        }
    }
}
