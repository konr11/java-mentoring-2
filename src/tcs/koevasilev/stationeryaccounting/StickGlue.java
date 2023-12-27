package tcs.koevasilev.stationeryaccounting;

public class StickGlue extends Glue{


    public StickGlue(String name, double price, double width, double lenght) {
        super(name, price, width, lenght);
    }

    public StickGlue(String name, int price, double width, double lenght) {
        super(name, price, width, lenght);
    }

    public StickGlue(String name, long price, double width, double lenght) {
        super(name, price, width, lenght);
    }
    public int compareTo(Stationery stationery) {
        if (this.getPrice() == stationery.getPrice()) {
            return 0;
        } else if (this.getPrice() < stationery.getPrice()) {
            return -1;
        } else {
            return 1;
        }
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
        return "StickGlue{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                "width=" + super.getWidth() +
                ", lenght=" + super.getLenght() +
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
