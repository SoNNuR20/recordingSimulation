package recordingSimulation.business.concteres;

import recordingSimulation.business.abstracts.UserService;
import recordingSimulation.core.abstracts.InputVerificationService;
import recordingSimulation.core.abstracts.ValidatorService;
import recordingSimulation.dataAccess.abstracts.UserDaoService;
import recordingSimulation.enitites.concteres.User;

public class UserManager implements UserService {

	InputVerificationService memberInformationValdation;
	UserDaoService userDaoService;
	ValidatorService validatorService;
	
	


	public UserManager(InputVerificationService memberInformationValdation, UserDaoService userDaoService,
			ValidatorService validatorService) {
		super();
		this.memberInformationValdation = memberInformationValdation;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
	    if (!memberInformationValdation.isValid(user)) {
		    System.out.println("User information is wrong. Registration failed.");
	    }else if (!userDaoService.emailCheck(user)) {
			System.out.println("This email address has been used before = "+user.getEmail()+" "+" Registration failed");
		}else {
			userDaoService.add(user);
			validatorService.sendVerificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if (userDaoService.loginByCheck(email, password)) {
			System.out.println("Login successful");
		}else {
			System.out.println("Username is wrong");
		}
		
	}

}
