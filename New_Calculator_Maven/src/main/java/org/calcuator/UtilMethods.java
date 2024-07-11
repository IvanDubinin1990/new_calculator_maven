package org.calcuator;

public interface UtilMethods {

    String printResult(Double variable_1, String action_1, Double variable_2);
    String convertingAndPrintResult(Double variable_1, String action_1, Double variable_2);
    Model modelInitialization(Double variable_1, String action_1, Double variable_2);
    String getResult(String[] strings);
    void checkExpression(Double variable_1, String action, Double variable_2);

}
