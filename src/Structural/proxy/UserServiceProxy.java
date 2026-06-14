package Structural.proxy;

public class UserServiceProxy implements UserService{

   private UserService realService;
   public UserServiceProxy(UserService realService){
       this.realService = realService;
   }


    @Override
    public void getUser(User caller, User target) {
        realService.getUser(caller, target);
    }

    @Override
    public void deleteUser(User caller, User target) {
         if(caller.getRole() == Role.ADMIN || caller.getName().equals(target.getName())){
             realService.deleteUser(caller, target);
         }
         else{
             System.out.println(caller.getName() + " is not authorised to delete user" + target.getName());
         }
    }
}
