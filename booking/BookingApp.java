package booking;
import java.util.*;

public class BookingApp{
	public static void main(String[] args) {
		BookingAppUsers bookingappusers= new BookingAppUsers();
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Booking App");
			System.out.println("1 - Book Ticket");
			System.out.println("2 - Seats Left");
			System.out.println("3 - End the App");
			System.out.println("Enter your Choice");
			int ch=Integer.parseInt(sc.nextLine());
			
			switch(ch)
			{
			case 1:bookingappusers.BookTicket();
			     break;
			case 2:bookingappusers.seatsLeft();
			     break;
			case 3:System.exit(1);
			      break;
			default:System.out.println("Enter Valid Choice:");
			}
		}
	}
	
}