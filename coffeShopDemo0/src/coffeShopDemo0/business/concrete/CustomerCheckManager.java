package coffeShopDemo0.business.concrete;

import coffeShopDemo0.adapters.CustomerCheckService;
import coffeShopDemo0.entities.concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
