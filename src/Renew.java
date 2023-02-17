//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Renew extends Customer{
    private String customerName;

    //constructor
    public Renew(String customerName) {
        super('B');
        this.customerName = customerName;
    }

    @Override
    public String getCustomerInfo() {
        return ("Renewal License. Ticket Number " + getTicketNumber() + ". Name: " + customerName);
    }
}
