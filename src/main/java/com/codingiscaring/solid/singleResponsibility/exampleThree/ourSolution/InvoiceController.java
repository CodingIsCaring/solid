package com.codingiscaring.solid.singleResponsibility.exampleThree.ourSolution;

public class InvoiceController {

    public void addInvoice(String date, long number, String name) {
        // validate input data
        // convert to domain object
    }

    public void addInvoice(InvoiceRequest invoiceRequest) {
        // validate input data
        // convert to domain object (Invoice.java)
        Invoice invoice = Invoice.mapFrom(invoiceRequest);
        InvoiceService service = new InvoiceService();
        service.addInvoice(invoice);
    }

}
