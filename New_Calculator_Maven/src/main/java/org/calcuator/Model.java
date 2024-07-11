package org.calcuator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    private Double variable_1;
    private String action;
    private Double variable_2;

    public void setVariable_1(Double variable_1) {
        if (variable_1 >= 0 && variable_1 <= 10) {
            this.variable_1 = variable_1;
        } else {
            throw new RuntimeException("The first number must be from 0 to 10");
        }
    }

    public void setVariable_2(Double variable_2) {
        if (variable_2 >= 0 && variable_2 <= 10) {
            this.variable_2 = variable_2;
        } else {
            throw new RuntimeException("The second number must be from 0 to 10");
        }
    }

    public void setAction(String action) {
        if (action.equals("+") || action.equals("-") || action.equals("*") || action.equals("/")) {
            this.action = action;
        } else {
            throw new IllegalArgumentException("This action is wrong");
        }
    }
}
