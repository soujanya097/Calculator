class Calculator {
    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2 is being returned.
     */

    float addition(float operand_1, float operand_2) {
        return (operand_1 + operand_2);
    }

    float substraction(float operand_1, float operand_2) {
        return (operand_1 - operand_2);
    }

    float multiplication(float operand_1, float operand_2) {
        return (operand_1 * operand_2);
    }

    float division(float operand_1, float operand_2) {
        return (operand_1 / operand_2);

    }

    public static void main(String[] args) {

        // The line `Calculator calc = new Calculator();` is creating a new instance of
        // the `Calculator` class and assigning it to the variable `calc`. This allows
        // us to access the methods and properties of the `Calculator` class using the
        // `calc` variable.
        Calculator calc = new Calculator();
        float operand_1 = 10;
        float operand_2 = 5;

        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("result is : " + add_result);

        float sub_result = calc.substraction(operand_1, operand_2);
        System.out.println("result is : " + sub_result);

        float mult_result = calc.multiplication(operand_1, operand_2);
        System.out.println("result is : " + mult_result);

        float div_result = calc.division(operand_1, operand_2);
        System.out.println("result is : " + div_result);
    }
}
