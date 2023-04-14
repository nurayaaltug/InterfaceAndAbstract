package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.RIVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
       RIVKPSPublicSoap client = new RIVKPSPublicSoap();
       return client.TCKimlikNoDogrula(Long.valueOf((customer.NationalityId)), customer.FirstName.toUpperCase(), customer.LastName.toUpperCase(),customer.DateOfBirth.getYear());
    }

    @Override
    public boolean CheckIfRealPerson() {
        return false;
    }
}
