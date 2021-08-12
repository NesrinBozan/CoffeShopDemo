package coffeShopDemo0.adapters;

import java.rmi.RemoteException;

import coffeShopDemo0.entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		boolean result=true;
		try {
			result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}
	

}