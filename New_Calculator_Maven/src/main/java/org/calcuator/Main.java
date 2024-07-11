package org.calcuator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        UtilMethods utilMethods = new UtilMethodsImpl();
        System.out.println("Input the expression (+, -, *, /): ");
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        try (Scanner scanner = new Scanner(System.in)) {
            String[] strings = scanner.nextLine().trim().split(" +");
            if (pattern.matcher(strings[0]).matches() && pattern.matcher(strings[2]).matches()){
                utilMethods.checkExpression(Double.parseDouble(strings[0]), strings[1], Double.parseDouble(strings[2]));
            }
            System.out.println(utilMethods.getResult(strings));
        }
    }
}

