/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._group_project;

/**
 *
 * @author cbchr
 */
public class Aircraft {
    private String registrationNumber;
    private String model;
    private int capacity;

    public void assignToFlight(Flight flight) {
        System.out.println("Aircraft " + registrationNumber + " assigned to flight " + flight.getFlightNumber());
    }
}
