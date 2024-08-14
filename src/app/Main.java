package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
        public static void printSquare(int number) {
            int square = number * number;
            System.out.println("The square of a number: " + number + " is equal to: " + square + ".");
        }

        public static void printCylinderVolume(double radius, double height) {
            double volume = Math.PI * Math.pow(radius, 2) * height;
            System.out.println("Volume of a cylinder with radius: " + radius + " and height: " + height + " is equal to: " + volume + ".");
        }

        public static void printArraySum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("The sum of all array elements is equal: " + sum + ".");
        }

        public static void printReversedString(String text) {
            String reversed = new StringBuilder(text).reverse().toString();
            System.out.println("The rows is in reverse order: " + reversed);
        }

        public static void printPower(int a, int b) {
            int result = (int) Math.pow(a, b);
            System.out.println("Result: " + a + "^" + b + " is equal to: " + result + ".");
        }

        public static void printTextNTimes(int n, String text) {
            for (int i = 0; i < n; i++) {
                System.out.println(text);
            }
        }
        static {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            printSquare(number);

            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            printCylinderVolume(radius, height);

            int[] array = {10, 20, 30, 40, 50};
            printArraySum(array);

            System.out.print("Enter a string: ");
            scanner.nextLine();
            String text = scanner.nextLine();
            printReversedString(text);

            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            printPower(a, b);

            System.out.print("Enter the number n: ");
            int n = scanner.nextInt();
            System.out.print("Enter the text string: ");
            scanner.nextLine();
            String repeatText = scanner.nextLine();
            printTextNTimes(n, repeatText);

            scanner.close();
    }
}
