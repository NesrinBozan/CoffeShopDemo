package coffeShopDemo0.adapters;

import coffeShopDemo0.entities.concrete.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
