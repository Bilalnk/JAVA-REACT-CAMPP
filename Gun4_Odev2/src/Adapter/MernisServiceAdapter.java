package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer){

    	
    	KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
    	
    	boolean serviceResult=false;
    	
    	try {
    		
    		serviceResult = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
    		
		} catch (Exception e) {
			
			System.out.println("Not a valid person");
		}
    	    
       return serviceResult;
    }
}
