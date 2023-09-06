package org.example.rgbToHex;

public class RGBToHex {
    public static String rgb(int red, int green, int blue) {
        if(red < 0) red = 0;
        if(green < 0) green = 0;
        if(blue < 0) blue = 0;

        if(red > 255) red = 255;
        if(green > 255) green = 255;
        if(blue > 255) blue = 255;

        int red_zone = red / 16;
        int red_numeral =  red % 16;

        int green_zone = green / 16;
        int green_numeral =  green % 16;

        int blue_zone = blue / 16;
        int blue_numeral =  blue % 16;

        return String.format("%s%s%s%s%s%s",
                convertToHexString(red_zone),
                convertToHexString(red_numeral),
                convertToHexString(green_zone),
                convertToHexString(green_numeral),
                convertToHexString(blue_zone),
                convertToHexString(blue_numeral));
    }

    private static String convertToHexString(int value){
        if(value < 10) return String.valueOf(value);

        switch (value) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            default: return "NaN";
        }
    }
}
