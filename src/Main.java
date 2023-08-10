import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intro();
        takeUserName();
        guessAge();
        countToAnyNumber();
        quiz();
        end();
    }

    static void intro() {
        System.out.println("""
                Hello! My name is Delta.
                I was crated in 2023.
                Please, remind me your name.""");
    }

    static void takeUserName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let me guess your age.\n" +
                "Say me remainders of dividing your age by 3, 5 and 7.");
        int remainderBy3 = scanner.nextInt();
        int remainderBy5 = scanner.nextInt();
        int reaminderBy7 = scanner.nextInt();
        int age = 24; //Todo: Need to work on logic to calculate age.
        System.out.println("Your age is " + age + " that's a good time to start programming!");
    }

    static void countToAnyNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int userInputNumber = scanner.nextInt();
        for(int i=0; i<=userInputNumber; i++) System.out.println(i + "!");
    }

    static void quiz() {
        System.out.println("Let's test your programming knowledge.");
        question();
    }

    static void question() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Which statement is the most complete about break and continue?
                1. The keyword break can be written in a body of while and do-while loops.
                2. The keyword continue cannot be written in a body of while and do-while loops.
                3. Both keyword can be written in a body of for, while and do-while loops.
                4. The keywords break and continue can be written in the conditional statement if-else.""");
        int correctAns = 3;
        int userAns = scanner.nextInt();
        while (userAns != correctAns) {
            System.out.println("Please!, try again.");
            userAns = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}