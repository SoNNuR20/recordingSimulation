package recordingSimulation.dataAccess.concteres;

import java.util.ArrayList;
import java.util.List;

import recordingSimulation.dataAccess.abstracts.UserDaoService;
import recordingSimulation.enitites.concteres.User;

public class UserDao implements UserDaoService{

	List<User>users= new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" saved in the system");
		
	}

	@Override
	public boolean emailCheck(User user) {
		for (User u:users ) {
			if (u.getEmail()==user.getEmail()) {
				return false;
			}
			
		}
		return true;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for (User user:users) {
			if (user.getEmail()== email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

	

}
