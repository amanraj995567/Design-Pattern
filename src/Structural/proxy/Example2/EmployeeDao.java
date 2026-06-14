package Structural.proxy.Example2;

public interface EmployeeDao {
    public void create(String client, EmployeeDo obj)throws Exception;
    public void  delete(String client, int id) throws Exception;
    public  EmployeeDo get(String client, int employeeId)throws  Exception;
}
