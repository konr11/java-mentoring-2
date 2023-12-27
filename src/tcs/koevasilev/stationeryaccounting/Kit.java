package tcs.koevasilev.stationeryaccounting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Kit {

    public Kit(String name,Stationery[] stationeries) {
        this.name=name;
        this.stationeries = stationeries;
        for (Stationery st : stationeries)
            this.price += st.getPrice();

    }

    private String name;
    private double price = 0;
    private Stationery[] stationeries;

    public void nameSort(){
        Arrays.sort(stationeries,new Comparator<Stationery>() {

            public int compare(Stationery o1, Stationery o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void priceSort(){
        Arrays.sort(stationeries,new Comparator<Stationery>() {

            public int compare(Stationery o1, Stationery o2) {

                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }
    public void priceNameSort(){
        Arrays.sort(stationeries,new Comparator<Stationery>() {

            public int compare(Stationery o1, Stationery o2) {
                if (o1.getName().compareTo(o2.getName()) == 0 && (int) (o1.getPrice() - o2.getPrice()) == 0){
                    return 0;
                } else if (o1.getName().compareTo(o2.getName()) > 0 && (int) (o1.getPrice() - o2.getPrice()) > 0) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
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
