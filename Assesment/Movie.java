class Movie {

    Ticket tickets[] = new Ticket[2];
    int index;
    public boolean createTicket(Ticket ticket) {

        boolean isSeatValid = false;
        boolean isNameValid = false;
        boolean isPriceValid = false;
        boolean isTypeValid = false;

        if (ticket.seatNo > 0) {
            isSeatValid = true;
        } else System.out.println(ticket.seatNo + " not valid");

        if (ticket.customerName != null && !ticket.customerName.isEmpty()) {
            isNameValid = true;
        } else System.out.println(ticket.customerName + " not valid");

        if (ticket.price > 100) {
            isPriceValid = true;
        } else System.out.println(ticket.price + " not valid");

        if (ticket.type != null && !ticket.type.isEmpty()) {
            isTypeValid = true;
        } else System.out.println(ticket.type + " not valid");

        if (isSeatValid && isNameValid && isPriceValid && isTypeValid) {
            tickets[index++] = ticket;
            return true;
        }

        return false;
    }

    public void getTickets() {
        System.out.println("Booked Tickets:");
        for (Ticket ticket : tickets) 
		{
            if (ticket != null) {
                System.out.println("Seat No is: " + ticket.seatNo);
                System.out.println("Customer is: " + ticket.customerName);
                System.out.println("Price is: " + ticket.price);
                System.out.println(" The Type is: " + ticket.type);
            }
        }
    }
    public int searchSeat(int seatNo) {
    for (Ticket ticket : tickets) {
        if (ticket != null && ticket.seatNo == seatNo) {
            return ticket.seatNo;
        }
    }
    return 0;
}
    public boolean updateSeat(int oldSeat, int newSeat) {
        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.seatNo == oldSeat) {
                ticket.seatNo = newSeat;
                System.out.println("Seat updated");
                return true;
            }
        }
        System.out.println("Seat not found");
        return false;
    }
	
    public boolean deleteSeat(int seatNo) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != null && tickets[i].seatNo == seatNo) {
                tickets[i] = null;
                System.out.println("Ticket deleted");
                return true;
            }
        }
        System.out.println("Seat not found");
        return false;
    }
}