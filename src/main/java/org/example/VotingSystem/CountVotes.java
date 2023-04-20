package org.example.VotingSystem;

import java.util.*;

public class CountVotes {
    private final Map<String, Integer> voteCount = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    public void count(List<String> candidates) {
        // Initialize the vote count for each candidate to zero
        for (String candidate : candidates) {
            voteCount.put(candidate, 0);
        }

        // Get the number of voters
        int numVoters;

        do {
            System.out.print("Enter the number of voters: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            numVoters = scanner.nextInt();
        } while (numVoters < 1);

        // Get the votes from each voter
        for (int i = 1; i <= numVoters; i++) {
            System.out.println("\nVoter #" + i);
            System.out.println("Please enter the number of your preferred candidate:");
            for (int j = 0; j < candidates.size(); j++) {
                System.out.println((j+1) + ". " + candidates.get(j));
            }
            int choice;
            do {
                System.out.print("Your choice: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and " + candidates.size());
                    scanner.next();
                }
                choice = scanner.nextInt();
            } while (choice < 1 || choice > candidates.size());
            voteCount.put(candidates.get(choice-1), voteCount.get(candidates.get(choice-1))+1);
        }
        // Display the final vote count
        System.out.println("\nFinal vote count:");
        for (String candidate : candidates) {
            System.out.println(candidate + ": " + voteCount.get(candidate));
        }
    }
}