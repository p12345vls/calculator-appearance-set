package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class Calculator defines a simple GUI calculator
 *
 * @author pavlos papadoniokolakis
 */
public class Calculator extends JPanel {

// Variables declaration
    public static JTextField display;
    public static JPanel centerPanel = new JPanel();
    public static JButton pointbtn, equalsBtn, deleteBtn,
            numberBtn, perCentBtn, zeroBtn, minusBtn, plusBtn, multipBtn,
            devideBtn, Btn_1, Btn_2, Btn_3, Btn_4, Btn_5, Btn_6,
            Btn_7, Btn_8, Btn_9;

    public static String[] operands = {".", "-", "+", "*", "÷"};
    public static String displayNumbers, displayResult, operator1,
            operator2, operand;
    private boolean operandsIsClicked = false;
//end of variables declaration

    
    /**
     * default constructor
     */
    public Calculator() {
        super();
        displayNumbers = "";
        displayResult = "0";
        operator1 = "0";
        operator2 = "";
        operand = "";
        operandsIsClicked = false;
        display = new JTextField();

        pointbtn = new JButton(".");
        equalsBtn = new JButton("=");
        deleteBtn = new JButton("C");

        perCentBtn = new JButton("%");
        zeroBtn = new JButton("0");
        minusBtn = new JButton("-");
        plusBtn = new JButton("+");
        multipBtn = new JButton("x");
        devideBtn = new JButton("÷");
        Btn_1 = new JButton("1");
        Btn_2 = new JButton("1");
        Btn_3 = new JButton("1");
        Btn_4 = new JButton("1");
        Btn_5 = new JButton("1");
        Btn_6 = new JButton("1");
        Btn_7 = new JButton("1");
        Btn_8 = new JButton("1");
        Btn_9 = new JButton("1");
        zeroBtn = new JButton("0");

        setLayout(new BorderLayout());
        add(components(), BorderLayout.CENTER);

    }

    /**
     * creates the components
     *
     * @return the panel with all components
     */
    private JComponent components() {

        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.add(display(), BorderLayout.NORTH);

        centerPanel = new JPanel(new GridLayout(6, 3));
       
        addNumButtons(centerPanel);

        addOperands(centerPanel);

        mainPanel.setBorder(
                BorderFactory.createMatteBorder(10, 10, 10, 10, Color.LIGHT_GRAY));

        mainPanel.add(centerPanel);

        return mainPanel;
    }

    /**
     * creates the display
     *
     * @return the display
     */
    private JTextField display() {
        Settings s = new Settings();
        Font font1 = new Font("Monospaced", Font.LAYOUT_LEFT_TO_RIGHT, 22);

        display = new JTextField(12);
        display.setText("0");

        display.setPreferredSize(new Dimension(0, 50));
        display.setBackground(new Color(160, 160, 160));//==============================================
        display.setForeground(Color.white);
        display.setFont(font1);
        

        return display;
    }

