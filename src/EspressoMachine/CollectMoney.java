package EspressoMachine;

import java.util.Scanner;

public class CollectMoney {

    Scanner scanner = new Scanner(System.in);
    MakeCoffee makeCoffee = new MakeCoffee();


    private double deposit = 0; // Customer's deposit
    private double collectedMoney; //Money in coffee machine


    public void espressoMoney() {
        //Cost of beverage in dollars
        double espressoCost = 2;
        if (checkCustomerSolvency(deposit, espressoCost)) {
            deposit -= espressoCost;
            collectedMoney += espressoCost;
            makeCoffee.makeEspresso();

        } else {
            System.out.println("Insufficient funds. Your deposit is " + deposit + " dollars.");

        }
    }

    public void cappucinoMoney() {
        double cappucinoCost = 4;
        if (checkCustomerSolvency(deposit, cappucinoCost)) {
            deposit -= cappucinoCost;
            collectedMoney += cappucinoCost;
            makeCoffee.makeCappucino();
        } else {
            System.out.println("Insufficient funds. Your deposit is " + deposit + " dollars.");

        }
    }

    public void latteMoney() {
        double latteCost = 4;
        if (checkCustomerSolvency(deposit, latteCost)) {

            deposit -= latteCost;
            collectedMoney += latteCost;
            makeCoffee.makeLatte();
        } else {
            System.out.println("Insufficient funds. Your deposit is " + deposit + " dollars.");
        }
    }

    public void topUpDeposit() {
        while (true) {
            System.out.println("You can top up your deposit with 1, 5, 10 and 20 dollars");
            System.out.println("Press 1 to insert 1 dollar");
            System.out.println("Press 5 to insert 5 dollars");
            System.out.println("Press 10 to insert 10 dollars");
            System.out.println("Press 20 to insert 20 dollars");
            System.out.println("Press 0 to exit");

            int depositedFunds = scanner.nextInt();

            if (depositedFunds == 1) {
                deposit += depositedFunds;
                System.out.println("Your deposit is " + deposit + " dollars.");

            } else if (depositedFunds == 5) {
                deposit += depositedFunds;
                System.out.println("Your deposit is " + deposit + " dollars.");

            } else if (depositedFunds == 10) {
                deposit += depositedFunds;
                System.out.println("Your deposit is " + deposit + " dollars.");

            } else if (depositedFunds == 20) {
                deposit += depositedFunds;
                System.out.println("Your deposit is " + deposit + " dollars.");

            } else if (depositedFunds == 0) {
                break;
            } else {
                System.out.println("Sorry no such value available =(");
            }
        }
    }

    public double giveChange() {
        double change = deposit;
        deposit -= change;
        return change;
    }

    public double getDeposit() {
        return deposit;
    }

    public boolean checkCustomerSolvency(double deposit, double beverageCost) {
        boolean flag;
        if (deposit >= beverageCost) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public double getCollectedMoney() {
        return collectedMoney;
    }
}
