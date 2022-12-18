class Waffle {
    private String flavor;
    private float price;

    Waffle(String flavor, float price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public float getPrice() {
        return price;
    }
}

class WaffleMain extends Waffle {
    WaffleMain(String flavor, float price) {
        super(flavor, price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WaffleMain)) return false;

        WaffleMain w = (WaffleMain) o;
        return w.getFlavor() == getFlavor() && w.getPrice() == getPrice();
    }

    @Override
    public String toString() {
        return "(Flavor: " + getFlavor() + " Price: " + getPrice() + ")";
    }
}

public class bp7 {
    public static void main(String[] args) {
        WaffleMain w1 = new WaffleMain("vanilla", 10f);
        WaffleMain w2 = new WaffleMain("choclate", 15f);

        System.out.println(w1.equals(w2));
        System.out.println(w1);
    }
}
