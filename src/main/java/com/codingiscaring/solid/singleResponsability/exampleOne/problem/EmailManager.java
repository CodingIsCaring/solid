package com.codingiscaring.solid.singleResponsability.exampleOne.problem;

import com.codingiscaring.solid.singleResponsability.exampleOne.Email;

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
