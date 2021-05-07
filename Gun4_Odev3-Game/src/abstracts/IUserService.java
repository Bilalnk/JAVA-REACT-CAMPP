package abstracts;

import entities.User;

public interface IUserService {
	
	void add(User user) throws Exception;
	
	void delete(User user) throws Exception;
	
	void update(User user) throws Exception;

}
