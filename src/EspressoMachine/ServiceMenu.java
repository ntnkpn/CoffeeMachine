package EspressoMachine;

import java.util.Scanner;

public class ServiceMenu {
    Scanner scanner = new Scanner(System.in);
    Menu serviceMenu = new Menu();

    ServicePassword servicePassword = new ServicePassword();

    public void serviceMenu(CollectMoney collectMoney) {

        while (true) {
            System.out.println("Press 1 to enter service password or press 0 to exit:");
            int commandOne = scanner.nextInt();
            if (commandOne == 1) {
                System.out.println("Enter service password below:");
                if (servicePassword.checkPassword()) {
                    serviceMenu.printServiceMenu();
                    int commandTwo = scanner.nextInt();
                    if (commandTwo == 11) {
                        System.out.println("Set new service password. Enter 4 symbols below:");
                        if (servicePassword.setServicePassword()) {
                            System.out.println("Password is set");
                        } else {
                            System.out.println("Wrong length");
                        }
                    } else if (commandTwo == 12) {
                        System.out.println("Collected money: " + collectMoney.getCollectedMoney() + " dollars");
                    } else if (commandTwo == 13) {
                        System.out.println("Available ingredients:");
                        System.out.println("Available coffee beans: " + collectMoney.makeCoffee.getCoffeeBeans() + " grams");
                        System.out.println("Available water: " + collectMoney.makeCoffee.getWater() + " grams");
                        System.out.println("Available milk: " + collectMoney.makeCoffee.getMilk() + " grams");
                    } else if (commandTwo == 14) {
                        System.out.println("Refilling coffee machine:");
                        collectMoney.makeCoffee.addCoffeeBeans();
                        collectMoney.makeCoffee.addWater();
                        collectMoney.makeCoffee.addMilk();
                        System.out.println("Coffee machine refilled");
                    }
                }
            } else if (commandOne == 0) {
                break;
            } else {
                System.out.println("Sorry that's no such command");
            }

        }

    }
}
