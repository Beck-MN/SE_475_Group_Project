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
public class Runway {
    private String runwayId;
    private String status = "available";
    private Flight currentUsage;

    public void assignFlight(Flight flight) {
        this.currentUsage = flight;
        this.status = "in use";
        System.out.println("Runway " + runwayId + " assigned to flight " + flight.getFlightNumber());
    }

    public void releaseRunway() {
        System.out.println("Runway " + runwayId + " is now available.");
        this.currentUsage = null;
        this.status = "available";
    }   
}
