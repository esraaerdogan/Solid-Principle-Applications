public class EmailServiceImpl implements EmailService{
    @Override
    public void sendEmail(Customer customer) {
        System.out.println("Email sent to " + customer.getName() + " (" + customer.getFirstName() + ").");
    }    
}