package com.smarteinc.assignment.booking.utils;

import com.smarteinc.assignment.booking.models.Ticket;

public class TicketUtils {

        public int bookBusTicket (Ticket x){
            //Assume Ticket is Booked

            //Sending Email
            new ValidationUtils().validateAllFieldsPresent(x);
            return new EmailUtils().sendTicketBookedMail(x);

        }

        public int bookCarTicket (Ticket x){
            //Assume Ticket is Booked
            //Sending Email
            new ValidationUtils().validateAllFieldsPresent(x);
            return new EmailUtils().sendTicketBookedMail(x);

        }
    }

