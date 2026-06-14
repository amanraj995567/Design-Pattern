package Structural.proxy.Example2;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.create(client,obj );
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if(client.equals("DELETE")){
            employeeDaoObj.delete(client, id);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
         if(client=="ADMIN" || client=="USER"){
             employeeDaoObj.get(client, employeeId);
         }
        throw new Exception("Access Denied");
    }
}
