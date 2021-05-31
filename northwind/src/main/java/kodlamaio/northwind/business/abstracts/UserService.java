package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilites.result.DataResult;
import kodlamaio.northwind.core.utilites.result.Result;

public interface UserService {

    Result add(User user);

    DataResult<User> findByEmail(String email);

}
