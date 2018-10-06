package vending;


public enum Coin {
    ONE(1), FIVE(5), TEN(10), TWENTYFIVE(25);

    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}

