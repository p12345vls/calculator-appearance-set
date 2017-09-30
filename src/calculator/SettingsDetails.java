package calculator;

/**
 * Setting details
 *
 * @author pavlos papadoniokolakis
 */
public class SettingsDetails {

    //variables
    private static int precision;
    private static String colorName;
    private static String type;

    /**
     *
     * @return precision
     */
    public static int getPrecision() {

        return precision;
    }

    /**
     * sets the precision
     *
     * @param precision the decimal precision
     */
    public static void setPrecision(int precision) {
        SettingsDetails.precision = precision;
    }

    /**
     * gets the color name
     *
     * @return the color name
     */
    public static String getColorName() {
        return colorName;
    }

    /**
     * sets the color name
     *
     * @param colorName the name of the color
     */
    public static void setColor(String colorName) {
        SettingsDetails.colorName = colorName;
    }

    /**
     * sets the font type
     *
     * @param fontType the font type
     */
    public static void setType(String fontType) {
        SettingsDetails.type = fontType;
    }

    /**
     * gets the font type
     * @return the font type
     */
    public static String getType() {
        return type;
    }

}
