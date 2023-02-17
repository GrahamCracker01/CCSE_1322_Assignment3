//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Suspended extends Customer{
    private String customerName, violation;

    //constructor
    public Suspended(String customerName, String violation) {
        super('D');
        this.customerName = customerName;
        this.violation = violation;
    }

    @Override
    public String getCustomerInfo() {
        return ("Violation: " + violation + ". Ticket Number " + getTicketNumber() + ". Name: " + customerName);
    }
}
