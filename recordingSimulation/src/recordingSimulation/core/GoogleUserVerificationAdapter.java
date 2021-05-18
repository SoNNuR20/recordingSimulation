package recordingSimulation.core;

import recordingSimulation.core.abstracts.InputVerificationService;
import recordingSimulation.enitites.concteres.User;
import recordingSimulation.googleAuth.GoogleUserValid;

public class GoogleUserVerificationAdapter implements InputVerificationService {

	@Override
	public boolean isValid(User user) {
		GoogleUserValid googleValid =new GoogleUserValid();
		
		return googleValid.isValid();
	}

}
