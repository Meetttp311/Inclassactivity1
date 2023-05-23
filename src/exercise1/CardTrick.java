package exercise1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * Author: Meet Patel
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumber1()]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();
        System.out.print("Enter your card suit (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, your card does not match any card in the hand.");
        }
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1; // Generates a random number between 1 and 13 (inclusive)
    }
    private static int generateRandomNumber1() {
        Random random = new Random();
        return random.nextInt(4); // Generates a random number between 1 and 13 (inclusive)
    }


    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * Author: Meet Patel
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Meet, I am a engineer, has learned many different things and wanted to learn more");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Want to utilize all my skills and learn new things");

        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- To play games and learn new designing techs. ");

        System.out.println();
    }

}
