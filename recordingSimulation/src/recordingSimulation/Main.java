package recordingSimulation;

import recordingSimulation.business.abstracts.UserService;
import recordingSimulation.business.concteres.UserManager;
import recordingSimulation.core.GoogleUserVerificationAdapter;
import recordingSimulation.core.concretes.EmailValidatorManager;
import recordingSimulation.core.concretes.InputVerification;
import recordingSimulation.dataAccess.concteres.UserDao;
import recordingSimulation.enitites.concteres.User;




public class Main {

	public static void main(String[] args) {
		
		
		  
		            User user1= new User(1,"Sonnur","Tayfuroðlu","sonnur@gmail.com","1234567sdf");
		            User user2= new User(2,"Gülzade","Odabaþ","gulzadeodbs52@gmail.com","gulzade159");
		            User user3 = new User(3,"Merve","Çakmak","merve40dilim@gmail.com","369852");

		            UserService userService =new UserManager(new InputVerification(), new UserDao(), new EmailValidatorManager());
		            		
		            userService.register(user1);

		            System.out.println("                                                     ");

		            userService.register(user1);

		            System.out.println("                                                      ");

		            userService.register(user2);

		            System.out.println("                                                      ");

		            userService.register(user3);

		            System.out.println("                                                      ");



		            UserService userService2 = new UserManager(new GoogleUserVerificationAdapter(), new UserDao(), new EmailValidatorManager());
		            userService2.register(user2);



		            System.out.println("                                                      ");

		            userService.login("sonnur12@gmail.com","111111111111");

		            System.out.println("                                                      ");

		            userService.login ("merckmk@gmail.com", "565154489a"); 






	}

}
