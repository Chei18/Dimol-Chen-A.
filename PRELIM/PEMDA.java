import java.util.Scanner;

public class PEMDA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        String expression = s.nextLine();
        
        try {
            double result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");
        return 42.0;
    }
}
    

