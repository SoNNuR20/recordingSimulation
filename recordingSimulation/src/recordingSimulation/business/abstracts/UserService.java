package recordingSimulation.business.abstracts;

import recordingSimulation.enitites.concteres.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);

}
