package calculator;

import java.awt.Font;

/**
 * Changes the font type determined by the user
 *
 * @author pavlos papadoniokolakis
 */
public class FontType extends Calculator {

    /**
     * changes the font
     * @param fontType the font selected
     */
    public static void changeFont(String fontType) {

        display.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        pointbtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        equalsBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        deleteBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        perCentBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        minusBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        zeroBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        plusBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        multipBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        devideBtn.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_1.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_2.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_3.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_4.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_5.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_6.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_7.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_8.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));
        Btn_9.setFont(new Font(fontType, Font.LAYOUT_LEFT_TO_RIGHT, 22));

    }

}
