package org.example.votingSystem;

import javax.swing.*;
import java.awt.*;

public class VotingSystem extends JFrame {
    public VotingSystem(){
        setBounds(0,0, 1600, 700);

        JLabel l1 = new JLabel("Welcome to");
        l1.setFont(new Font("Tahoma", Font.BOLD, 50));
//        l1.setLayout(null);
        l1.setBounds(150,230,300, 100);
        add(l1);

        JLabel l2 = new JLabel("online voting system");
        l2.setFont(new Font("Tahoma", Font.BOLD, 50));
//        l1.setLayout(null);
        l2.setBounds(50,300,700, 100);
        add(l2);

        setVisible(true);
        setLayout(null);
    }

//    main class
    public static void main(String[] args) {
        new VotingSystem();
    }
}
