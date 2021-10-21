import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the calculator.");

        Calculator calculator = new Calculator();
        boolean terminate = false;

        while (!terminate) {
            System.out.println("Enter a command:");

            int result = -1;

            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            String input = reader.readLine();

            String[] commands = input.split(" ");

            switch (commands[0]) {
                case "add":
                    result = calculator.add(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "subtract":
                    result = calculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "divide":
                    result = calculator.divide(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "multiply":
                    result = calculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "intToBinaryNumber":
                    String binaryNumber = calculator.intToBinaryNumber(Integer.parseInt(commands[1]));
                    result = Integer.parseInt(binaryNumber);
                    break;
                case "fibonacciNumberFinder":
                    result = calculator.fibonacciNumberFinder(Integer.parseInt(commands[1]));
                    break;
                case "terminate":
                    terminate = true;
                    break;
            }

            if (!terminate) {
                System.out.println(result);
            }
        }
        System.out.println("Goodbye!");

    }

}
