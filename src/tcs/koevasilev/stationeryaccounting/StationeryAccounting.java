package tcs.koevasilev.stationeryaccounting;

public class StationeryAccounting {

    private Employee[] employeesArr = new Employee[0];
    private Kit[] kit = new Kit[0];

    private int IdCounter = 1;

    public void ShowStationeryPriceByEmpId(int empId) {
        double priceSum = 0;
        System.out.println("Price By Emp Id:");
        for (Employee val : employeesArr) {
            if (val.getId() == empId) {
                for (Stationery st : val.getStationeries()) {
                    priceSum += st.getPrice();
                }
                for (Kit kt : val.getKit()) {
                    priceSum += kt.getPrice();
                }
                System.out.println("Стоимость канцтоваров у сотрудника: " + val.getName() + " = " + priceSum + " Id = " + val.getId());
            }
        }
    }

    public void addEmployee(String name) {
        Employee employee = new Employee(name, IdCounter);
        if (employeesArr.length == 0) {
            employeesArr = new Employee[IdCounter + 1];
            employeesArr[IdCounter - 1] = employee;
        } else {
            Employee[] NewArr = new Employee[IdCounter];
            for (int i = 0; i < employeesArr.length; i++) {
                NewArr[i] = employeesArr[i];
            }
            NewArr[IdCounter - 1] = employee;
            employeesArr = NewArr;
        }
        IdCounter++;
    }

    public void addEmployee(String name, Stationery[] stationeries) {
        Employee employee = new Employee(name, IdCounter, stationeries);
        if (employeesArr.length == 0) {
            employeesArr = new Employee[IdCounter + 1];
            employeesArr[IdCounter - 1] = employee;
        } else {
            Employee[] NewArr = new Employee[IdCounter];
            for (int i = 0; i < employeesArr.length; i++) {
                NewArr[i] = employeesArr[i];
            }
            NewArr[IdCounter - 1] = employee;
            employeesArr = NewArr;
        }
        IdCounter++;
    }

    public void addStationeryToEmpById(Stationery[] stationery, int empId) {
        for (Employee val : employeesArr) {
            if (val.getId() == empId) {
                val.setStationeries(stationery);
            }
        }
    }

    public void getEmployeeById(int empId) {
        System.out.println("Employee By Id:");
        for (Employee val : employeesArr) {
            if (val.getId() == empId) {
                System.out.println(val);
            }
        }
    }

    public void getAllEmployees() {
        System.out.println("All Employees:");
        for (Employee val : employeesArr) {
            System.out.println(val);
        }
    }

    public void addKitByEmpId(int empId, Kit[] kit) {
        for (Employee val : employeesArr) {
            if (val.getId() == empId) {
                val.setKit(kit);
            }
        }
    }
}
