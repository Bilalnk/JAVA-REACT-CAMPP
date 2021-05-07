package concrete;

import abstracts.IUserCheckService;
import abstracts.IUserService;
import entities.User;

public class UserManager implements IUserService{
	
	
	IUserCheckService userCheck;
	
	
	public UserManager(IUserCheckService userCheck) {
		this.userCheck = userCheck;
	}


	@Override
	public void add(User user) throws Exception {
		if(userCheck.CheckIfRealPerson(user)) {
			System.out.println("saved to db: "+ user.getFirstName());
		}else {
			throw new Exception("Not a valid person");
		}
		
	}


	@Override
	public void delete(User user) throws Exception {
		System.out.println(user.getFirstName()+ "sistemden silindi");
		
	}


	@Override
	public void update(User user) throws Exception {


		System.out.println(user.getFirstName()+"güncellendi");
		
	}



}
