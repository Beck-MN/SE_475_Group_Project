/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._group_project;
/**
 *
 * @author cbchr
 */
public class Gate {
    private String gateNumber;
    private String status = "available";
    private Flight assignedFlight;

    public void assignFlight(Flight flight) {
        this.assignedFlight = flight;
        this.status = "occupied";
        System.out.println("Flight " + flight.getFlightNumber() + " assigned to gate " + gateNumber);
    }

    public void releaseFlight() {
        System.out.println("Flight " + assignedFlight.getFlightNumber() + " released from gate " + gateNumber);
        this.assignedFlight = null;
        this.status = "available";
    }   
}
