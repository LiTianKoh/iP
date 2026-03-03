package bob;

public class Bob {
    private Ui ui;

    public Bob() {
        ui = new Ui();
    }

    public void run() {
        ui.showWelcome();

        while (true) {
            String input = ui.readCommand();
            ui.showLine();

            if (input.equalsIgnoreCase("bye")) {
                ui.showMessage("Bye. Hope to see you again soon!");
                ui.showLine();
                break;
            } else {
                ui.showMessage("You said: " + input);
                ui.showLine();
            }
        }
    }

    public static void main(String[] args) {
        new Bob().run();
    }
}