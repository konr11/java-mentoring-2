package tcs.koevasilev.stationeryaccounting;

import java.util.Arrays;
import java.util.Objects;
//замнить на рабочее место
public class Employee {

    public Employee(String name,int id) {
        this.name = name;
        Id = id;
    }
    public Employee(String name,int id ,Stationery[] stationeries) {
        this(name, id);
        this.stationeries = stationeries;
    }

    private String name;
    private final int Id;


    Stationery[] stationeries = new Stationery[0];

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", stationeries=" + Arrays.toString(stationeries) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stationery[] getStationeries() {
        return stationeries;
    }

    public void setStationeries(Stationery[] stationeries) {
        this.stationeries = stationeries;
    }



}
