import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, Whats your name?: ");
        String userInput = input.nextLine();
        System.out.println("Nice to meet you, " + userInput + "How has your day been?: ");
        String userAnswer  = input.nextLine();
        System.out.println("Okay, Anything in particular that make you feel that It has been a splendid day?: ");
        String answer = input.nextLine();
        System.out.println("Okay, Well it has been a pleasure to speak with you. Have a nice day!");

    }
}
