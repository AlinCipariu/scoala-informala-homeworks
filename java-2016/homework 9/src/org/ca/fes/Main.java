package org.ca.fes;

import java.util.Random;

/**
 * This is the main class 
 * Created by Alin Cipariu on 2/8/17.
 */
public class Main {
	/**
	 * This is the main method 
	 * Created by Alin Cipariu on 2/8/17.
	 */
	public static void main(String[] args) {
		Gate gate = new Gate();
		Random random = new Random();

		Statistic sts = new Statistic(gate);
		try {
			sts.start();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		int attendees = random.nextInt(1000) + 100;

		for (int i = 0; i < attendees; i++) {
			Ticket ticket = Ticket.values()[random.nextInt(Ticket.values().length)];
			Attendance att = new Attendance(gate, ticket);
			att.confirmTicket();
		}
	}
}
