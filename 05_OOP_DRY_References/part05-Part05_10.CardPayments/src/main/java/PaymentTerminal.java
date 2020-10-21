
public class PaymentTerminal {

    private static final double affordablePrice = 2.5;
    private static final double heartyPrice = 4.3;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < affordablePrice) {
            return payment;
        }

        this.money += affordablePrice;
        this.affordableMeals++;

        return payment - affordablePrice;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < heartyPrice) {
            return payment;
        }

        this.money += heartyPrice;
        this.heartyMeals++;

        return payment - heartyPrice;
    }


    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() < affordablePrice) {
            return false;
        }

        card.takeMoney(affordablePrice);
        this.affordableMeals++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() < heartyPrice) {
            return false;
        }

        card.takeMoney(heartyPrice);
        this.heartyMeals++;
        return true;
    }


    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }

        card.addMoney(sum);
        this.money += sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
