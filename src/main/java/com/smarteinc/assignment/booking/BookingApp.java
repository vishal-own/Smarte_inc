package com.smarteinc.assignment.booking;

import com.smarteinc.assignment.booking.models.Ticket;
import com.smarteinc.assignment.booking.utils.TicketUtils;

import java.util.ArrayList;
import java.util.Objects;




public class BookingApp {


	/**
	 * 2) Removed else if which through IllegalArgumentException
	 * (As per requirement only accepted types are 1 and 2 rest all are invalid )
	 *
	 * 3)
	 * @param x
	 * @return
	 */
	public int bookingProcess(Ticket x) {

		if (x.getType() == 1) {
			return new TicketUtils().bookBusTicket(x);
		} else if (x.getType() == 2) {
			return new TicketUtils().bookCarTicket(x);
		} else {
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}
	}

	/**
	 * Changed Return type to boolean from void
	 * added logic to check if bus or car is full
	 *
	 * @param x
	 * @return
	 */

}











