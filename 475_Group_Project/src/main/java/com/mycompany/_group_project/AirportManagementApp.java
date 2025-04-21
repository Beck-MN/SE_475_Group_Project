/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._group_project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author cbchr
 */
public class AirportManagementApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Airport Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JLabel header = new JLabel("Flight Scheduler", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(header, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JTextField flightNumberField = new JTextField();
        JTextField originField = new JTextField();
        JTextField destinationField = new JTextField();
        JTextField airlineField = new JTextField();

        panel.add(new JLabel("Flight Number:"));
        panel.add(flightNumberField);
        panel.add(new JLabel("Origin:"));
        panel.add(originField);
        panel.add(new JLabel("Destination:"));
        panel.add(destinationField);
        panel.add(new JLabel("Airline Name:"));
        panel.add(airlineField);

        JButton scheduleButton = new JButton("Schedule Flight");
        panel.add(scheduleButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);

        scheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNum = flightNumberField.getText();
                String origin = originField.getText();
                String dest = destinationField.getText();
                String airlineName = airlineField.getText();

                Airline airline = new Airline();
                Flight flight = new Flight(flightNum, airline, origin, dest);
                airline.addFlight(flight);

                outputArea.append("Flight " + flightNum + " scheduled from " + origin + " to " + dest + " for airline " + airlineName + "\n");
            }
        });

        frame.setVisible(true);
    }
}  

