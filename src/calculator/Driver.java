package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Driver class contains main()
 * @author pavlos papadoniokolakis
 */

public class Driver {

    /**
     * main method 
     * @param arguments the arguments
     */
    public static void main(String[] arguments) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
        }

        UIManager.put("swing.boldMetal", Boolean.TRUE);
        displayGui();

    }

    /**
     * displays the window
     */
    public static void displayGui() {
        Calculator card1 = new Calculator();
        Settings card2 = new Settings();

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame window = new JFrame("Calculator");
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(270, 380);
        window.setLayout(new BorderLayout());
        window.setResizable(false);

        final CardLayout cardLayout = new CardLayout();
        final JPanel cardPanel = new JPanel(cardLayout);

        cardPanel.add(card1, "Calculator");
        cardPanel.add(card2, "Settings");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        JButton okBtn = new JButton("Ok");
        okBtn.setVisible(false);

        JButton settBtn = new JButton("Settings");

        buttonPanel.add(okBtn);
        buttonPanel.add(settBtn);

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cardLayout.show(cardPanel, "Calculator");
                okBtn.setVisible(false);
                settBtn.setVisible(true);
                if (card2.backgroundColorActionPerformed()) {

                    Colors.changeBackGroundColors(SettingsDetails.getColorName().toLowerCase());
                }
                if (card2.foregroundColorActionPerformed()) {
                    Colors.changeForeGroundColors(SettingsDetails.getColorName().toLowerCase());
                }
                if (card2.keypadColorActionPerformed()) {
                    Colors.changeKeypadColors(SettingsDetails.getColorName().toLowerCase());
                }
                if(card2.fontTypeActionPerformed()){
                    FontType.changeFont(SettingsDetails.getType());
                }
            }
        });

        settBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cardLayout.show(cardPanel, "Settings");
                settBtn.setVisible(false);
                okBtn.setVisible(true);
            }
        });

        window.add(cardPanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.SOUTH);
        window.setVisible(true);
    }
}
