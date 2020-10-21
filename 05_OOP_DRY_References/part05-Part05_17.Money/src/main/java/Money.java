
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }


    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        Money newMoney = new Money(euros, cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros <= compared.euros && this.cents < compared.cents) {
            return true;
        }

        else {
            return false;
        }

    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }

        if (euros < 0) {
            return new Money(0, 0);

        }

        return new Money(euros, cents);
    }

}
