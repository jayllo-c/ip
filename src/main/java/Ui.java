import java.util.Scanner;

public class Ui {

    Scanner scanObj = new Scanner(System.in);
    private String userInput = "";
    public void inputMessage() {
        userInput = scanObj.nextLine();
    }

    public String getUserInput() {
        return userInput;
    }
}