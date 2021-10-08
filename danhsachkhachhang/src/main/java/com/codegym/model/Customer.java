import java.util.Date;

public class Customer {
    private String name;
    private Date dateOfBird;
    private String address;
    private String avatar;

    public Customer(String name, Date dateOfBird, String address, String avatar) {
        this.name = name;
        this.dateOfBird = dateOfBird;
        this.address = address;
        this.avatar = avatar;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getdateOfBird() {
        return dateOfBird;
    }

    public void setAge(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
