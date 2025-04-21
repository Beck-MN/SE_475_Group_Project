/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_8;

/**
 *
 * @author cbchr
 */
public class Flight {
    private String flightNumber;
    private Airline airline;
    private String origin;
    private String destination;
    private String status;
    private String departureTime;
    private String arrivalTime;

    public Flight(String flightNumber, Airline airline, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.status = "Scheduled";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Flight " + flightNumber + " status updated to: " + status);
    }

    public void assignGate(Gate gate) {
        gate.assignFlight(this);
    }

    public void assignRunway(Runway runway) {
        runway.assignFlight(this);
    }

    public String getFlightNumber() {
        return flightNumber;
    }   
}
