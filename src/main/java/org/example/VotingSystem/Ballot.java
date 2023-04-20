package org.example.VotingSystem;

import java.util.ArrayList;
import java.util.List;

public class Ballot {
    // Define the list of candidates
    private List<String> candidates = new ArrayList<>();

    public void setCandidates(List<String> candidates) {
        this.candidates = candidates;
    }

    public List<String> getCandidates() {
        return candidates;
    }

    @Override
    public String toString() {

        return "BallotBox{" +
                "candidates=" + candidates +
                '}';
    }
}
