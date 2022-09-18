package EspressoMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(); // Print menu

        ServiceMenu serviceMenu = new ServiceMenu(); // Service menu logic
        CollectMoney collectMoney = new CollectMoney(); // Collecting money and making coffee


        collectMoney.makeCoffee.addCoffeeBeans(); //Default amount of ingredients
        collectMoney.makeCoffee.addWater();
        collectMoney.makeCoffee.addMilk();

        System.out.println("Hello!\nThis is Java Coffee Machine\n");
        while (true) {

            System.out.println("Press 1 to top up your deposit \npress 2 to make coffee \npress 0 to turn machine off and return money");
            System.out.println("Your deposit is " + collectMoney.getDeposit() + " dollars"); // Show how much money you have

            int moneyOrCoffee = scanner.nextInt(); // Commands to go to top up your funds or to make coffee

            if (moneyOrCoffee == 1) { // Go to add money to deposit
                collectMoney.topUpDeposit(); // Function to top up deposit
            } else if ((moneyOrCoffee == 2)) { // Go to make coffee

                menu.printMenu();

                int command = scanner.nextInt();
                if (command == 1) {
                    collectMoney.espressoMoney();  // Function to make espresso, cappucino or latte if you have enough money
                } else if (command == 2) {
                    collectMoney.cappucinoMoney();
                } else if (command == 3) {
                    collectMoney.latteMoney();
                } else if (command == 9) {
                    System.out.println("Here's your change: " + collectMoney.giveChange() + " dollars"); // Function to give your change

                } else if (command == 10) {
                    serviceMenu.serviceMenu(collectMoney);  // Function to enter service menu and check service password
                } else if (command == 0) {  // Exiting to previous menu
                    System.out.println();
                } else {
                    System.out.println("Sorry that's no such command yet...");
                }
            } else if (moneyOrCoffee == 0) {  // Turn off coffee machine and return change or deposit
                System.out.println("Here's your " + collectMoney.giveChange() + " dollars");
                System.out.println("Good bye and have a nice day!");
                break;
            } else {
                System.out.println("Sorry that's no such command yet...");
            }
        }
    }
}
