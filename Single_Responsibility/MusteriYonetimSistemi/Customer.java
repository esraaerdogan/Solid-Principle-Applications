import java.util.Date;

public class Customer {
    private String name;
    private String firstName;
    private Date birthday;

    public Customer(String name, String firstName, Date birthday) {
        this.name = name;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getFirstName() { return firstName;}
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }
}
