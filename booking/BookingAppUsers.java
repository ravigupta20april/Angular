package booking;
import java.util.*;

public class BookingAppUsers {

	String user;
	BookingAppController bookingappcontroller = new BookingAppController();
	
	public void BookTicket() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Username");
		user =sc.nextLine();
		bookingappcontroller.bookSeat(user);
	}
	
	public void seatsLeft() {
		System.out.println("Seats Left:"+ bookingAppController.ticketsLeftToBeBooked);
	}

	public void seatsLeft() {
		// TODO Auto-generated method stub
		
	}
	
	
}