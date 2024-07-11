package org.calcuator;

public class ActionImpl implements Action {

    public ActionImpl(Model model) {
    }

    @Override
    public Double addition(Model model) {
        return model.getVariable_1() + model.getVariable_2();
    }

    @Override
    public Double subtraction(Model model) {
        return model.getVariable_1() - model.getVariable_2();
    }

    @Override
    public Double division(Model model) {
        if(model.getVariable_2() == 0){
            throw new ArithmeticException("You can't divide by zero");
        }
        return model.getVariable_1() / model.getVariable_2();
    }

    @Override
    public Double multiplication(Model model) {
        return model.getVariable_1() * model.getVariable_2();
    }
}
