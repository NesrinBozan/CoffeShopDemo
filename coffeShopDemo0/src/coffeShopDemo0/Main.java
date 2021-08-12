package coffeShopDemo0;

import coffeShopDemo0.adapters.MernisServiceAdapter;
import coffeShopDemo0.business.concrete.BaseCustomerManager;
import coffeShopDemo0.business.concrete.StarbucksCustomerManager;
import coffeShopDemo0.entities.concrete.Customer;

public class Main {
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter()) ;
			
		customerManager.Save(new Customer(1,"Nesrin","Bozan",1999,"66666666666666"));
		}
	}

