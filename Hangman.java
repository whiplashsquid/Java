package Hangman161017;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void printArray(String[] revealed) {
        for (int counter = 0; counter < revealed.length; counter++) {
            System.out.print(revealed[counter] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] answer = {"c", "i", "n", "d", "e", "r", "e", "l", "l", "a"};
        String[] revealed= {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        String letter = " ";
        int x = 0;
        Scanner myStringScanner = new Scanner(System.in);
        while (!(Arrays.equals(answer, revealed)) && x <= 10) {
            System.out.println("Guess a letter");
            letter = myStringScanner.nextLine();
            for (int counter = 0; counter < answer.length; counter++) {
                if (answer[counter].equals(letter)) {
                    revealed[counter] = letter;
                }
            }
            printArray(revealed);
            x++;
        }
        if (Arrays.equals(answer, revealed)) {
            System.out.println("You got it!");
        } else {
            System.out.println("Not the same");
        }
    }
}
