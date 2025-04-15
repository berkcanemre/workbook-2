package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Score input
        System.out.print("Please enter a game score (e.g., TeamA:TeamB|21:9): ");
        String input = scanner.nextLine().trim();

// Teams and scores
        String[] parts = input.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }

        String[] teamNames = parts[0].split(":");
        String[] teamScores = parts[1].split(":");

        if (teamNames.length != 2 || teamScores.length != 2) {
            System.out.println("Invalid team or score format.");
            return;
        }

        String teamA = teamNames[0];
        String teamB = teamNames[1];

        int scoreA = Integer.parseInt(teamScores[0]);
        int scoreB = Integer.parseInt(teamScores[1]);

//Winner
        if (scoreA > scoreB) {
            System.out.println("Winner: " + teamA);
        } else if (scoreB > scoreA) {
            System.out.println("Winner: " + teamB);
        } else {
            System.out.println("It's a tie!");
        }
    }
}