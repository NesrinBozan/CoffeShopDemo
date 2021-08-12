package coffeShopDemo0.business.concrete;

import coffeShopDemo0.business.abstruct.CustomerService;
import coffeShopDemo0.entities.concrete.Customer;

public class BaseCustomerManager  implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}

}
