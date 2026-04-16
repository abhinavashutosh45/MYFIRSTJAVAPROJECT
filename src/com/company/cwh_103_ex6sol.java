package com.company;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot Divide by zero";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than the maximum value 10000";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than the 7000 while multiplying";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class customCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a>10000 || b>10000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double sub(double a, double b) throws InvalidInputException, MaxInputException{
        if (a>10000 || b>10000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a - b;
    }
    double mul(double a, double b) throws InvalidInputException, MaxInputException, MaxMultiplyInputException {
        if (a>10000 || b>10000) {
            throw new MaxInputException();
        }else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a * b;
    }
    double div(double a, double b) throws InvalidInputException, MaxInputException ,CannotDivideByZeroException , MaxMultiplyInputException {
        if (a>10000 || b>10000) {
            throw new MaxInputException();
        }else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class cwh_103_ex6sol {
    static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException,  MaxInputException , MaxMultiplyInputException {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 10000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */
        customCalculator customCalculator = new customCalculator();
        //customCalculator.add(8,9);
        //customCalculator.div(8,0);
        //customCalculator.add(1,11111);
        //customCalculator.sub(1,11111);
        //customCalculator.mul(1,11111);
        //customCalculator.div(1,11111);
        //customCalculator.mul(2,7001);
        customCalculator.div(2,9999);
    }
}
