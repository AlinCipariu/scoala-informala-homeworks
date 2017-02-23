package org.ca.fes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
/**
 * This class contains one queue and one hashmap. 
 * Created by Alin Cipariu on 2/8/17.
 */
public class Gate {
	
	private Queue<Ticket> ticketsQueue = new LinkedList<>();
    private Map<Ticket, Integer> purchasedTickets = new HashMap<>();
    /**
     * This is a constructor.
     * Created by Alin Cipariu on 2/8/17.
     */
    public Gate() {
        for(Ticket t : Ticket.values()){
        	purchasedTickets.put(t, 0);
        }
    }
    /**
     * This method counts the bought tickets.
     * Created by Alin Cipariu on 2/8/17.
     */
    public void addTicket(Ticket ticket){
        ticketsQueue.add(ticket);
        int ticketsOfKind = purchasedTickets.get(ticket);
        purchasedTickets.put(ticket, ticketsOfKind + 1);
    }

    public Map<Ticket, Integer> getPurchasedTickets() {
        return purchasedTickets;
    }
    /**
     * This method resets the queue and the hashmap.
     * Created by Alin Cipariu on 2/8/17.
     */
    public void clearData(){
        ticketsQueue.clear();
        purchasedTickets.clear();
    }
}
