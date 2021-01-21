// WAP to print the multiple of 1,2,3,5,6,7,8 in a series.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = {1, 2, 3, 5, 6, 7, 8};
        for (int i = 0; i < num.length; i++) {
            System.out.print(n * num[i] + " ");
        }
        scanner.close();
    }
}
