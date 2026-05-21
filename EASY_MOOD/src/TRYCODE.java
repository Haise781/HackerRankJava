import com.sun.source.doctree.EscapeTree;

import javax.swing.*;
import java.security.PublicKey;
import java.util.Scanner;

public class TRYCODE {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {

            System.out.println("\n------- IF ELSE STATEMENT -------");
            System.out.println("1. Activity 1");
            System.out.println("2. Activity 2");
            System.out.println("3. Activity 3");
            System.out.println("4. Activity 4");
            System.out.println("5. Activity 5");
            System.out.println("6. Activity 6");
            System.out.println("7. Activity 7");
            System.out.println("8. Activity 8");
            System.out.println("0. EXIT");

            System.out.print("Choose a number: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    Act1();
                    break;

                case 2:
                    Act2();
                    break;

                case 3:
                    Act3();
                    break;

                case 4:
                    Act4();
                    break;

                case 5:
                    Act5();
                    break;

                case 6:
                    Act6();
                    break;

                case 7:
                    Act7();
                    break;

                case 8:
                    Act8();
                    break;

                case 0:
                    System.out.println("Program Exited.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nDo you want to continue? (y/n)");
            ch = scanner.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        System.out.println("Program Terminated.");
    }

    // ACTIVITY 1
    public static void Act1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Age Checker -------");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Minor.");
        }
    }

    // ACTIVITY 2
    public static void Act2() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // ACTIVITY 3
    public static void Act3() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }

    // ACTIVITY 4
    public static void Act4() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Excellent");
        } else if (grade >= 75 && grade <= 89) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    // ACTIVITY 5
    public static void Act5() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Username: ");
        String name = scanner.next();

        System.out.print("Enter your Password: ");
        String password = scanner.next();

        if (name.equals("admin") && password.equals("1234")) {
            System.out.println("Login Success");
        } else {
            System.out.println("Wrong Credentials");
        }
    }

    // ACTIVITY 6
    public static void Act6() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Did your parents come with you? (true/false): ");
        boolean parentAllowed = scanner.nextBoolean();

        if (age >= 18 || parentAllowed) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");
        }
    }

    // ACTIVITY 7
    public static void Act7() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter Operator (+, *, -, /): ");
        char operator = scanner.next().charAt(0);

        int result;

        if (operator == '+') {

            result = n1 + n2;
            System.out.println("Result: " + result);

        } else if (operator == '*') {

            result = n1 * n2;
            System.out.println("Result: " + result);

        } else if (operator == '-') {

            result = n1 - n2;
            System.out.println("Result: " + result);

        } else if (operator == '/') {

            if (n2 != 0) {

                result = n1 / n2;
                System.out.println("Result: " + result);

            } else {

                System.out.println("Cannot divide by zero!");

            }

        } else {

            System.out.println("Invalid Operator!");

        }
    }

    // ACTIVITY 8
    public static void Act8() {

        Scanner scanner = new Scanner(System.in);

        int balance = 5000;

        System.out.println("Current Balance: " + balance);

        // WITHDRAW
        System.out.print("Do you want to withdraw? (y/n): ");
        char withdrawChoice = scanner.next().charAt(0);

        if (withdrawChoice == 'y' || withdrawChoice == 'Y') {

            System.out.print("Enter amount to withdraw: ");
            int withdrawAmount = scanner.nextInt();

            if (withdrawAmount <= balance) {

                balance = balance - withdrawAmount;

                System.out.println("Withdraw Successful!");
                System.out.println("New Balance: " + balance);

            } else {

                System.out.println("Insufficient Balance!");

            }
        }

        // DEPOSIT
        System.out.print("Do you want to deposit? (y/n): ");
        char depositChoice = scanner.next().charAt(0);

        if (depositChoice == 'y' || depositChoice == 'Y') {

            System.out.print("Enter amount to deposit: ");
            int depositAmount = scanner.nextInt();

            balance = balance + depositAmount;

            System.out.println("Deposit Successful!");
            System.out.println("New Balance: " + balance);
        }

        // FINAL BALANCE
        System.out.println("Final Balance: " + balance);
    }
}
