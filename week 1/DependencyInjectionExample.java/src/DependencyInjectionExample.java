// Service Interface
interface CustomerRepository {
    void saveCustomer(String customerName);
}

// Service Implementation
class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void saveCustomer(String customerName) {
        System.out.println("Customer \"" + customerName + "\" saved successfully.");
    }
}

// Service Class
class CustomerService {

    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void addCustomer(String customerName) {
        repository.saveCustomer(customerName);
    }
}

// Main Class
public class DependencyInjectionExample {

    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.addCustomer("Sathwik");
    }
}