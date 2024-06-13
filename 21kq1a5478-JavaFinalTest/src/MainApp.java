
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket("PNR001", "Delhi", "sarovar", 250.00);
        Ticket t2 = new Ticket("PNR002", "Goa", "Amigo", 150.00);
        Ticket t3 = new Ticket("PNR003", "Pondicherry", "FrenchColony", 200.00);
        t1.addTicket(t1);
        t2.addTicket(t2);
        t3.addTicket(t3);
        t1.showTicketsBooked();
        t1.ticketCount();

	}

}
