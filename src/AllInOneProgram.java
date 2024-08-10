import java.util.Scanner;

public class AllInOneProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Increment and Decrement Variable");
            System.out.println("3. Check if a Number is Positive or Negative");
            System.out.println("4. Increment and Decrement in a Loop");
            System.out.println("5. Compound Assignment Operators");
            System.out.println("6. Relational Operators");
            System.out.println("7. Operations between Integer and Double");
            System.out.println("8. Byte Addition");
            System.out.println("9. Calculate Area of a Rectangle");
            System.out.println("10. Reverse the Sign of an Integer");
            System.out.println("11. Logical Negation on Boolean Inputs");
            System.out.println("12. Increment and Decrement by 1");
            System.out.println("13. Calculate Price After Discount");
            System.out.println("14. Check if Number is within Range");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicArithmetic(scanner);
                    break;
                case 2:
                    incrementDecrementVariable();
                    break;
                case 3:
                    checkPositiveNegative(scanner);
                    break;
                case 4:
                    incrementDecrementLoop();
                    break;
                case 5:
                    compoundAssignment();
                    break;
                case 6:
                    relationalOperators(scanner);
                    break;
                case 7:
                    integerDoubleOperations();
                    break;
                case 8:
                    byteAddition();
                    break;
                case 9:
                    rectangleArea(scanner);
                    break;
                case 10:
                    reverseSign(scanner);
                    break;
                case 11:
                    logicalNegation(scanner);
                    break;
                case 12:
                    incrementDecrementByOne(scanner);
                    break;
                case 13:
                    priceAfterDiscount(scanner);
                    break;
                case 14:
                    checkRange(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void basicArithmetic(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
    }

    public static void incrementDecrementVariable() {
        int x = 10;
        System.out.println("Initial value: " + x);

        x++;
        System.out.println("After increment: " + x);

        x--;
        System.out.println("After decrement: " + x);
    }

    public static void checkPositiveNegative(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isNegative = !(num > 0);

        if (isNegative) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }
    }

    public static void incrementDecrementLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Counting up: " + i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("Counting down: " + i);
        }
    }

    public static void compoundAssignment() {
        int x = 5;

        x += 2; // equivalent to x = x + 2
        System.out.println("x += 2: " + x);

        x -= 3; // equivalent to x = x - 3
        System.out.println("x -= 3: " + x);

        x *= 4; // equivalent to x = x * 4
        System.out.println("x *= 4: " + x);

        x /= 2; // equivalent to x = x / 2
        System.out.println("x /= 2: " + x);

        x %= 3; // equivalent to x = x % 3
        System.out.println("x %= 3: " + x);
    }

    public static void relationalOperators(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("First number is greater than second number.");
        } else if (num1 < num2) {
            System.out.println("First number is less than second number.");
        } else {
            System.out.println("First number is equal to second number.");
        }
    }

    public static void integerDoubleOperations() {
        int i = 5;
        double d = 2.5;

        double result = i + d;
        System.out.println("Integer + Double: " + result);

        result = i - d;
        System.out.println("Integer - Double: " + result);

        result = i * d;
        System.out.println("Integer * Double: " + result);

        result = i / d;
        System.out.println("Integer / Double: " + result);
    }

    public static void byteAddition() {
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);

        System.out.println("Result of adding two bytes: " + result);
    }

    public static void rectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void reverseSign(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        num = -num;
        System.out.println("The reversed sign value is: " + num);
    }

    public static void logicalNegation(Scanner scanner) {
        System.out.print("Enter first boolean value (true/false): ");
        boolean bool1 = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean bool2 = scanner.nextBoolean();

        System.out.println("Negation of first value: " + !bool1);
        System.out.println("Negation of second value: " + !bool2);
    }

    public static void incrementDecrementByOne(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        num++;
        System.out.println("After increment: " + num);

        num--;
        System.out.println("After decrement: " + num);
    }

    public static void priceAfterDiscount(Scanner scanner) {
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        originalPrice -= originalPrice * (discountPercentage / 100);
        System.out.println("Price after discount: " + originalPrice);
    }

    public static void checkRange(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("The number is within the range 1-100.");
        } else {
            System.out.println("The number is outside the range 1-100.");
        }
    }
}
