interface ArithmeticOperation {
    double operate(double a, double b);
}

interface StringOperation {
    String apply(String str);
}

public class LambdaAllOperations {

    public static void main(String[] args) {

        ArithmeticOperation add = (a, b) -> a + b;
        ArithmeticOperation sub = (a, b) -> a - b;
        ArithmeticOperation mul = (a, b) -> a * b;
        ArithmeticOperation div = (a, b) -> b != 0 ? a / b : 0;

        double x = 20;
        double y = 10;

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + sub.operate(x, y));
        System.out.println("Multiplication: " + mul.operate(x, y));
        System.out.println("Division: " + div.operate(x, y));

        System.out.println("\n-----------------------------\n");

      
        String input = "Lambda Expression";

        StringOperation toUpper = str -> str.toUpperCase();
        StringOperation toLower = str -> str.toLowerCase();
        StringOperation reverse =
                str -> new StringBuilder(str).reverse().toString();

        System.out.println("String Operations:");
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + toUpper.apply(input));
        System.out.println("Lowercase: " + toLower.apply(input));
        System.out.println("Reversed: " + reverse.apply(input));
    }
}
