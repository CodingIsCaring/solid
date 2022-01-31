package com.codingiscaring.solid.singleResponsability.exampleThree.solution;

import java.util.Date;

public class Invoice {
    private final Logger fileLogger;
    private final MailSender emailSender;

    public Invoice() {
        fileLogger = new Logger();
        emailSender = new MailSender();
    }

    public void addInvoice() {
        try {
            fileLogger.info("Add method Start");
            // Here we need to write the Code for adding invoice
            // Once the Invoice has been added, then send the  mail
            emailSender.from = "emailfrom@xyz.com";
            emailSender.to = "emailto@xyz.com";
            emailSender.subject = "Single Responsibility Principle";
            emailSender.body = "A class should have only one reason to change";
            emailSender.sendEmail();
        } catch (Exception ex) {
            fileLogger.error("Error Occurred while Generating Invoice", ex);
        }
    }

    public void deleteInvoice() {
        try {
            //Here we need to write the Code for Deleting the already generated invoice
            fileLogger.info("Delete Invoice Start at @" + new Date());
        } catch (Exception ex) {
            fileLogger.error("Error Occurred while Deleting Invoice", ex);
        }
    }
}
