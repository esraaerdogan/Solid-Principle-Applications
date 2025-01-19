public class CustomerDaoImpl implements CustomerDao {
    @Override
    public Customer create(Customer customer) {
        System.out.println("Customer " + customer.getName() + " created.");
        return customer;
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer " + customer.getName() + " deleted.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer " + customer.getName() + " updated.");
    }
}
