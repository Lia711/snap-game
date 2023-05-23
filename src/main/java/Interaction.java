import java.util.Scanner;
public class Interaction {
    int number;
    String input;
    public int readNumber() {
        Scanner myObj = new Scanner(System.in);
        number = myObj.nextInt();
        return number;
    }

    public String readInput() {
        Scanner myObj = new Scanner(System.in);
        input = myObj.nextLine();
        return input;
    }
}
