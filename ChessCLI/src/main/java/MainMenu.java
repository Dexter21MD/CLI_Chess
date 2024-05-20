public class MainMenu
{
    String playerName;
    MessageStrings messageStrings;

    public MainMenu(String playerName)
    {
        this.playerName = playerName;
        this.messageStrings = new MessageStrings();
    }

    public void greetPlayer()
    {
        System.out.printf("%s %s! %s ",this.messageStrings.greeting,
                                       this.playerName,
                                       this.messageStrings.introductionMessage);
        System.out.println();
        System.out.printf("%s", this.messageStrings.introductionOMessagePickOption);
        System.out.println();
    }

    public  void showOptions()
    {
        System.out.printf(" 1) %s %n 2) %s", this.messageStrings.startGameOption, this.messageStrings.exittGameOption);
    }
}
