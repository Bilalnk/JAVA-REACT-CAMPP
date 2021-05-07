package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {


    ICustomerCheckService _customerCheckService;

    public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
    	this._customerCheckService = _customerCheckService;
	}
    

    @Override
    public void save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }else{
        	System.out.println("Not a valid person");
            throw new Exception("Not a valid person");
        }
    }
	
}
