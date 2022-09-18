package EspressoMachine;

public class Menu {

    public void printMenu() {
        System.out.println("MAIN MENU:");
        System.out.println("1 - Make espresso");
        System.out.println("2 - Make cappucino");
        System.out.println("3 - Make latte");
        System.out.println("9 - Return change");
        System.out.println("10 - Service menu");
        System.out.println("0 - Exit to previous menu");
    }

    public void printServiceMenu() {
        System.out.println("SERVICE MENU:");
        System.out.println("11 - Set service password");
        System.out.println("12 - Collected money");
        System.out.println("13 - Show available ingredients");
        System.out.println("14 - Refill coffee machine");
        System.out.println("0 - Exit");
    }

}
