//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class NewTest extends Customer{
    private String customerName, dateOfBirth;

    //constructor
    public NewTest(String customerName, String dateOfBirth) {
        super('A');
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getCustomerInfo() {
        return ("New Drivers License. Ticket Number " + getTicketNumber() + ". Name: " + customerName + " DOB: "+ dateOfBirth);
    }
}
