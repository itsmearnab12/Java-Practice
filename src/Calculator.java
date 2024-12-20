import java.util.Scanner;
class InvalidinputException extends ArithmeticException{
    @Override
    public String toString() {
        return "Enter a valid number";
    }
}
class ZeroException extends ArithmeticException {
    @Override
    public String toString() {
        return "Can not divide by 0";
    }
}
class MaxInputException extends ArithmeticException {
    @Override
    public String toString() {
        return "value cannot be greater then 100000";
    }
}
class MaxMultiplierReachedException extends ArithmeticException {
        @Override
        public String toString() {
            return "Cannot take input value of 7000";
        }
    }

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        int choice = sc.nextInt();
        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b = sc.nextInt();

        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        switch (choice){
            case 1:
                System.out.println("Addition of both value is: " +(a+b));
                break;
            case 2:
                System.out.println("Subtraction of both value is "+(a-b));
                break;
            case 3:
                if (a >= 7000 && b >= 7000) {
                    throw new MaxMultiplierReachedException();
                }else {
                    System.out.println("Multiplication of both the number is " + (a*b));
                    break;
                }
            case 4:
                if (b==0){
                        throw new ZeroException();
                }else {
                    System.out.println("Division of both the number is "+(a/b));
                    break;
                }
            default: throw new InvalidinputException();
        }
    }
}
