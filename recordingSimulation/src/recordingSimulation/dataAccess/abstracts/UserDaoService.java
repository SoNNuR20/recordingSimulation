package recordingSimulation.dataAccess.abstracts;

import recordingSimulation.enitites.concteres.User;

public interface UserDaoService {
	
	void add(User user);
	boolean emailCheck(User user);
	boolean loginByCheck(String email, String password);

}
