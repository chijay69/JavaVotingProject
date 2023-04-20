package org.example.VotingSystem;

import java.util.Scanner;

public class Candidates {
    public String[] count() {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Candidate for the ballot: ");

        // read candidate input
        int candidateNo = scanner.nextInt();

        // create array of string type the size of candidate number
        String[] fullNames = new String[candidateNo];

        for (int i = 0; i < candidateNo; i++) {
            System.out.println((i+1)+ ". Enter Candidate name "+ ": ");
            String candidate = scanner.nextLine();
            fullNames[i] = candidate;
        }
        
        var length = fullNames.length;
        System.out.println("Size of Array: "+length);
        return fullNames;
    }
}
