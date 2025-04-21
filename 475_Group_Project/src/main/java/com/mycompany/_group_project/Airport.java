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
public class Airport {
    private String name;
    private String location;
    private List<Terminal> terminals = new ArrayList<>();
    private List<Runway> runways = new ArrayList<>();

    public Airport(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void manageTerminals() {
        System.out.println("Managing terminals at airport: " + name);
    }

    public void manageRunways() {
        System.out.println("Managing runways at airport: " + name);
    }

    public void addTerminal(Terminal terminal) {
        terminals.add(terminal);
    }

    public void addRunway(Runway runway) {
        runways.add(runway);
    }   
}
