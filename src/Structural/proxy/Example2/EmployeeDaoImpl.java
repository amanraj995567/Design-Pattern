package Structural.proxy.Example2;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created a new row in employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted a  row with employeeId"+employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetching data from db");
        return new EmployeeDo();
    }
}
