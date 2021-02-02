package com.smarteinc.assignment.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;




public class BookingApp {

	/**
	 * 1) Added 2 ArrayList of Ticket type treating it as a storage. with initial size
	 */
	private ArrayList<Ticket> carTicketList  = new ArrayList<>(3);
	private ArrayList<Ticket> busTicketList  = new ArrayList<>(17);

	/**
	 * 2) Removed else if which through IllegalArgumentException
	 * (As per requirement only accepted types are 1 and 2 rest all are invalid )
	 *
	 * 3)
	 * @param x
	 * @return
	 */
	public int bookingProcess(Ticket x) {
	if(x.getType() == 1) {

			if(validateAllFieldsPresent(x)){
			if (bookBusTicket(x)) {
				return sendTicketBookedMail(x);
			} else {
				throw new IllegalStateException("bus is full");
			}}else {
				throw new IllegalStateException("Please check all your inputs");

			}


	} else if(x.getType() == 2){
		if(validateAllFieldsPresent(x)){
		if(bookCarTicket(x)){
			return sendTicketBookedMail(x);
		}else {
			throw new IllegalStateException("Car is full");
		}}else{
			throw new IllegalStateException("Please check all your inputs");
		}
	} else {
		throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
	}
	
	//method should return the type of ticket booked
}

	/**
	 * Changed Return type to boolean from void
	 * added logic to check if bus or car is full
	 *
	 * @param x
	 * @return
	 */
	private boolean bookCarTicket(Ticket x) {
	try {
		int ticketArrayLength = carTicketList.size();
		if(ticketArrayLength < 3){
			carTicketList.add( x);
			return true;
		}else{
			return false;
		}
	}catch (Exception e){
		return false;
	}
}

private boolean bookBusTicket(Ticket x) {
	try {
		int ticketArrayLength = busTicketList.size();
		if(ticketArrayLength < 17){
			busTicketList.add( x);
			return true;
		}else{
			return false;
		}
	}catch (Exception e){
		return false;
	}
}


private int sendTicketBookedMail(Ticket x) {
	try {
		//Assume Email Sent Successfully
		return x.getType();
	}catch (Exception e){
		return -1;
	}
}

//Ensure all input data is present

	/**
	 * We can do it in two way's we can keep the this function as it is and let it throw nullpointer exception
	 * or we can chenge return type to boolean and wrap the code in try catch and add iff condition in booking process
	 * i will prefer to go with 2nd approch
	 * @param ticket
	 */
	boolean validateAllFieldsPresent(Ticket ticket) {
		try {
			Objects.requireNonNull(ticket, "Please Enter Required Details");
			Objects.requireNonNull(ticket.getStartDate(), "Please Enter Required Details");
			Objects.requireNonNull(ticket.getEndDate(), "Please Enter Required Details");
			Objects.requireNonNull(ticket.getFrom(), "Please Enter Required Details");
			Objects.requireNonNull(ticket.getDestination(), "Please Enter Required Details");
			Objects.requireNonNull(ticket.getPassenger(), "Please Enter Required Details");
			return true;
		}catch (NullPointerException e){
			return false;
		}
		}
}


