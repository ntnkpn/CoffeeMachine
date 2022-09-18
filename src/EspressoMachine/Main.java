package EspressoMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        ServiceMenu serviceMenu = new ServiceMenu();
        CollectMoney collectMoney = new CollectMoney();


        collectMoney.makeCoffee.addCoffeeBeans();
        collectMoney.makeCoffee.addWater();
        collectMoney.makeCoffee.addMilk();

        System.out.println("Hello!\nThis is Java Coffee Machine\n");
        while (true) {

            System.out.println("Press 1 to top up your deposit \npress 2 to make coffee \npress 0 to turn machine off and return money");
            System.out.println("Your deposit is " + collectMoney.getDeposit() + " dollars");

            int moneyOrCoffee = scanner.nextInt();

            if (moneyOrCoffee == 1) {
                collectMoney.topUpDeposit();
            } else if ((moneyOrCoffee == 2)) {

                menu.printMenu();

                int command = scanner.nextInt();
                if (command == 1) {
                    collectMoney.espressoMoney();
                } else if (command == 2) {
                    collectMoney.cappucinoMoney();
                } else if (command == 3) {
                    collectMoney.latteMoney();
                } else if (command == 9) {
                    System.out.println("Here's your change: " + collectMoney.giveChange() + " dollars");

                } else if (command == 10) {
                    serviceMenu.serviceMenu(collectMoney);
                } else if (command == 0) {
                    System.out.println();
                } else {
                    System.out.println("Sorry that's no such command yet...");
                }
            } else if (moneyOrCoffee == 0) {
                System.out.println("Here's your " + collectMoney.giveChange() + " dollars");
                System.out.println("Good bye and have a nice day!");
                break;
            } else {
                System.out.println("Sorry that's no such command yet...");
            }
        }
    }
}
