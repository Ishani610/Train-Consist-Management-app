package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // List to store bogies (dynamic initialization)
    static List<String> bogies = new ArrayList<>();

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Train consist initialized (empty list already created)

        // Display initial bogie count
        displaySummary();
    }

    // Method to display consist summary
    public static void displaySummary() {
        System.out.println("Initial Bogie Count: " + bogies.size());
    }
}