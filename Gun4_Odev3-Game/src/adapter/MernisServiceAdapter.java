package adapter;

import abstracts.IUserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		
		KPSPublicSoap mernis = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			result = mernis.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName(), user.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			System.out.println("Hata "+ e.toString() );
		}
		
		return result;
	}

	
	

}
