import tcs.koevasilev.stationeryaccounting.*;

import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        StationeryAccounting stationeryAccounting = new StationeryAccounting();
        stationeryAccounting.addEmployee("Павел", new Stationery[]{new StickGlue("Момент-карандаш small",300,4,5),
                                                                            new StickGlue("Момент-карандаш big",1000,4,5)});
        stationeryAccounting.addEmployee("Павел", new Stationery[]{new LiquidGlue("Клей 1",300,3,4,200),
                                                                            new LiquidGlue("Клей",400.5,66,7,300)});

        stationeryAccounting.addEmployee("Марк");
        stationeryAccounting.getAllEmployees();
        stationeryAccounting.ShowStationeryPriceByEmpId(1);
        stationeryAccounting.addEmployee("Адам", new Stationery[]{new LiquidGlue("Клей 1",300,3,4,200)});
        Kit beginnerset = new Kit("набор новичка",new Stationery[]{new Scissors("Новые ножницы",250,3,4),
                                                                            new LiquidGlue("ПВА",400.4,4,4,200),
                                                                            new StickGlue("Клей карандаш",330.4,2,4)});
        stationeryAccounting.addKitByEmpId(4,new Kit[]{beginnerset});
        stationeryAccounting.ShowStationeryPriceByEmpId(4);
        stationeryAccounting.getEmployeeById(4);
        //Задание 4.  Сортировка:
        beginnerset.nameSort();
        System.out.println(beginnerset);

        beginnerset.priceSort();
        System.out.println(beginnerset);

        beginnerset.priceNameSort();
        System.out.println(beginnerset);

    }
}