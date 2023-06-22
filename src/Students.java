import java.util.Optional;

public class Students {
    private String name;
    private Optional<Address> address;


    public Students(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }


    public Students(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public Optional<Address> getAddress() {
        return address;
    }
}
