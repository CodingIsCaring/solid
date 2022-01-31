package com.codingiscaring.solid.singleResponsability.exampleTwo.solution;

public class StandardOutputPrinter {
    public void printEmailContent(Content content) {
        // print the content already converted to String
        System.out.println(content.toString());
    }
}
