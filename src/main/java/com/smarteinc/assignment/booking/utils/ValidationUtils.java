package com.smarteinc.assignment.booking.utils;

import com.smarteinc.assignment.booking.models.Ticket;

import java.util.Objects;

public class ValidationUtils {
    /**
     * We can do it in two way's we can keep the this function as it is and let it throw nullpointer exception
     * or we can chenge return type to boolean and wrap the code in try catch and add iff condition in booking process
     * i will prefer to go with 2nd approch
     * @param ticket
     */
    public boolean validateAllFieldsPresent(Ticket ticket) {

            Objects.requireNonNull(ticket, "Please Enter Required Details");
            Objects.requireNonNull(ticket.getStartDate(), "Please Enter Required Details");
            Objects.requireNonNull(ticket.getEndDate(), "Please Enter Required Details");
            Objects.requireNonNull(ticket.getFrom(), "Please Enter Required Details");
            Objects.requireNonNull(ticket.getDestination(), "Please Enter Required Details");
            Objects.requireNonNull(ticket.getPassenger(), "Please Enter Required Details");
            return true;

    }
}
