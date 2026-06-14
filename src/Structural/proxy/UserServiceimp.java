package Structural.proxy;

public class UserServiceimp implements UserService{


    @Override
    public void getUser(User caller, User target) {
        System.out.println(caller.getName() + "fetch user details for:" +  target.getName());
    }

    @Override
    public void deleteUser(User caller, User target) {
        System.out.println(caller.getName() + "deleted user:" + target.getName());
    }
}
