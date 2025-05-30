public class Customer {
    String name;
    String lastName;
    int customerNumber;
    private CreditCard creditcard;

    public Customer(String lastName, String name, CreditCard creditcard) {
        this.lastName = lastName;
        this.name = name;
        this.creditcard = creditcard;
    }

    public Customer(String lastName, String name, int customerNumber, CreditCard creditcard) {
        this.lastName = lastName;
        this.name = name;
        this.customerNumber = customerNumber;
        this.creditcard = creditcard;
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
}
