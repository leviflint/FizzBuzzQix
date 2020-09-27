package project;

public class FizzBuzzQix {
    public String interpret(int numberToInterpret) {
        if (numberToInterpret == 3){
            return "Fizz";
        } else if (numberToInterpret == 5) {
            return "Buzz";
        } else if (numberToInterpret == 7) {
            return "Qix";
        }
        return "" + numberToInterpret;
    }

}
