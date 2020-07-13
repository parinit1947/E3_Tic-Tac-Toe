package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char[] chars = str.toCharArray();

        int count = 0;

        System.out.println("---------");

        for (char c : chars) {
            if (count == 0) {
                System.out.print("| ");
            }
            System.out.print(c + " ");
            count++;
            if (count == 3) {
                System.out.println("|");
                count = 0;
            }
        }

        System.out.println("---------");
    }
}
