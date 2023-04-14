import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.util.Date;

public class main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"nuray","altuğ",new Date(2000,9,25),"15331165274"));
    }
}
