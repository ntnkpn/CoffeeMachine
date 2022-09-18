package EspressoMachine;

import java.util.Scanner;

public class CollectMoney {

    Scanner scanner = new Scanner(System.in);
    MakeCoffee makeCoffee = new MakeCoffee();


    private double deposit = 0; // Customer's deposit. Default is 0
    private double collectedMoney; //Money in coffee machine. Default is 0


    public void espressoMoney() {

        double espressoCost = 2;  //Cost of beverage in dollars
        if (checkCustomerSolvency(deposit, espressoCost)) {  // Checking possibility of making beverage. If true making coffee and collecting money
            deposit -= espressoCost; // Subtracting cost of espresso shot from deposit
            collectedMoney += espressoCost;  // Adding money to collect in coffee machine
            makeCoffee.makeEspresso(); // Making coffee

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

    public void topUpDeposit() {  // Function to add money to deposit
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

    public double giveChange() {  // Give change if it needs
        double change = deposit;
        deposit -= change;
        return change;
    }

    public double getDeposit() {
        return deposit;
    }  // Returns value of deposit

    public boolean checkCustomerSolvency(double deposit, double beverageCost) {  // Returns true if customer have enough money on deposit
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
    }  // Returns earned money after giving change
}
