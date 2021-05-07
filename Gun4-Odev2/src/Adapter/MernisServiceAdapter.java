package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;


import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer){


       return false;
    }
}
