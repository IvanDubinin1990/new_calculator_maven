package org.calcuator;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class RomanNumber {

    private final Map<String, Double> romanMap = new HashMap<>();
    private final Map<Double, String> romanMapConverter = new HashMap<>();

    {
        romanMap.put("I", 1.0);
        romanMap.put("II", 2.0);
        romanMap.put("III", 3.0);
        romanMap.put("IV", 4.0);
        romanMap.put("V", 5.0);
        romanMap.put("VI", 6.0);
        romanMap.put("VII", 7.0);
        romanMap.put("VIII", 8.0);
        romanMap.put("IX", 9.0);
        romanMap.put("X", 10.0);
    }

    {
        romanMapConverter.put(1.0, "I"); romanMapConverter.put(2.0, "II"); romanMapConverter.put(3.0, "III");
        romanMapConverter.put(4.0, "IV"); romanMapConverter.put(5.0, "V"); romanMapConverter.put(6.0, "VI");
        romanMapConverter.put(7.0, "VII"); romanMapConverter.put(8.0, "VIII"); romanMapConverter.put(9.0, "IX");
        romanMapConverter.put(10.0, "X"); romanMapConverter.put(12.0, "XII"); romanMapConverter.put(14.0, "XIV");
        romanMapConverter.put(15.0, "XV"); romanMapConverter.put(16.0, "XVI"); romanMapConverter.put(18.0, "XVIII");
        romanMapConverter.put(20.0, "XX"); romanMapConverter.put(21.0, "XXI"); romanMapConverter.put(24.0, "XXIV");
        romanMapConverter.put(25.0, "XXV"); romanMapConverter.put(27.0, "XXVII"); romanMapConverter.put(28.0, "XXVIII");
        romanMapConverter.put(30.0, "XXX"); romanMapConverter.put(35.0, "XXXV"); romanMapConverter.put(36.0, "XXXVI");
        romanMapConverter.put(40.0, "XL"); romanMapConverter.put(42.0, "XLII"); romanMapConverter.put(45.0, "XLV");
        romanMapConverter.put(48.0, "XLVIII"); romanMapConverter.put(49.0, "XLIX"); romanMapConverter.put(50.0, "L");
        romanMapConverter.put(54.0, "LIV"); romanMapConverter.put(56.0, "LVI"); romanMapConverter.put(60.0, "LX");
        romanMapConverter.put(63.0, "LXIII"); romanMapConverter.put(64.0, "LXIV"); romanMapConverter.put(70.0, "LXX");
        romanMapConverter.put(72.0, "LXXII"); romanMapConverter.put(80.0, "LXXX"); romanMapConverter.put(81.0, "LXXXI");
        romanMapConverter.put(90.0, "CX"); romanMapConverter.put(100.0, "C");
    }
}
