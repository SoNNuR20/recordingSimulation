package recordingSimulation.core.concretes;


import java.util.regex.Pattern;

import recordingSimulation.core.abstracts.InputVerificationService;
import recordingSimulation.enitites.concteres.User;

public class InputVerification implements InputVerificationService {

	public boolean isValidEmail(String email) {
		String emailRegex ="^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		if(email == null) {
			return false;
		}
		return pat.matcher(email).matches();
	}
	
	public boolean isValidPassword(String password) {
		if (password == null || password.length() <6) {
			return false;
		}
		return true;
	}
	
	public boolean isValidString(String name) {
		
		if (name == null || name.length() < 2) {
			return false;
		}
		for (char c: name.toCharArray()) {
			if(Character.isDigit(c)) {
				return false;
			}
			
		}
		return true;	
	}
	
	@Override
	public boolean isValid(User user) {
		if(!isValidEmail(user.getEmail())) {
			System.out.println("You did not enter the appropriate email");
			return false;
		}
		if(!isValidString(user.getFirstName())) {
			System.out.println("Your name must contain at least 2 characters.");
			return false;
		}
		if(!isValidString(user.getLastName())) {
			System.out.println("Your surname must contain at least 2 characters");
			return false;
		}
		if (!isValidPassword(user.getPassword())) {
			System.out.println("The password must be at least 6 characters.");
			return false;
		}
		
		return true;
		
	}

}
