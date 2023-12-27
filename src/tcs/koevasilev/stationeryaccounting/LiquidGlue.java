package tcs.koevasilev.stationeryaccounting;

public class LiquidGlue extends Glue {

    public LiquidGlue(String name, double price, double width, double lenght, double volume) {
        super(name, price, width, lenght);
        this.volume = volume;
    }

    public LiquidGlue(String name, int price, double width, int lenght, double volume) {
        super(name, price, width, lenght);
        this.volume = volume;
    }

    public LiquidGlue(String name, long price, double width, long lenght, double volume) {
        super(name, price, width, lenght);
        this.volume = volume;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
        return "LiquidGlue{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", width=" + super.getWidth() +
                ", lenght=" + super.getLenght() +
                ", volume=" + volume +
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
