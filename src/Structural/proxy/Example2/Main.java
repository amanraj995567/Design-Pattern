package Structural.proxy.Example2;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDaoObj = new EmployeeDaoProxy();
            employeeDaoObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
