package com.codingiscaring.solid.singleResponsability.exampleTwo.solution;

public class Main {
    public void run() {
        Email email = new Email();
        Content emailContent = email.getContent();
        StandardOutputPrinter standardOutputPrinter = new StandardOutputPrinter();
        standardOutputPrinter.printEmailContent(emailContent);
    }
}
