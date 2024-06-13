

	import java.util.ArrayList;

	public class Ticket {
	    private String pnrNumber;
	    private String source;
	    private String destination;
	    private double price;

	    private static ArrayList<Ticket> ticketList = new ArrayList<>();

	    // Constructor
	    public Ticket(String pnrNumber, String source, String destination, double price) {
	        this.pnrNumber = pnrNumber;
	        this.source = source;
	        this.destination = destination;
	        this.price = price;
	    }

	    // Method to add new ticket
	    public void addTicket(Ticket t) {
	        ticketList.add(t);
	    }

	    // Method to display all booked tickets
	    public void showTicketsBooked() {
	        System.out.println("Booked Tickets:");
	        for (Ticket t : ticketList) {
	            System.out.println("PNR Number: " + t.pnrNumber +
	                               ", Source: " + t.source +
	                               ", Destination: " + t.destination +
	                               ", Price: " + t.price);
	        }
	    }

	    // Method to display the total number of tickets booked
	    public void ticketCount() {
	        System.out.println("Total number of tickets booked: " + ticketList.size());
	    }
	}



