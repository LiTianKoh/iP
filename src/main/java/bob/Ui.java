package bob;

import java.util.Scanner;

public class Ui {
    private Scanner scanner;
    public static final String SEPARATOR = "    ___________________________";
    public static final String INDENT = "    ";

    public Ui() {
        scanner = new Scanner(System.in);
    }

    public void showWelcome() {
        Logo.printBob();
    }

    public String readCommand() {
        return scanner.nextLine();
    }

    public void showLine() {
        System.out.println(SEPARATOR);
    }

    public void showError(String message) {
        System.out.println(INDENT + message);
        showLine();
    }

    public void showMessage(String message) {
        System.out.println(INDENT + message);
    }
}