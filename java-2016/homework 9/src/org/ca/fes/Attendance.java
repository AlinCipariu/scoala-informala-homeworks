package org.ca.fes;

import java.util.Random;
/**
 * This class keeps tracking  of the participants at festival. 
 * Created by Alin Cipariu on 2/8/17.
 */
public class Attendance extends Thread {
	private Gate gate;
    private Ticket ticket;
    private Random random = new Random();
    /**
     * This is a constructor with 2 fields.
     * Created by Alin Cipariu on 2/8/17.
     */
    public Attendance(Gate gate, Ticket ticket) {
        this.gate = gate;
        this.ticket = ticket;
    }

    /**
     * This method makes the thread sleep for a random below 1 seconds time wait,
     * then starts it, then joins it.
     */

    public void confirmTicket(){
        try {
           sleep(random.nextInt(10) * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        start();

        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println(ticket);
            gate.addTicket(ticket);
        }
    }
}
