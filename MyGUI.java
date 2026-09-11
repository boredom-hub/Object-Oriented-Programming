import javax.swing.*;
import java.awt.Font;

public class MyGUI {

    static int firstNumber = 0;
    static int secondNumber = 0;
    static boolean enteringSecondNumber = false;

    public static void main(String[] args) {
        JFrame design = new JFrame("Calculator");
        design.setLayout(null);

        // Display 
        JLabel label1 = new JLabel("0");
            label1.setBounds(10, 10, 380, 100);
            label1.setFont(new Font("SansSerif", Font.BOLD, 48));
            label1.setHorizontalAlignment(SwingConstants.RIGHT);


        // Digit buttons 
        JButton button0 = new JButton("0");
        button0.setBounds(10, 425, 95, 55);

        JButton button1 = new JButton("1");
        button1.setBounds(10, 365, 95, 55);

        JButton button2 = new JButton("2");
        button2.setBounds(105, 365, 95, 55);

        JButton button3 = new JButton("3");
        button3.setBounds(200, 365, 95, 55);

        JButton button4 = new JButton("4");
        button4.setBounds(10, 305, 95, 55);

        JButton button5 = new JButton("5");
        button5.setBounds(105, 305, 95, 55);

        JButton button6 = new JButton("6");
        button6.setBounds(200, 305, 95, 55);

        JButton button7 = new JButton("7");
        button7.setBounds(10, 245, 95, 55);

        JButton button8 = new JButton("8");
        button8.setBounds(105, 245, 95, 55);

        JButton button9 = new JButton("9");
        button9.setBounds(200, 245, 95, 55);


        // operator buttons
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(295, 305, 95, 55);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(295, 365, 95, 55);

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(295, 245, 95, 55);


        // action listeners
        button0.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 0;
                label1.setText("0");
            } else {
                secondNumber = 0;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button1.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 1;
                label1.setText("1");
            } else {
                secondNumber = 1;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button2.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 2;
                label1.setText("2");
            } else {
                secondNumber = 2;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button3.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 3;
                label1.setText("3");
            } else {
                secondNumber = 3;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button4.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 4;
                label1.setText("4");
            } else {
                secondNumber = 4;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button5.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 5;
                label1.setText("5");
            } else {
                secondNumber = 5;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button6.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 6;
                label1.setText("6");
            } else {
                secondNumber = 6;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button7.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 7;
                label1.setText("7");
            } else {
                secondNumber = 7;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button8.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 8;
                label1.setText("8");
            } else {
                secondNumber = 8;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        button9.addActionListener(e -> {
            if (!enteringSecondNumber) {
                firstNumber = 9;
                label1.setText("9");
            } else {
                secondNumber = 9;
                label1.setText(firstNumber + " + " + secondNumber);
            }
        });

        buttonPlus.addActionListener(e -> {
            enteringSecondNumber = true;
            label1.setText(firstNumber + " + ");
        });

        buttonEquals.addActionListener(e -> {
            int result = firstNumber + secondNumber;
            label1.setText(String.valueOf(result));
            enteringSecondNumber = false;
        });

        buttonClear.addActionListener(e -> {
            firstNumber = 0;
            secondNumber = 0;
            enteringSecondNumber = false;
            label1.setText("0");
        });

        // every frame
        design.add(label1);
        design.add(button0);
        design.add(button1);
        design.add(button2);
        design.add(button3);
        design.add(button4);
        design.add(button5);
        design.add(button6);
        design.add(button7);
        design.add(button8);
        design.add(button9);
        design.add(buttonPlus);
        design.add(buttonEquals);
        design.add(buttonClear);

        design.setSize(410, 540);
        design.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        design.setLocationRelativeTo(null);
        design.setVisible(true);
    }
}