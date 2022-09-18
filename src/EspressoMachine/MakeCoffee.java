package EspressoMachine;

public class MakeCoffee {

    private double coffeeBeans;
    private double water;
    private double milk;

    void addCoffeeBeans() {
        this.coffeeBeans = 1500;
    }

    void addWater() {
        this.water = 5000;
    }

    void addMilk() {
        this.milk = 3000;
    }

    double getCoffeeBeans() {
        return coffeeBeans;
    }

    double getWater() {
        return water;
    }

    double getMilk() {
        return milk;
    }

    public void makeEspresso() {
        water -= 30;
        coffeeBeans -= 18;
        System.out.println("Making one shot of espresso. Just a minute =)");
        System.out.println("Here's your espresso, have a nice day!");
    }

    public void makeCappucino() {
        water -= 30;
        coffeeBeans -= 18;
        milk -= 100;
        System.out.println("Making one shot of cappucino. Just a minute =)");
        System.out.println("Here's your cappucino, have a nice day!");
    }

    public void makeLatte() {
        water -= 30;
        coffeeBeans -= 18;
        milk -= 100;
        System.out.println("Making one shot of latte. Just a minute =)");
        System.out.println("Here's your latte, have a nice day!");
    }
}
