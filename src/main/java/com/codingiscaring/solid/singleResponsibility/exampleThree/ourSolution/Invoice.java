package com.codingiscaring.solid.singleResponsibility.exampleThree.ourSolution;

import java.util.Date;

public class Invoice {

    private Date date;
    private long number;
    private String name;

    public Invoice(Date date, long number, String name) {
        this.date = date;
        this.number = number;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static Invoice mapFrom(InvoiceRequest invoiceRequest) {
        return new Invoice(new Date(invoiceRequest.getDate()),
                Long.valueOf(invoiceRequest.getNumber()),
                invoiceRequest.getName());
    }
}
