package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StrabucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StrabucksCustomerManager(ICustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }else{
            throw new Exception("Not a valid person");
        }
    }
}
