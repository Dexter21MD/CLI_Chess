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
        playerInput = scanner.nextLine();
        // Main Loop
        if (playerInput.equals("1"))
        {
            System.out.println("Game Starded!");
            boolean exit = false;
            Chessboard chessboard = new Chessboard();
            chessboard.initBoard();
            chessboard.renderChessBoard();
            while (!exit)
            {
                playerInput = scanner.nextLine();
                exit = (playerInput.equalsIgnoreCase("quit") || playerInput.equalsIgnoreCase("2"));
            }
        }
        else
        {
            System.out.println("See you later!");
        }




    }
}
