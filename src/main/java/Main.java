public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Terri", "de Boer", new MasterCard(100), new EmailContact("test@test.nl"));
        Customer customer2 = new Customer("Jack", "Spearow", new VisaCard(300), new SmsContact(123456789));

        customer.printName();
        customer2.printName();

        customer.getCreditcard().pay(50);
        customer2.getCreditcard().pay(100);

        System.out.println(customer.getCreditcard().getDebt());
        System.out.println(customer2.getCreditcard().getDebt());

        customer.getContactInfo().sendMessage();
        customer2.getContactInfo().sendMessage();

    }
}
