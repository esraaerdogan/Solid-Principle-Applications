public class LoginServiceImpl implements LoginService {
    @Override
    public void login(Customer customer) {
        System.out.println("Customer " + customer.getName() + " logged in.");
    }
}