package com.smarteinc.assignment.booking.utils;

import com.smarteinc.assignment.booking.models.Ticket;

public class EmailUtils {
    public int sendTicketBookedMail(Ticket x) {
        try {
            //Assume Email Sent Successfully
            return x.getType();
        }catch (Exception e){
            return -1;
        }
    }
}
