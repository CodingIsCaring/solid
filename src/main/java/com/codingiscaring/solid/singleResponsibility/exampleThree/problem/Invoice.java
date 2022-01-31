package com.codingiscaring.solid.singleResponsibility.exampleThree.problem;

public class Invoice {

    public void addInvoice() {
        try {
            // Here we need to write the Code for adding invoice
            // Once the Invoice has been added, then send the  mail
            MailMessage mailMessage = new MailMessage("EMailFrom", "EMailTo", "EMailSubject", "EMailBody");
            this.sendInvoiceEmail(mailMessage);
        } catch (Exception ex) {
            //Error Logging
        }
    }

    public void deleteInvoice() {
        try {
            //Here we need to write the Code for Deleting the already generated invoice
        } catch (Exception ex) {
            //Error Logging
        }
    }

    public void sendInvoiceEmail(MailMessage mailMessage) {
        try {
            // Here we need to write the Code for Email setting and sending the invoice mail
        } catch (Exception ex) {
            //Error Logging
        }
    }
}
