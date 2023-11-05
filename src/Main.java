import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number for multiple: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Operation: ");
        String operation = scanner.nextLine();
        String plus = "+";
        String minus = "-";
        String del = "/";
        String mul = "*";
        System.out.print("Input second number for multiple: ");
        int num2 = scanner.nextInt();
        int res = 0;
        if (operation.equals(plus)) {
            res = num1 + num2;
        } else if (operation.equals(minus)) {
            res = num1 - num2;
        } else if (operation.equals(del)) {
            res = num1 / num2;
        } else if (operation.equals(mul)) {
            res = num1 * num2;
        } else {
            System.out.print("Wrong operation");
        }
        System.out.println("Result: " + res);
    }
}
