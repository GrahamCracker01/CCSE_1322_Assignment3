//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public abstract class Customer {
    //variables
    private char letter;
    private int ticketNumber;
    static int nextA = 1, nextB = 1, nextC = 1, nextD = 1;

    //constructors
    public Customer() {
        letter = 'X';
        ticketNumber = 0;
    }

    public Customer(char letter){
        switch (letter) {
            case 'A':
                this.letter = letter;
                ticketNumber = nextA;
                nextA++;
                break;
            case 'B':
                this.letter = letter;
                ticketNumber = nextB;
                nextB++;
                break;
            case 'C':
                this.letter = letter;
                ticketNumber = nextC;
                nextC++;
                break;
            case 'D':
                this.letter = letter;
                ticketNumber = nextD;
                nextD++;
                break;
            default:
                this.letter = 'X';
                ticketNumber = 0;
                System.out.println("Error, letter must be A, B, C, or D");
        }
    }

    //getters
    protected String getTicketNumber() {
        return (letter + String.valueOf(ticketNumber));
    }

    public abstract String getCustomerInfo();

}
