package com.codingiscaring.solid.singleResponsibility.exampleTwo.solution;

public class StandardOutputPrinter implements Printer {

    public void printEmailContent(Content content) {
        System.out.println(content.toString());
    }
}
