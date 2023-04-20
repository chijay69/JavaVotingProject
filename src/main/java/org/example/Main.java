package org.example;

import org.example.VotingSystem.Ballot;
import org.example.VotingSystem.Candidates;
import org.example.VotingSystem.CountVotes;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // create object of Candidates
        Candidates candidate = new Candidates();
        // create object of Ballot
        Ballot ballot = new Ballot();

        // Call candidate method count
        var candidates = candidate.count();

        CountVotes countVotes = new CountVotes();
        // call setCandidates
        ballot.setCandidates(List.of(candidates));

        System.out.println(ballot);

        // get list of candidates
        var candidates1 = ballot.getCandidates();
        // call count method and pass list argument
        countVotes.count(candidates1);
    }
}