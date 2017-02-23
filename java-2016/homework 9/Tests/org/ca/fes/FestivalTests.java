package org.ca.fes;

import org.junit.Assert;
import org.junit.Test;

public class FestivalTests {

	@Test
    public void gateCountsCorrectlyTheConfirmedTickets(){
        Gate gate = new Gate();
        gate.addTicket(Ticket.FREE_PASS);
        int ticketsOfKind = gate.getPurchasedTickets().get(Ticket.FREE_PASS);
        Assert.assertEquals(ticketsOfKind, 1);
    }
	
	@Test
    public void statiscAreReadCorrectlyFromTheGate(){
		Gate gate = new Gate();
        gate.addTicket(Ticket.FREE_PASS);
        gate.addTicket(Ticket.FREE_PASS);
        gate.addTicket(Ticket.FREE_PASS);
        gate.addTicket(Ticket.ONE_DAY);
        Statistic sts = new Statistic(gate);
        Assert.assertEquals(sts.gate.getPurchasedTickets().equals(gate.getPurchasedTickets()), true);
        Assert.assertEquals(Integer.valueOf(sts.gate.getPurchasedTickets().get(Ticket.FREE_PASS)), Integer.valueOf(3));
		gate.clearData();
	}
}
