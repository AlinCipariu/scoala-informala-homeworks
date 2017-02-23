package org.ca.fes;
import java.util.Map;
/**
 * This class inherits the atributs and methods of Thread class
 * Created by Alin Cipariu on 2/8/17.
 */
public class Statistic extends Thread {
	
	    public final Gate gate;

	    public Statistic (Gate gate) {
	        this.gate = gate;
	    }

	    @Override
	    public void run() {
	        while(true) {
	            try {
	                sleep(5000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            if(!gate.getPurchasedTickets().isEmpty()) {
	            	publishStatistics();
	            } else {
	                throw new IllegalArgumentException();
	            }
	        }
	    }
	    /**
	     * This method prints the statistics of the festival.
	     * Created by Alin Cipariu on 2/8/17.
	     */
	    private void publishStatistics(){
	        for (Map.Entry<Ticket, Integer> entry : gate.getPurchasedTickets().entrySet()){
	            System.out.println(entry.getValue() + " TICKET TYPE: " + entry.getKey());
	        }
	    }
	
}
