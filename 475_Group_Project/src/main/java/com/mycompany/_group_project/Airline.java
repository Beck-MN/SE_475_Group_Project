/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_8;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author cbchr
 */
public class Airline {
    private String airlineName;
    private String airlineCode;
    private List<Flight> flights = new ArrayList<>();

    public void manageFlights() {
        System.out.println("Managing flights for airline: " + airlineName);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
