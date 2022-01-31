package com.codingiscaring.solid.singleResponsability.exampleTwo.problem;

public class Email {
    Content content;

    public String getSender() {
		//...
        return "sender";
    }

    public String getSubject() {
		//...
        return "subject";
    }

    public void printContent() {
        // print the content already converted to String
        System.out.println(content.toString());
    }
}
