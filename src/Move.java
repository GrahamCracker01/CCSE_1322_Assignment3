//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Move extends Customer{
    private String customerName, previousState;

    //constructor
    public Move(String customerName, String previousState) {
        super('C');
        this.customerName = customerName;
        this.previousState = previousState;
    }

    @Override
    public String getCustomerInfo() {
        return ("Moved from " + previousState + ". Ticket Number " + getTicketNumber() + ". Name: " + customerName);
    }
}
