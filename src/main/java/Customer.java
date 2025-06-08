public class Customer {
    String name;
    String lastName;
    int customerNumber;
    private CreditCard creditcard;
    ContactInfo contactInfo;

    public Customer(String lastName, String name, CreditCard creditcard, ContactInfo contactInfo) {
        this.lastName = lastName;
        this.name = name;
        this.creditcard = creditcard;
        this.contactInfo = contactInfo;
    }

    public Customer(String lastName, String name, int customerNumber, CreditCard creditcard, ContactInfo contactInfo) {
        this.lastName = lastName;
        this.name = name;
        this.customerNumber = customerNumber;
        this.creditcard = creditcard;
        this.contactInfo = contactInfo;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }

    public CreditCard getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
