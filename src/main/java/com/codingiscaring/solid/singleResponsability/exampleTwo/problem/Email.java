package com.codingiscaring.solid.singleResponsability.exampleTwo.problem;

public class Email {
    Content content;

    public String getSender() {
		//...
        return "sendee";
    }

    public String getSubject() {
		//...
        return "subject";
    }

    public void printContent() {
        // conversion this.content to string
		// ...
        // print the content already converted to String
        System.out.println(contentInStringFormat);
    }

}
