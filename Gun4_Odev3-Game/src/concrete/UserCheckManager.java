package concrete;

import abstracts.IUserCheckService;
import entities.User;

public class UserCheckManager implements IUserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		//Bu fake do�rulama
		return true;
	}

	

}