    /**
     * creates the buttons with the operants
     *
     * @param centerPanel
     * @param mainPanel
     */
    private void addOperands(JPanel centerPanel) {

        OperatorListener opListen = new OperatorListener();
        NumbersListener numlisten = new NumbersListener();

        pointbtn = new JButton(operands[0]);
        pointbtn.setFont(new Font("Arial", Font.PLAIN, 20));
        pointbtn.setBackground(new Color(255, 130, 0));
        pointbtn.setForeground(Color.BLACK);
        pointbtn.addActionListener(numlisten);
       

        minusBtn = new JButton(operands[1]);
        minusBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        minusBtn.setBackground(new Color(255, 130, 0));
        minusBtn.setForeground(Color.BLACK);
        minusBtn.addActionListener(opListen);

        plusBtn = new JButton(operands[2]);
        plusBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        plusBtn.setBackground(new Color(255, 130, 0));
        plusBtn.setForeground(Color.BLACK);
        plusBtn.addActionListener(opListen);

        multipBtn = new JButton(operands[3]);
        multipBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        multipBtn.setBackground(new Color(255, 130, 0));
        multipBtn.setForeground(Color.BLACK);
        multipBtn.addActionListener(opListen);

        devideBtn = new JButton(operands[4]);
        devideBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        devideBtn.setBackground(new Color(255, 130, 0));
        devideBtn.setForeground(Color.BLACK);
        devideBtn.addActionListener(opListen);

        equalsBtn.setPreferredSize(new Dimension(30, 43));
        equalsBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        perCentBtn.setPreferredSize(new Dimension(30, 43));
        equalsBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        deleteBtn.setPreferredSize(new Dimension(30, 43));
        deleteBtn.setFont(new Font("Arial", Font.PLAIN, 20));

        equalsBtn.addActionListener(numlisten);
        deleteBtn.addActionListener(numlisten);
        perCentBtn.addActionListener(numlisten);

        equalsBtn.setBackground(new Color(255, 130, 0));
        equalsBtn.setForeground(Color.BLACK);
        deleteBtn.setBackground(new Color(255, 130, 0));
        deleteBtn.setForeground(Color.BLACK);
        perCentBtn.setBackground(new Color(255, 130, 0));
        perCentBtn.setForeground(Color.BLACK);

        centerPanel.add(pointbtn);
        centerPanel.add(minusBtn);
        centerPanel.add(plusBtn);
        centerPanel.add(multipBtn);
        centerPanel.add(devideBtn);
        centerPanel.add(equalsBtn);
        centerPanel.add(deleteBtn);
        centerPanel.add(perCentBtn);

    }

    /**
     * creates the number buttons
     *
     * @param centerPanel
     */
    private void addNumButtons(JPanel centerPanel) {

        NumbersListener numlisten = new NumbersListener();

        Btn_1 = new JButton("1");
        Btn_1.setForeground(Color.black);
        Btn_1.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_1.setPreferredSize(new Dimension(120, 30));
        Btn_1.addActionListener(numlisten);

        Btn_2 = new JButton("2");
        Btn_2.setForeground(Color.black);
        Btn_2.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_2.setPreferredSize(new Dimension(120, 30));
        Btn_2.addActionListener(numlisten);

        Btn_3 = new JButton("3");
        Btn_3.setForeground(Color.black);
        Btn_3.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_3.setPreferredSize(new Dimension(120, 30));
        Btn_3.addActionListener(numlisten);

        Btn_4 = new JButton("4");
        Btn_4.setForeground(Color.black);
        Btn_4.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_4.setPreferredSize(new Dimension(120, 30));
        Btn_4.addActionListener(numlisten);

        Btn_5 = new JButton("5");
        Btn_5.setForeground(Color.black);
        Btn_5.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_5.setPreferredSize(new Dimension(120, 30));
        Btn_5.addActionListener(numlisten);

        Btn_6 = new JButton("6");
        Btn_6.setForeground(Color.black);
        Btn_6.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_6.setPreferredSize(new Dimension(120, 30));
        Btn_6.addActionListener(numlisten);

        Btn_7 = new JButton("7");
        Btn_7.setForeground(Color.black);
        Btn_7.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_7.setPreferredSize(new Dimension(120, 30));
        Btn_7.addActionListener(numlisten);

        Btn_8 = new JButton("8");
        Btn_8.setForeground(Color.black);
        Btn_8.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_8.setPreferredSize(new Dimension(120, 30));
        Btn_8.addActionListener(numlisten);

        Btn_9 = new JButton("9");
        Btn_9.setForeground(Color.black);
        Btn_9.setFont(new Font("Arial", Font.PLAIN, 20));
        Btn_9.setPreferredSize(new Dimension(120, 30));
        Btn_9.addActionListener(numlisten);

        zeroBtn = new JButton("0");
        zeroBtn.setForeground(Color.black);
        zeroBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        zeroBtn.setPreferredSize(new Dimension(120, 30));
        zeroBtn.addActionListener(numlisten);

        centerPanel.add(Btn_1);
        centerPanel.add(Btn_2);
        centerPanel.add(Btn_3);
        centerPanel.add(Btn_4);
        centerPanel.add(Btn_5);
        centerPanel.add(Btn_6);
        centerPanel.add(Btn_7);
        centerPanel.add(Btn_8);
        centerPanel.add(Btn_9);
        centerPanel.add(zeroBtn);

    }

