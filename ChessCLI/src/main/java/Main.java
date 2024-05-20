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
        menu.GreetPlayer();

    }
}
