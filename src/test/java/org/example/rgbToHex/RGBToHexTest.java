package org.example.rgbToHex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RGBToHexTest {

//    @ParameterizedTest
//    @CsvSource(value = {
//            "255,FF",
//            "100,64",
//            "1,1",
//            "15,F",
//            "212,D4",
//            "0,0"} )
//    public void shouldTakeSingleInputAndReturnStringHexFormat(int input, String expected) {
//        RGBToHex RgbToHex = new RGBToHex();
//
//        assertEquals(expected, RgbToHex.rgb(input));
//    }

    @ParameterizedTest
    @CsvSource(value = {
            "255,255,255,FFFFFF",
            "254,253,252,FEFDFC",
            "0,0,252,0000FC",
            "0,0,0,000000",
            "1,2,3,010203",
            "-20,275,125,00FF7D",
            } )
    public void shouldTakeRBGInputAndReturnStringHexFormat(int Red, int Green, int Blue, String expected) {
        RGBToHex RgbToHex = new RGBToHex();

        assertEquals(expected, RgbToHex.rgb(Red,Green,Blue));
    }


}