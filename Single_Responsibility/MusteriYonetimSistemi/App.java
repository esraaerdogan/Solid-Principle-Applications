import java.util.Date;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("Doe", "John", new Date());

        // Login Service
        LoginService loginService = new LoginServiceImpl();
        loginService.login(customer);

        // Email Service
        EmailService emailService = new EmailServiceImpl();
        emailService.sendEmail(customer);

        // Customer Data Access Object
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.create(customer);
        customerDao.update(customer);
        customerDao.delete(customer);
    }
}
