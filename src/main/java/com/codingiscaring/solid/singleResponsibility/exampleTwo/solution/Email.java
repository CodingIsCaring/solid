package com.codingiscaring.solid.singleResponsibility.exampleTwo.solution;

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

    public Content getContent() {
        return this.content;
    }

}
