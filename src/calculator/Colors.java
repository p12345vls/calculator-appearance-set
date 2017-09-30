package calculator;

import java.awt.Color;

/**
 * Changes the colors determined by the user
 *
 * @author pavlos papadoniokolakis
 */
public class Colors extends Calculator {

    /**
     * calls the ColorNames class to convert the string name to Color object
     *
     * @param colorName the name of the color
     */
    public static void changeBackGroundColors(String colorName) {

        backGroundcolors(ColorNames.stringToColor(colorName));

    }

    /**
     * changes the backGroundcolors
     *
     * @param preferedColor the name of the color
     */
    public static void backGroundcolors(Color preferedColor) {

        display.setBackground(preferedColor);
        centerPanel.setBackground(preferedColor);

    }

    /**
     * calls the ColorNames class to convert the string name to Color object
     *
     * @param colorName the name of the color
     */
    public static void changeForeGroundColors(String colorName) {

        foreGroundcolors(ColorNames.stringToColor(colorName));
    }

    /**
     * changes the foreGroundcolors
     *
     * @param preferedColor the name of the color
     */
    public static void foreGroundcolors(Color preferedColor) {

        display.setForeground(preferedColor);
        pointbtn.setForeground(preferedColor);
        equalsBtn.setForeground(preferedColor);
        deleteBtn.setForeground(preferedColor);
        perCentBtn.setForeground(preferedColor);
        minusBtn.setForeground(preferedColor);
        zeroBtn.setForeground(preferedColor);
        plusBtn.setForeground(preferedColor);
        multipBtn.setForeground(preferedColor);
        devideBtn.setForeground(preferedColor);
        Btn_1.setForeground(preferedColor);
        Btn_2.setForeground(preferedColor);
        Btn_3.setForeground(preferedColor);
        Btn_4.setForeground(preferedColor);
        Btn_5.setForeground(preferedColor);
        Btn_6.setForeground(preferedColor);
        Btn_7.setForeground(preferedColor);
        Btn_8.setForeground(preferedColor);
        Btn_9.setForeground(preferedColor);

    }

    /**
     * calls the ColorNames class to convert the string name to Color object
     *
     * @param colorName the name of the color
     */
    public static void changeKeypadColors(String colorName) {

        keypadColors(ColorNames.stringToColor(colorName));
    }

    /**
     * changes the keypadColors
     *
     * @param preferedColor the name of the color
     */
    public static void keypadColors(Color preferedColor) {

        pointbtn.setBackground(preferedColor);
        pointbtn.setBackground(preferedColor);
        equalsBtn.setBackground(preferedColor);
        deleteBtn.setBackground(preferedColor);
        perCentBtn.setBackground(preferedColor);
        minusBtn.setBackground(preferedColor);
        zeroBtn.setBackground(preferedColor);
        plusBtn.setBackground(preferedColor);
        multipBtn.setBackground(preferedColor);
        devideBtn.setBackground(preferedColor);
        Btn_1.setBackground(preferedColor);
        Btn_2.setBackground(preferedColor);
        Btn_3.setBackground(preferedColor);
        Btn_4.setBackground(preferedColor);
        Btn_5.setBackground(preferedColor);
        Btn_6.setBackground(preferedColor);
        Btn_7.setBackground(preferedColor);
        Btn_8.setBackground(preferedColor);
        Btn_9.setBackground(preferedColor);

    }
}
