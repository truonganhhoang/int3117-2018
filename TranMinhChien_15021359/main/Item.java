package vending;

public enum Item {
    COCA("Coca", 25), PEPSI("Pepsi", 35), MIRINDA("Mirinda", 45);

    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}

