package EspressoMachine;

import java.util.Scanner;

public class ServiceMenu {
    Scanner scanner = new Scanner(System.in);
    Menu serviceMenu = new Menu();

    ServicePassword servicePassword = new ServicePassword();

    public void serviceMenu(CollectMoney collectMoney) {  // Logic of service menu

        while (true) {
            System.out.println("Press 1 to enter service password or press 0 to exit:");
            int commandOne = scanner.nextInt();
            if (commandOne == 1) {
                System.out.println("Enter service password below:");
                if (servicePassword.checkPassword()) {  // Checking service password
                    serviceMenu.printServiceMenu();  // Printing service menu if true
                    int commandTwo = scanner.nextInt();  // Commands to navigate service menu
                    if (commandTwo == 11) {
                        System.out.println("Set new service password. Enter 4 symbols below:");
                        if (servicePassword.setServicePassword()) {  // Function to set new service password
                            System.out.println("Password is set");
                        } else {
                            System.out.println("Wrong length");  // If !4 symbols in password
                        }
                    } else if (commandTwo == 12) {
                        System.out.println("Collected money: " + collectMoney.getCollectedMoney() + " dollars");  // Shows earned money
                    } else if (commandTwo == 13) {
                        System.out.println("Available ingredients:");  // Shows available ingredients in coffee machine
                        System.out.println("Available coffee beans: " + collectMoney.makeCoffee.getCoffeeBeans() + " grams");
                        System.out.println("Available water: " + collectMoney.makeCoffee.getWater() + " grams");
                        System.out.println("Available milk: " + collectMoney.makeCoffee.getMilk() + " grams");
                    } else if (commandTwo == 14) {
                        System.out.println("Refilling coffee machine:");  // Refilling ingredients of coffee machine
                        collectMoney.makeCoffee.addCoffeeBeans();
                        collectMoney.makeCoffee.addWater();
                        collectMoney.makeCoffee.addMilk();
                        System.out.println("Coffee machine refilled");
                    }
                }
            } else if (commandOne == 0) {  // Exiting service menu
                break;
            } else {
                System.out.println("Sorry that's no such command");
            }

        }

    }
}
