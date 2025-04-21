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
public class Terminal {
    private String terminalId;
    private List<Gate> gates = new ArrayList<>();
    private boolean isOpen = true;

    public void manageGates() {
        System.out.println("Managing gates in terminal: " + terminalId);
    }

    public void setStatus(boolean status) {
        this.isOpen = status;
        System.out.println("Terminal " + terminalId + " is now " + (status ? "open" : "closed"));
    }

    public void addGate(Gate gate) {
        gates.add(gate);
    }  
}
