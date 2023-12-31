package tcs.koevasilev.stationeryaccounting;

import java.util.Objects;

public abstract class Stationery {

    public Stationery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Stationery(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Stationery(String name, long price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationery)) return false;
        Stationery that = (Stationery) o;
        return Double.compare(getPrice(), that.getPrice()) == 0 && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
