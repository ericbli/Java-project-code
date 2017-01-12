package bookingsystem;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Threadtask implements Runnable {
	public static boolean stop = false;

	@Override
	public void run() {
		
		
		while(!stop){
		

		System.out.println("Running!");

		

		
			

			// Flight flighttemp= Flight;
			for (int i = 0; i < Main.flightlist.getFlight().size(); i++) {

				String AAA = Main.flightlist.flight.get(0).Flightdate;
				String flyStart = AAA;
				System.out.println("This flight's  Fly time is: " + flyStart);

				// HH converts hour in 24 hours format (0-23), day calculation
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = new Date();
				String nowtime = format.format(date);
				System.out.println("Present time is:   " + nowtime);

				Date d1 = null;
				Date d2 = null;

				try {
					d2 = format.parse(flyStart);
					d1 = format.parse(nowtime);

					// in milliseconds
					long diff = d2.getTime() - d1.getTime();

					long difftotalm = diff / (60 * 1000);

					long diffSeconds = diff / 1000 % 60;
					long diffMinutes = diff / (60 * 1000) % 60;
					long diffHours = diff / (60 * 60 * 1000) % 24;
					long diffDays = diff / (24 * 60 * 60 * 1000);
					System.out.print("Time left untill flying: ");
					System.out.print(diffDays + " days, ");
					System.out.print(diffHours + " hours, ");
					System.out.print(diffMinutes + " minutes, ");
					System.out.println(diffSeconds + " seconds.");

					if (difftotalm >= 120) {
						System.out.println("This flight " + Main.flightlist.getFlight().get(i) + " is open to book!");
					}
					if (difftotalm < 120) {
						System.out.println("Too little time forThis flight !  It is closed for booking!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

//				System.out.println("Flight Size:   " + Main.flightlist.flight.size());
//				System.out.println("Seat size:" + Main.seatlist.getSeat().size());
//				System.out.println(" All flights  " + Main.seatlist.getSeat().size() + "   seats  is ready!");


			}
			System.out.println("Flight Size:   " + Main.flightlist.flight.size());
			System.out.println("Seat size:" + Main.seatlist.getSeat().size());
			System.out.println(" All flights  " + Main.seatlist.getSeat().size() + "   seats  is ready!");
			

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
			System.out.println("Thread has finished");
		
	}
}