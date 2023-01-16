import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame.setLayout(new GridLayout(5,1));
        myFrame.setTitle("Drawdivision");

        JLabel name = new JLabel("DRAWDIVISION");
        myFrame.add(name);
        name.setForeground(new Color(82,73,37));

        JButton instagram = new JButton("Instagram");
        myFrame.add(instagram);
        instagram.setForeground(new Color(82,73,37));
        instagram.setBackground(new Color(219,214,192));

        instagram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Next1 next1 = new Next1();
                next1.instagram();
            }
        });

        JButton artstation = new JButton("ArtStation");
        myFrame.add(artstation);
        artstation.setForeground(new Color(82,73,37));
        artstation.setBackground(new Color(219,214,192));

        instagram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Next1 next1 = new Next1();
                next1.artstation();
            }
        });

        JButton youtube = new JButton("Youtube");
        myFrame.add(youtube);
        youtube.setForeground(new Color(82,73,37));
        youtube.setBackground(new Color(219,214,192));

        youtube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Next1 next1 = new Next1();
                next1.Youtube();
            }
        });

        JButton linkedin = new JButton("Linkedin");
        myFrame.add(linkedin);
        linkedin.setForeground(new Color(82,73,37));
        linkedin.setBackground(new Color(219,214,192));

        linkedin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Next1 next1 = new Next1();
                next1.linkedin();
            }
        });

        ImageIcon image = new ImageIcon("water (2).png");
        myFrame.setIconImage(image.getImage());


    }
}