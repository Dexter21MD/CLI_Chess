public class MainMenu
{
    String playerName;

    public MainMenu(String playerName)
    {
        this.playerName = playerName;
    }

    public void GreetPlayer()
    {

        System.out.printf("Hello %s! ", this.playerName);
        System.out.println();


    }
}
