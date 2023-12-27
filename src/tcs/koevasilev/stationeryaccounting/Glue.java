package tcs.koevasilev.stationeryaccounting;

public abstract class Glue extends Stationery {
    public Glue(String name, double price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    public Glue(String name, int price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    public Glue(String name, long price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    private double width;
    private double lenght;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }
}
