package com.codingiscaring.solid.singleResponsibility.exampleOne.problem;

import com.codingiscaring.solid.singleResponsibility.exampleOne.Email;

public class EmailManager {
    public Boolean sendEmail(Email email) {
		// ...
        return true;
    }

    public void removeEmail(String id) {
		//...
    }

    public String findEmailBy(String sender) {
		//...
        return "my email";
    }
}
