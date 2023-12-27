package tcs.koevasilev.stationeryaccounting;

public class Scissors extends Stationery {

    public Scissors(String name, double price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    public Scissors(String name, int price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    public Scissors(String name, long price, double width, double lenght) {
        super(name, price);
        this.width = width;
        this.lenght = lenght;
    }

    private double width;
    private double lenght;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

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
        return "Scissors{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", width=" + width +
                ", lenght=" + lenght +
                '}';
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
}
