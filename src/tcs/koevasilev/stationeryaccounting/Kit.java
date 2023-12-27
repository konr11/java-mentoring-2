package tcs.koevasilev.stationeryaccounting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Kit {

    public Kit(String name, Stationery[] stationeries) {
        this.name = name;
        this.stationeries = stationeries;
        for (Stationery st : stationeries)
            this.price += st.getPrice();

    }

    private String name;
    private double price = 0;
    private Stationery[] stationeries;

    public void nameSort() {
        Arrays.sort(stationeries, new NameComparator());
        for (Stationery val : stationeries)
            System.out.println(val);
    }

    public void priceSort() {
        Arrays.sort(stationeries, new PriceComparator());
        for (Stationery val : stationeries)
            System.out.println(val);
    }

    public void priceNameSort() {
        stationeries = Arrays.stream(stationeries).sorted(
                Comparator.comparing(Stationery::getPrice).thenComparing(Stationery::getName)
        ).toArray(Stationery[]::new);
        for (Stationery val : stationeries)
            System.out.println(val);
    }

    private static class PriceComparator implements Comparator<Stationery> {
        public int compare(Stationery o1, Stationery o2) {

            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

    private static class NameComparator implements Comparator<Stationery> {
        public int compare(Stationery o1, Stationery o2) {

            return o1.getName().compareTo(o2.getName());
        }
    }

    @Override
    public String toString() {
        return "Kit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stationeries=" + Arrays.toString(stationeries) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kit)) return false;
        Kit kit = (Kit) o;
        return Double.compare(getPrice(), kit.getPrice()) == 0 && Objects.equals(getName(), kit.getName()) && Arrays.equals(getStationeries(), kit.getStationeries());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice());
        result = 31 * result + Arrays.hashCode(getStationeries());
        return result;
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

    public Stationery[] getStationeries() {
        return stationeries;
    }

    public void setStationeries(Stationery[] stationeries) {
        this.stationeries = stationeries;
    }
}