    /**
     * private class listener for operators
     */
    private class OperatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();

            for (String op : operands) {
                if (action.equals(op)) {
                    display.setText(op);
                    displayNumbers = "";
                    operandsIsClicked = true;
                }
            }
            operand = display.getText();
        }

    }

    /**
     * private class listener for numbers
     */
    private class NumbersListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();
            for (Integer i = 0; i < 10; i++) {

                if (action.equals(i.toString())) {

                    if (displayNumbers.length() < 18) {
                        displayNumbers += action;
                        display.setText(displayNumbers);
                    }
                }

            }
            if (action.equals(".")) {
                displayNumbers += action;
                display.setText(displayNumbers);
            }

            checkConditions(action);

        }

        /**
         * checks conditions to perform operation
         *
         * @param action
         */
        public void checkConditions(String action) {

            if (action.equals("%")) {
                calculatePercent(operator1, operator2);

            }
            if (action.equals("=")) {

                calculate(operator1, operator2);

                displayNumbers = "";
                operator2 = "0";
                operator1 = "0";
                operandsIsClicked = false;

            }

            if (operandsIsClicked) {
                operator2 = display.getText();

            } else {
                operator1 = display.getText();
            }

            if (action.equals("C")) {
                reset();
            }

        }

        /**
         * resets the calculator to 0
         */
        public void reset() {
            display.setText("0");
            operator1 = "0";
            operator2 = "";
            operandsIsClicked = false;
            displayNumbers = displayResult = "";

        }

        /**
         * 
         * @param operator1 the left operator
         * @param operator2 the right operator
         */
        public void calculatePercent(String operator1, String operator2) {
            Double result = 0.0;
            try {
                Double i = Double.parseDouble(operator1);
                Double ii = Double.parseDouble(operator2);

                if (operator2.equals("")) {
                    result = i / 100;

                } else if (operator2.equals("0")) {
                    result = i;

                } else {
                    switch (operand) {
                        case "+":
                            result = ((i + (i * ii) / 100));
                            break;
                        case "-":
                            result = ((i - (i * ii) / 100));
                            break;
                        case "*":
                            result = ((i * (i * ii) / 100));
                            break;
                        case "÷":
                            result = ((i / (i * ii) * 100));
                            break;
                        default:
                            break;
                    }

                }
            } catch (NumberFormatException e) {

            }

            reset();
            display(result);
        }

        /**
         * calculates operations according to the operator
         *
         * @param operator1 the left operator
         * @param operator2 the right operator
         */
        public Double calculate(String operator1, String operator2) {
            Double result = 0.0;
            try {
                Double firstNumber = Double.parseDouble(operator1);
                Double secondNumber = Double.parseDouble(operator2);

                switch (operand) {
                    case "*":
                        result = (firstNumber * secondNumber);
                        break;
                    case "+":
                        result = (firstNumber + secondNumber);
                        break;
                    case "-":
                        result = (firstNumber - secondNumber);
                        break;
                    case "÷":
                        result = (firstNumber / secondNumber);
                        break;
                    default:
                        break;
                }

                display(result);

            } catch (NumberFormatException e) {

            }
            return result;

        }

        /**
         * displays the result
         *
         * @param result
         */
        public void display(Double result) {

            if (SettingsDetails.getPrecision() == 0) {
                displayResult = String.valueOf(result);

            } else if (SettingsDetails.getPrecision() >= 1) {
                String f = String.format("%." + SettingsDetails.getPrecision() + "f", result);
                displayResult = f;
            }

            if (displayResult.length() > 18) {

                display.setText(displayResult.substring(0, 18));

            } else {

                display.setText(displayResult);

            }

        }
    }

}
