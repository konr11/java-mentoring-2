import tcs.koevasilev.stationeryaccounting.Stationery;
import tcs.koevasilev.stationeryaccounting.StationeryAccounting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        StationeryAccounting stationeryAccounting = new StationeryAccounting();
        stationeryAccounting.addEmployee("Павел", new Stationery[]{new Stationery("Ручка",300), new Stationery("Калькулятор",1000)});
        stationeryAccounting.addEmployee("Павел", new Stationery[]{new Stationery("Ручка",300), new Stationery("Клей",400.5)});

        stationeryAccounting.addEmployee("Марк");
        stationeryAccounting.getAllEmployees();
        stationeryAccounting.ShowStationeryPriceByEmpId(1);
        stationeryAccounting.addStationeryToEmpById(new Stationery[]{new Stationery("ПВА", 200),new Stationery("Степлер", 450)},3);
        stationeryAccounting.getEmployeeById(3);
    }
}