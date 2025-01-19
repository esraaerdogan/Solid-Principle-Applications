public interface CustomerDao {
    Customer create(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
}