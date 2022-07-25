package com.codingiscaring.solid.singleResponsibility.exampleTwo.problem;

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
        System.out.println(content.toString());
    }
}
