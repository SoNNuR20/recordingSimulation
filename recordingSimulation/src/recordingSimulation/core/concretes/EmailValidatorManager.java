package recordingSimulation.core.concretes;

import recordingSimulation.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationMail() {
		System.out.println("Your verification e-mail has been sent to your address.Please check your e-mail address");
		
	}

}
