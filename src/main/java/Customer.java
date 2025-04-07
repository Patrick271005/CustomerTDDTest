public class Customer {
    public String firstName;

    public String lastName;
    public String CustomerId;
    public String  Address;

    public String length

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String firstName() {
        String fname="Patrick"
            firstName="Patrick";
            if (firstName<3)
            {
                throw new IllegalAccessException("First Name is too small")
            }

        return firstName;
    }
    public String lastName() {

        String fname="Flanagan"
            lastName="Flanagan";
        if (lastName<3)
        {
            throw new IllegalAccessException("Last Name is too small")
        }
        return lastName;
    }
}
