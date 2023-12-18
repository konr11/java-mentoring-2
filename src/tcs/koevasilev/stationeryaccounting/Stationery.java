package tcs.koevasilev.stationeryaccounting;

import java.util.Objects;

public class Stationery {

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
    private double price = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationery)) return false;
        Stationery that = (Stationery) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
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
    public void setPrice(int price) {
        this.price = price;
    }
    public void setPrice(long price) {
        this.price = price;
    }


}
