import java.util.Scanner;

public class LOOPS {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        char ch;

        do {

            System.out.println("\n------- LOOPS STATEMENT -------");
            System.out.println("1. Print numbers 1 to 10");
            System.out.println("2. Even Numbers");
            System.out.println("3. Sum");
            System.out.println("4. Factorial");
            System.out.println("5. Triangle Pattern");

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
    } public static void Act1() {
        System.out.println("\nPrint numbers 1 to 10");

        for (int i = 1; i <= 10; i ++) {
            System.out.println(i);
        }

    } public static void Act2() {
        System.out.println("Even numbers");

        for (int i = 2;  i <=20; i +=2) {
                System.out.print(i + "  ");
            }

    } public static void Act3() {

        int sum =0;

        for (int i = 1; i <=100; i++) {
            sum +=i;
        }
        System.out.println(sum);



    } public static void Act4() {
        int factorial =5;

        for (int i = 1; i <=4; i++) {
            factorial *=i;
        }
        System.out.println(factorial);


    }  public static void Act5() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
