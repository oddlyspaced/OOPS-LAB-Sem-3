// Write a function that takes an integer hours and converts it to seconds

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.print(hours * 60 * 60);
        scanner.close();
    }
}
