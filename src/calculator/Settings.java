package calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Sets the colors and decimal precision through the panel
 *
 * @author pavlos papadoniokolakis 
 */
public class Settings extends JPanel {

    // Variables declaration                  
    public javax.swing.JComboBox<String> backgroundColor;
    private javax.swing.JComboBox<String> fontType;
    private javax.swing.JComboBox<String> foregroundColor;

    private javax.swing.JComboBox<String> keypadColor;
    private javax.swing.JButton okBtn;
    private javax.swing.JComboBox<String> precision;

    // End of variables declaration   
    
    
    /**
     * default constructor
     */
    public Settings() {

        super();
        initComponents();

    }

    /**
     * the components of the panel
     */
    private void initComponents() {

        getBackgroundColors();
        getForegroundColors();
        getkeypadColors();
        getFonts();
        getPrecision();

        okBtn = new javax.swing.JButton();
        okBtn.setText("OK");

        JPanel mainPanel = new JPanel();

        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(Box.createVerticalStrut(58));

        JPanel panel1 = new JPanel();
        panel1.add(new javax.swing.JLabel("Background Color"));
        panel1.add(Box.createHorizontalStrut(20));
        panel1.add(backgroundColor);
        panel1.add(Box.createHorizontalStrut(20));
        mainPanel.add(panel1);
        mainPanel.add(Box.createVerticalStrut(58));

        JPanel panel2 = new JPanel();
        panel2.add(new javax.swing.JLabel("Foreground Color"));
        panel2.add(Box.createHorizontalStrut(22));
        panel2.add(foregroundColor);
        panel2.add(Box.createHorizontalStrut(10));
        mainPanel.add(panel2);
        mainPanel.add(Box.createVerticalStrut(58));

        JPanel panel3 = new JPanel();
        panel3.add(new javax.swing.JLabel("Keypad Color"));
        panel3.add(Box.createHorizontalStrut(44));
        panel3.add(keypadColor);
        panel3.add(Box.createHorizontalStrut(10));
        mainPanel.add(panel3);
        mainPanel.add(Box.createVerticalStrut(58));

        JPanel panel4 = new JPanel();
        panel4.add(new javax.swing.JLabel("Decimal Precision"));
        panel4.add(Box.createHorizontalStrut(20));
        panel4.add(precision);
        panel4.add(Box.createHorizontalStrut(10));
        mainPanel.add(panel4);
        mainPanel.add(Box.createVerticalStrut(58));

        JPanel panel5 = new JPanel();
        panel5.add(new javax.swing.JLabel("Font Type"));
        panel5.add(Box.createHorizontalStrut(4));
        panel5.add(fontType);
        panel5.add(Box.createHorizontalStrut(9));
        mainPanel.add(panel5);
        mainPanel.add(Box.createVerticalStrut(58));

        setSize(new java.awt.Dimension(200, 350));
        BorderLayout l = new BorderLayout();
        setLayout(l);

        add(mainPanel, BorderLayout.CENTER);

    }

    /**
     *
     * @return the BackgroundColors
     */
    public JComboBox getBackgroundColors() {

        backgroundColor = new javax.swing.JComboBox<>(new String[]{"Select", "Black ", "Blue",
            "Cyan", "DarkGray",
            "Gray", "Green", "Yellow",
            "Magenta", "Pink",
            "Red", "White"});
        backgroundColor.setPrototypeDisplayValue("-------------");

        backgroundColor.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundColorActionPerformed();
            }
        });
        return backgroundColor;

    }

    /**
     *
     * @return ForegroundColors
     */
    public JComboBox getForegroundColors() {
        foregroundColor = new javax.swing.JComboBox<>(new String[]{"Select", "Black ", "Blue",
            "Cyan", "DarkGray",
            "Gray", "Green", "Yellow",
            "Magenta", "Pink",
            "Red", "White"});
        foregroundColor.setPrototypeDisplayValue("-------------");

        foregroundColor.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foregroundColorActionPerformed();
            }
        });

        return foregroundColor;
    }

    /**
     *
     * @return keypadColors
     */
    public JComboBox getkeypadColors() {

        keypadColor = new javax.swing.JComboBox<>(new String[]{"Select", "Black ", "Blue",
            "Cyan", "DarkGray",
            "Gray", "Green", "Yellow",
            "Magenta", "Pink",
            "Red", "White"});
        keypadColor.setPrototypeDisplayValue("-------------");

        keypadColor.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadColorActionPerformed();
            }
        });

        return keypadColor;
    }

    /**
     *
     * @return the preferred decimal precision
     */
    public JComboBox getPrecision() {
        precision = new javax.swing.JComboBox<>(new String[]{"Select", "1 Decimal Place", "2 Decimal Places",
            "3 Decimal Places", "4 Decimal Places",
            "5 Decimal Places", "6 Decimal Places"});
        precision.setPrototypeDisplayValue("-------------");

        precision.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precisionActionPerformed();
            }
        });
        return precision;

    }

    /**
     *
     * @return the fonts
     */
    public JComboBox getFonts() {

        fontType = new javax.swing.JComboBox<>();
        fontType.setPrototypeDisplayValue("----------------------");

        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = e.getAllFonts();
        fontType.addItem("Select");
        for (int i = 0; i < fonts.length; i++) {

            fontType.addItem(fonts[i].getName());

        }

        fontType.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontTypeActionPerformed();
            }
        });

        return fontType;
    }

    /**
     * sets the preferred color
     *
     * @return true if backgroundColor ActionPerformed 
     */
    public boolean backgroundColorActionPerformed() {

        if (backgroundColor.getSelectedIndex() == 0) {

            return false;
        }

        SettingsDetails.setColor(backgroundColor.getSelectedItem().toString());

        return true;
    }

    /**
     *sets the preferred color
     * 
     * @return true if foregroundColor ActionPerformed
     */
    public boolean foregroundColorActionPerformed() {
        if (foregroundColor.getSelectedItem().equals("Select")) {

            return false;

        }

        SettingsDetails.setColor(foregroundColor.getSelectedItem().toString());

        return true;
    }

    /**
     * sets the preferred color
     *
     * @return true if keypadColor ActionPerformed 
     */
    public boolean keypadColorActionPerformed() {
        if (keypadColor.getSelectedItem().equals("Select")) {

            return false;

        }
        SettingsDetails.setColor(keypadColor.getSelectedItem().toString());

        return true;
    }

    /**
     * sets the preferred decimal precision
     *
     * @return true if  precision ActionPerformed 
     */
    public Object precisionActionPerformed() {
        if (precision.getSelectedItem().equals("Select")) {
            SettingsDetails.setPrecision(0);

        }

        SettingsDetails.setPrecision(precision.getSelectedIndex());
        return precision.getSelectedItem();
    }

    /**
     * sets the preferred fontType
     *
     * @return true if  precision ActionPerformed
     */
    public boolean fontTypeActionPerformed() {

        if (fontType.getSelectedItem().equals("Select")) {
            return false;

        }

        SettingsDetails.setType(fontType.getSelectedItem().toString());
        return true;

    }

}
