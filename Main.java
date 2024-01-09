import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Phrase phrase = new Phrase();
            phrase.launch(scanner);

            System.out.println("Do you want to play again? (y/n)");
            String again = scanner.nextLine();

            if (!again.equals("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}