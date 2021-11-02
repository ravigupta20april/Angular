package booking;
import java.util.*;

public class BookingAppController {


	static Seat arr[] = new Seat[10];
	HashMap<String , Integer> hashmap = new HashMap<>();
	static int bookedSeats = 0;
	
	
	public BookingAppController() {
		arr = new Seat[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new Seat(i++, false);
		}
	}
	
	public void bookSeat(String username)
	{
		// generate random seat number
		// code to book the seat
		// print ticket
		
		if(hashmap.containsKey(username)) {
			if(hashmap.get(username)<6) {
				int seatNumber = new Random().nextInt();
				arr[bookedSeats].setStatus(true);
				bookedSeats++;
				int count = hashmap.get(username);
				hashmap.put(username, count+1);
				System.out.println(seatNumber+"Ticket generated for:"+username);
				}
			else {
				System.out.println("Seat cannot be booked as you booked 6 seats!!");
			}
		}
		else {
			int seatNumber = new Random().nextInt();
			arr[bookedSeats].setStatus(true);
			bookedSeats++;
			hashmap.put(username, 1);
			System.out.println(seatNumber+"Ticket generated for"+username);
		}
	}
	public int ticketsLeftToBeBooked() {
		return 10-bookedSeats;
	}
}
