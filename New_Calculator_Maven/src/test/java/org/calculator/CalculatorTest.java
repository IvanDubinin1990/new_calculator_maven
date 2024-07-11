package org.calculator;

import org.calcuator.UtilMethodsImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @InjectMocks
    private UtilMethodsImpl utilMethods;

    @Test
    @DisplayName("Вычисление результата со сложением арабских чисел")
    void testArabicNumbersResultAddiction(){
        String result = utilMethods.getResult(new String[]{"7", "+", "2"});
        Assertions.assertEquals("Answer: 9.0", result);
    }

    @Test
    @DisplayName("Вычисление результата с разностью арабских чисел")
    void testArabicNumbersResultSubtraction(){
        String result = utilMethods.getResult(new String[]{"7", "-", "2"});
        Assertions.assertEquals("Answer: 5.0", result);
    }

    @Test
    @DisplayName("Вычисление результата с частным арабских чисел")
    void testArabicNumbersResultDivision(){
        String result = utilMethods.getResult(new String[]{"6", "/", "2"});
        Assertions.assertEquals("Answer: 3.0", result);
    }

    @Test
    @DisplayName("Вычисление результата с произведением арабских чисел")
    void testArabicNumbersResultMultiplication(){
        String result = utilMethods.getResult(new String[]{"6", "*", "2"});
        Assertions.assertEquals("Answer: 12.0", result);
    }

    @Test
    @DisplayName("Вычисление результата со сложением римских чисел")
    void testRomanNumbersResultAddiction(){
        String result = utilMethods.getResult(new String[]{"V", "+", "II"});
        Assertions.assertEquals("Answer: VII", result);
    }

    @Test
    @DisplayName("Вычисление результата с разностью римских чисел")
    void testRomanNumbersResultSubtraction(){
        String result = utilMethods.getResult(new String[]{"V", "-", "II"});
        Assertions.assertEquals("Answer: III", result);
    }

    @Test
    @DisplayName("Вычисление результата с частным римских чисел")
    void testRomanNumbersResultDivision(){
        String result = utilMethods.getResult(new String[]{"VI", "/", "III"});
        Assertions.assertEquals("Answer: II", result);
    }

    @Test
    @DisplayName("Вычисление результата с произведением римских чисел")
    void testRomanNumbersResultMultiplication(){
        String result = utilMethods.getResult(new String[]{"V", "*", "II"});
        Assertions.assertEquals("Answer: X", result);
    }

    @Test
    @DisplayName("Вычисление результата, где первое число римское, а второе арабское")
    void testRomanAndArabicNumbers_One() {
        Assertions.assertThrows(RuntimeException.class,
                () -> utilMethods.getResult(new String[]{"V", "*", "2"}));
    }

    @Test
    @DisplayName("Вычисление результата, где первое число арабское, а второе римское")
    void testRomanAndArabicNumbers_Two() {
        Assertions.assertThrows(RuntimeException.class,
                () -> utilMethods.getResult(new String[]{"2", "/", "I"}));
    }

    @Test
    @DisplayName("Вычисление результата при делении на ноль")
    void testDivisionForNull() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> utilMethods.getResult(new String[]{"2", "/", "0"}));
    }

    @Test
    @DisplayName("Некорректное выражение")
    void testUncorrectedExpression() {
        Assertions.assertThrows(RuntimeException.class,
                () -> utilMethods.getResult(new String[]{"AnythingString", "+", "1"}));
    }

}
