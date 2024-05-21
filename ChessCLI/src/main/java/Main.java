import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("**** Chess ver 0.1 ****");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();

        MainMenu menu = new MainMenu(name);
        menu.greetPlayer();
        menu.showOptions();

        System.out.println();
        String playerInput = "";
        boolean exit = false;
        // Main Loop
        while (!exit)
        {
            playerInput = scanner.nextLine();
            exit = (playerInput.toLowerCase().equals("quit") || playerInput.equals("2"));
        }


    }
}
