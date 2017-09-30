package calculator;

import java.awt.Color;
import java.lang.reflect.Field;

/**
 * Converts string color names to Color Object
 *
 * @author pavlos papadoniokolakis
 */
public class ColorNames {

    /**
     * 
     * @param value the string color name
     * @return the Color object
     */
    public static Color stringToColor(final String value) {
        if (value == null) {
            return Color.black;
        }
        try {
            return Color.decode(value);
        } catch (NumberFormatException nfe) {
            try {
                final Field f = Color.class.getField(value);

                return (Color) f.get(null);
            } catch (Exception ce) {
                return Color.black;
            }
        }
    }

}
