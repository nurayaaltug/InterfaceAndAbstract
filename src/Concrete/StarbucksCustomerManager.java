package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
     customerCheckService.CheckIfRealPerson();
     if(customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
     }
     throw new Exception("not a valid person");


    }





    }

