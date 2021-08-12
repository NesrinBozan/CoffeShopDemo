package coffeShopDemo0.business.concrete;

import coffeShopDemo0.adapters.CustomerCheckService;
import coffeShopDemo0.entities.concrete.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService= customerCheckService;
	}
	
	public void save( Customer customer) 
	{
		if ( customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Hatalý Kullanýcý Giriþi.");
		}
	}
}
