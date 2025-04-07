public class Customer {
    public String firstName;

    public String lastName;
    public String CustomerId;
    public String  Address;

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

           setFirstName("Patrick");
            if (getFirstName()<3)
            {
                throw new IllegalAccessException("First Name is too small");
            }
            else{
        return firstName;}
    }
    public String lastName() {
            setLastName("Flanagan");;
        if (getLastName()<3)
        {
            throw new IllegalAccessException("Last Name is too small");
        }
        else{
        return lastName;}
    }

    public String CustomerId(){
        setCustomerId("customerid");
        if (getCustomerId()<8 || getCustomerId()>12)
        {
            throw new IllegalAccessException("Id must be between 8 to 12 charcters long");
        }
        else{
        return CustomerId;}
    }
    public String Address(){
        setCustomerId("County Galway");
        if (getAddress()<10 || getAddress()>42)
        {
            throw new IllegalAccessException("Address must be between 10 to 42 charcters long");
        }
        else{
            return CustomerId;}
    }
}
