package src.tictactoe;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tictactoe extends JFrame implements ActionListener{
    private int turn = 1;
    private JButton A1, A2, A3, B1, B2, B3, C1, C2, C3;
    private ImageIcon icon = new ImageIcon("ttt_icon.png");

    public Tictactoe() {
    // set everything up
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setIconImage(icon.getImage());
        Font font = new Font("Arial", Font.PLAIN, 36);
        JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3,3));
        // set buttons 
        
            A1 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(0,0,100,100); }};
                A1.addActionListener(this);
                panel.add(A1);
            A2 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(100, 0, 100, 100);}};
                A2.addActionListener(this);
                panel.add(A2);
            A3 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(200, 0, 100, 100);}};
                A3.addActionListener(this);
                panel.add(A3);
            B1 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(0, 100, 100, 100);}};
                B1.addActionListener(this);
                panel.add(B1);
            B2 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(100, 100, 100, 100);}};
                B2.addActionListener(this);
                panel.add(B2);
            B3 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(200, 100, 100, 100);}};
                B3.addActionListener(this);
                panel.add(B3);
            C1 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(0, 200, 100, 100);}};
                C1.addActionListener(this);
                panel.add(C1);
            C2 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(100, 200, 100, 100);}};
                C2.addActionListener(this);
                panel.add(C2);
            C3 = new JButton() {{setBackground(Color.WHITE); setFont(font); setBounds(200, 200, 100, 100);}};
                C3.addActionListener(this);
                panel.add(C3);

        panel.setVisible(true);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tictactoe();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();
        if (buttonClicked.getText() != "X" && buttonClicked.getText() !=  "O") {
            if (turn == 1) {
                buttonClicked.setText("X");
                turn = turn - 1;
            }
            else {
                buttonClicked.setText("O");
                turn = turn + 1;
            }}
        if (
            A1.getText() == "X" && A2.getText() == "X" && A3.getText() == "X" ||
            B1.getText() == "X" && B2.getText() == "X" && B3.getText() == "X" ||
            C1.getText() == "X" && C2.getText() == "X" && C3.getText() == "X" ||
            A1.getText() == "X" && B1.getText() == "X" && C1.getText() == "X" ||
            A2.getText() == "X" && B2.getText() == "X" && C2.getText() == "X" ||
            A3.getText() == "X" && B3.getText() == "X" && C3.getText() == "X" ||
            A1.getText() == "X" && B2.getText() == "X" && C3.getText() == "X" ||
            A3.getText() == "X" && B2.getText() == "X" && C1.getText() == "X"
            ) {
                JOptionPane.showMessageDialog(this, "Player X wins!");
                dispose();
                new Tictactoe();
            }
        else if (
            A1.getText() == "O" && A2.getText() == "O" && A3.getText() == "O" ||
            B1.getText() == "O" && B2.getText() == "O" && B3.getText() == "O" ||
            C1.getText() == "O" && C2.getText() == "O" && C3.getText() == "O" ||
            A1.getText() == "O" && B1.getText() == "O" && C1.getText() == "O" ||
            A2.getText() == "O" && B2.getText() == "O" && C2.getText() == "O" ||
            A3.getText() == "O" && B3.getText() == "O" && C3.getText() == "O" ||
            A1.getText() == "O" && B2.getText() == "O" && C3.getText() == "O" ||
            A3.getText() == "O" && B2.getText() == "O" && C1.getText() == "O"
            ) {
                    JOptionPane.showMessageDialog(this, "Player O wins!");
                    dispose();
                    new Tictactoe();
                }
        else if (
            A1.getText() != "" &&
            A2.getText() != "" &&
            A3.getText() != "" &&
            B1.getText() != "" &&
            B2.getText() != "" &&
            B3.getText() != "" &&
            C1.getText() != "" &&
            C2.getText() != "" &&
            C3.getText() != ""
            ) {
                    JOptionPane.showMessageDialog(this, "Draw!");
                    dispose();
                    new Tictactoe();
                }
    }
}
